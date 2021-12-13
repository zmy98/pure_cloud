package com.pure.common.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 返回参数包装类
 *
 * @author zmy
 * @version V1.0
 * @since 2021-08-27 17:14:00
 */
@Data
@ApiModel("返回参数包装类")
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "状态码", required = true)
    private String code;

    @ApiModelProperty(value = "消息内容", required = true)
    private String msg;

    @ApiModelProperty(value = "业务数据")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    private Result(String code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    /**
     * 成功：resultCode状态码, msg消息内容, data业务数据
     * @param <T> 泛型参数
     * @return Result
     */
    public static <T> Result<T> success(){
        return new Result<>(ResultCode.SUCCESS.getCode(),null, ResultCode.SUCCESS.getMsg());
    }

    public static <T> Result<T> success(IResultCode resultCode) {
        return new Result<>(resultCode.getCode(), null, resultCode.getMsg());
    }

    public static <T> Result<T> success(String msg){
        return new Result<>(ResultCode.SUCCESS.getCode(), null, msg);
    }

    public static <T> Result<T> success(T data, String msg){
        return new Result<>(ResultCode.SUCCESS.getCode(), data, msg);
    }

    public static <T> Result<T> success(IResultCode resultCode, T data){
        return new Result<>(resultCode.getCode(), data, resultCode.getMsg());
    }

    /**
     * 失败：resultCode状态码, msg消息内容
     * @param <T> 泛型参数
     * @return Result
     */
    public static <T> Result<T> fail(){
        return new Result<>(ResultCode.FAILURE.getCode(), null, ResultCode.FAILURE.getMsg());
    }

    public static <T> Result<T> fail(IResultCode resultCode){
        return new Result<>(resultCode.getCode(), null, resultCode.getMsg());
    }

    public static <T> Result<T> fail(String msg){
        return new Result<>(ResultCode.FAILURE.getCode(), null, msg);
    }

    public static <T> Result<T> condition(boolean flag){
        return flag ? success() : fail();
    }

}
