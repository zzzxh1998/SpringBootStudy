package com.xiaohu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
* 这个类在实际开发中 这样写是不规范的
* */
@Controller
public class LogoutController {

    @RequestMapping("logout.html")
    public String logout(){
        return "logout";
    }
}
