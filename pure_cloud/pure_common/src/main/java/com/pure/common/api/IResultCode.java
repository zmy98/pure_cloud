package com.pure.common.api;

import java.io.Serializable;

/**
 * 返回码接口
 *
 * @author zmy
 * @version V1.0
 * @since 2021-08-27 17:03:00
 */
public interface IResultCode extends Serializable {

    /**
     * 返回码
     * @return int
     */
    String getCode();

    /**
     * 返回信息
     * @return String
     */
    String getMsg();
}
