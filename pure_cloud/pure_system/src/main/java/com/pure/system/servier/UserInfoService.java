package com.pure.system.servier;

import com.pure.system.model.UserInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pure.system.param.UserRegisterParam;

/**
 * 用户基本信息
 *
 * @author zmy
 * @version V1.0
 * @since 2021-12-10 09:41:00
 */
public interface UserInfoService extends IService<UserInfo> {

    /**
     * 用户注册
     *
     * @param registerParam 注册参数
     * @return 是否成功
     */
    boolean userRegister(UserRegisterParam registerParam);
}
