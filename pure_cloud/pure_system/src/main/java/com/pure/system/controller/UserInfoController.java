package com.pure.system.controller;

import com.pure.common.api.Result;
import com.pure.system.param.UserRegisterParam;
import com.pure.system.servier.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户基本信息
 *
 * @author zmy
 * @version V1.0
 * @since 2021-12-10 09:45:00
 */
@Api(tags = "用户基本信息")
@RestController
@RequestMapping("/user_info")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @ApiOperation("用户注册")
    @PostMapping("/register")
    public Result<Boolean> userRegister(@RequestBody UserRegisterParam registerParam){
        return Result.condition(userInfoService.userRegister(registerParam));
    }
}
