package com.xiaohu.springboot_tracsactional.controller;

import com.xiaohu.springboot_tracsactional.entity.User;
import com.xiaohu.springboot_tracsactional.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("/usercontroller")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    @RequestMapping("/saveuser")
    public User saveUser(){
        User user = User.builder()
                .id(BigInteger.valueOf(9))
                .name("11")
                .age(11)
                .password("11")
                .username("11")
                .build();
        userMapper.insert(user);
        int i = 1 / 0;
        return user;
    }

}
