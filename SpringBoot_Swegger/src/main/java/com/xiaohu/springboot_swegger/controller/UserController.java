package com.xiaohu.springboot_swegger.controller;

import com.xiaohu.springboot_swegger.entity.User;
import com.xiaohu.springboot_swegger.mapper.UserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@Api(value = "测试接口",tags = "用户管理相关的接口",description = "用户测试接口")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/findall")
    //方法参数说明，name参数名；value参数说明，备注；dataType参数类型；required 是否必传；defaultValue 默认值
    @ApiImplicitParam(name = "user",value = "新增用户数据")
    @ApiOperation(value = "添加用户",notes = "添加用户")
    public List<User> saveUser(User user){
        List<User> users = userMapper.selectList(null);
        return users;
    }
}
