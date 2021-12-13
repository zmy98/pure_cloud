package com.pure.common.exception;

/**
 * 通用异常
 *
 * @author zmy
 * @version V1.0
 * @since 2021-08-28 21:46:00
 */
public class PureException extends RuntimeException{

    private static final long serialVersionUID = -2204154739230628174L;

    private CommonErrorEnum commonErrorEnum;

    public PureException(String msg){
        super(msg);
    }

    public PureException(CommonErrorEnum commonErrorEnum){
        super(commonErrorEnum.getMsg());
        this.commonErrorEnum = commonErrorEnum;
    }

}
