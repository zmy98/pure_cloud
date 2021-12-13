package com.pure.system.model;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 用户基本信息
 *
 * @author zmy
 * @version V1.0
 * @since 2021-12-10 09:41:00
 */
@ApiModel(value = "用户基本信息")
@Data
@TableName(value = "user_info")
public class UserInfo implements Serializable {
    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "编号")
    private Long id;

    /**
     * 1：出借人 2：借款人
     */
    @TableField(value = "user_type")
    @ApiModelProperty(value = "1：出借人 2：借款人")
    private Byte userType;

    /**
     * 手机号
     */
    @TableField(value = "mobile")
    @ApiModelProperty(value = "手机号")
    private String mobile;

    /**
     * 用户密码
     */
    @TableField(value = "`password`")
    @ApiModelProperty(value = "用户密码")
    private String password;

    /**
     * 用户昵称
     */
    @TableField(value = "nick_name")
    @ApiModelProperty(value = "用户昵称")
    private String nickName;

    /**
     * 用户姓名
     */
    @TableField(value = "`name`")
    @ApiModelProperty(value = "用户姓名")
    private String name;

    /**
     * 身份证号
     */
    @TableField(value = "id_card")
    @ApiModelProperty(value = "身份证号")
    private String idCard;

    /**
     * 邮箱
     */
    @TableField(value = "email")
    @ApiModelProperty(value = "邮箱")
    private String email;

    /**
     * 微信用户标识openid
     */
    @TableField(value = "openid")
    @ApiModelProperty(value = "微信用户标识openid")
    private String openid;

    /**
     * 头像
     */
    @TableField(value = "head_img")
    @ApiModelProperty(value = "头像")
    private String headImg;

    /**
     * 绑定状态（0：未绑定，1：绑定成功 -1：绑定失败）
     */
    @TableField(value = "bind_status")
    @ApiModelProperty(value = "绑定状态（0：未绑定，1：绑定成功 -1：绑定失败）")
    private Byte bindStatus;

    /**
     * 借款人认证状态（0：未认证 1：认证中 2：认证通过 -1：认证失败）
     */
    @TableField(value = "borrow_auth_status")
    @ApiModelProperty(value = "借款人认证状态（0：未认证 1：认证中 2：认证通过 -1：认证失败）")
    private Byte borrowAuthStatus;

    /**
     * 绑定账户协议号
     */
    @TableField(value = "bind_code")
    @ApiModelProperty(value = "绑定账户协议号")
    private String bindCode;

    /**
     * 用户积分
     */
    @TableField(value = "integral")
    @ApiModelProperty(value = "用户积分")
    private Integer integral;

    /**
     * 状态（0：锁定 1：正常）
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value = "状态（0：锁定 1：正常）")
    private Byte status;

    /**
     * 创建时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    /**
     * 逻辑删除(1:已删除，0:未删除)
     */
    @TableField(value = "is_deleted", fill = FieldFill.INSERT)
    @ApiModelProperty(value = "逻辑删除(0:已删除，1:未删除)")
    @TableLogic
    private Byte isDeleted;

    private static final long serialVersionUID = 1L;
}