package com.xiaohu.crud_start.controller.admin;

import com.xiaohu.crud_start.entity.User;
import com.xiaohu.crud_start.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    /*
    * 查询所有
    * */
    @RequestMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }
}
