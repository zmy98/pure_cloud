package com.pure.system.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * 用户注册参数
 *
 * @author zmy
 * @version V1.0
 * @since 2021-12-10 09:49:00
 */
@Data
@ApiModel("用户注册参数")
public class UserRegisterParam {

    /**
     * 1：出借人 2：借款人
     */
    @ApiModelProperty(value = "1：出借人 2：借款人", example = "1")
    @NotNull(message = "用户类型不为空")
    private Byte userType;

    /**
     * 手机号
     */
    @ApiModelProperty(value = "手机号", example = "13333700187")
    @NotEmpty(message = "手机号不为空")
    private String mobile;

    /**
     * 用户密码
     */
    @ApiModelProperty(value = "用户密码", example = "zmy123456")
    @NotEmpty(message = "用户密码不为空")
    private String password;

    /**
     * 用户昵称
     */
    @ApiModelProperty(value = "用户昵称", example = "pure")
    private String nickName;

    /**
     * 用户姓名
     */
    @ApiModelProperty(value = "用户姓名", example = "pure")
    private String name;

    /**
     * 身份证号
     */
    @ApiModelProperty(value = "身份证号")
    private String idCard;

    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱")
    private String email;

    /**
     * 微信用户标识openid
     */
    @ApiModelProperty(value = "微信用户标识openid")
    private String openid;

    /**
     * 头像
     */
    @ApiModelProperty(value = "头像")
    private String headImg;

    @ApiModelProperty(value = "验证码")
    @NotEmpty(message = "验证码不为空")
    private String code;
}
