package com.pure.common.exception;

import com.pure.common.api.IResultCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

/**
 * 统一异常处理错误码表
 *
 * @author zmy
 * @version V1.0
 * @since 2021-08-28 21:59:00
 */
@Getter
@AllArgsConstructor
public enum CommonErrorEnum implements IResultCode, Serializable {

    /**
     * 错误码
     */
    SUCCESS("00000", "成功"),
    CLIENT_ERROR("A0001", "用户端错误"),
    C_USER_ERROR("A0100", "用户相关错误"),
    USER_LOGIN_ERROR("A0101", "用户登录异常"),
    USER_ACCOUNT_NO_EXIST("A0102", "用户账户不存在"),
    USER_ACCOUNT_FREEZE("A0103", "用户账户被冻结"),
    USER_ACCOUNT_INVALID("A0104", "用户账户已作废"),
    USER_NAME_OR_PASSWORD_ERROR("A0105", "账号或密码有误"),
    USER_NO_LOGIN("A0106", "用户未登录"),
    USER_PASSWORD_LIMIT("A0107", "用户密码输入次数超限"),
    USER_REGISTER_ERROR("A0110", "用户注册错误"),
    USER_ACCOUNT_EXIST("A0111", "账号已存在"),
    USER_NAME_EXIST("A0112", "用户名已存在"),
    USER_PHONE_EXIST("A0113", "用户手机号已存在"),
    USER_NAME_NULL("A0114", "用户名不能为空"),
    USER_NAME_VALID_ERROR("A0115", "用户名校验失败"),
    USER_PASSWORD_ERROR("A0120", "密码校验失败"),
    USER_PASSWORD_LENGTH_ERROR("A0121", "密码长度有误"),
    USER_PASSWORD_STRENGTH_ERROR("A0122", "密码强度不够"),
    USER_PIN_ERROR("A0130", "验证码错误"),
    USER_SMS_PIN_ERROR("A0131", "短信验证码输入错误"),
    USER_EMAIL_PIN_ERROR("A0132", "邮件校验码输入错误"),
    C_PARAM_ERROR("A0200", "输入参数不合法"),
    PARAM_ILLEGAL_ERROR("A0201", "输入参数包含非法信息"),
    PARAM_ILLEGAL_URL_ERROR("A0202", "输入参数包含非法链接"),
    PARAM_NULL_ERROR("A0210", "请求必填参数为空"),
    PARAM_FORMAT_ERROR("A0220", "请求参数格式有误"),
    PARAM_LENGTH_ERROR("A0230", "请求参数长度有误"),
    C_AUTHORITY_ERROR("A0300", "访问权限异常"),
    AUTHORITY_NO_GRANT("A0301", "访问未授权"),
    AUTHORITY_GRANT_REFUSE("A0303", "用户授权申请被拒绝"),
    AUTHORITY_EXPIRE("A0311", "授权已过期"),
    C_FILE_ERROR("A0400", "用户上传文件异常"),
    FILE_FORMAT_ERROR("A0401", "用户上传文件类型不匹配"),
    FILE_FORMAT_ILLEGAL_ERROR("A0402", "用户上传文件类型不合法"),
    FILE_TOO_LARGE_ERROR("A0410", "用户上传文件太大"),
    FILE_IMG_TOO_LARGE_ERROR("A0411", "用户上传图片太大"),
    FILE_VIDEO_TOO_LARGE_ERROR("A0412", "用户上传视频太大"),
    FILE_ZIP_TOO_LARGE_ERROR("A0413", "用户上传压缩包太大"),
    FILE_EXCEL_TOO_LARGE_ERROR("A0414", "用户上传excel太大"),
    FILE_PDF_TOO_LARGE_ERROR("A0415", "用户上传pdf太大"),
    C_RESOURSE_ERROR("A0500", "资源异常"),
    RESOURSE_NOT_FOUND_ERROR("A0501", "资源不存在"),
    SERVER_ERROR("B0001", "服务端错误"),
    S_SQL_ERROR("B0100", "数据库异常"),
    SQL_EXISTED_ERROR("B0105", "记录已存在"),
    SQL_NOT_EXISTED_ERROR("B0106", "记录不存在"),
    S_PROGRAM_ERROR("B0200", "服务端程序异常"),
    PROGRAM_ARITHMETIC_ERROR("B0201", "数值计算异常"),
    PROGRAM_CLASS_CAST_ERROR("B0202", "类型转换异常"),
    PROGRAM_INDEX_EXCEPTION("B0203", "下标越界异常"),
    PROGRAM_NULL_POINTER_EXCEPTION("B0204", "空指针异常"),
    PROGRAM_NUMBER_FORMAT_EXCEPTION("B0205", "转换数字格式异常"),
    PROGRAM_CLASS_NOT_FOUND_EXCEPTION("B0206", "指定类不存在"),
    PROGRAM_NO_SUCH_METHOD_EXCEPTION("B0207", "指定方法不存在"),
    S_IO_EXCEPTION("B0300", "IO异常"),
    S_FILE_ERROR("B0501", "文件操作异常"),
    FILE_NO_FOUND_ERROR("B0502", "文件未存在异常"),
    FILE_CHECK_EXCEPTION("B0503", "文件格式解析异常"),
    THIRD_ERROR("C0001", "第三方错误"),
    T_RES_ERROR("C0100", "第三方接口返回数据有误"),
    T_NETWORK_ERROR("C0200", "第三方接口网络异常"),
    NETWORK_OVERTIME_ERROR("C0201", "第三方接口响应超时"),
    OTHER_ERROR("99999","系统异常");

    private final String code;

    private final String msg;

}
