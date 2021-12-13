package com.pure.system.servier.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.pure.base.config.redis.RedisService;
import com.pure.common.constant.GlobalConstant;
import com.pure.common.exception.PureAssert;
import com.pure.system.param.UserRegisterParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pure.system.dao.UserInfoDao;
import com.pure.system.model.UserInfo;
import com.pure.system.servier.UserInfoService;

/**
 * 用户基本信息
 *
 * @author zmy
 * @version V1.0
 * @since 2021-12-10 09:41:00
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoDao, UserInfo> implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Autowired
    private RedisService redisService;

    @Override
    public boolean userRegister(UserRegisterParam registerParam) {

        redisService.setObject("qwe", "test");

        //验证码校验
        String code = (String) redisService.getObject("register" + registerParam.getMobile());
        PureAssert.notEquals(registerParam.getCode(), code, "验证码错误");

        //手机号重复校验
        LambdaQueryWrapper<UserInfo> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(UserInfo::getMobile, registerParam.getMobile());
        queryWrapper.last(GlobalConstant.LIMIT_ONE);
        PureAssert.notNull(this.getOne(queryWrapper), "手机号已存在");

        UserInfo userInfo = new UserInfo();
        BeanUtil.copyProperties(registerParam, userInfo);
        return this.save(userInfo);
    }
}
