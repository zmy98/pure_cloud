package com.pure.common.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 返回码实现
 *
 * @author zmy
 * @version V1.0
 * @since 2021-08-27 17:03:00
 */
@Getter
@AllArgsConstructor
public enum ResultCode implements IResultCode {

	/**
	 * 操作成功
	 */
	SUCCESS("200", "操作成功"),
	/**
	 * 业务异常
	 */
	FAILURE("400", "操作失败");

	/**
	 * 状态码
	 */
	final String code;
	/**
	 * 消息内容
	 */
	final String msg;

}
