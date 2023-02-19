package com.xiaohu.springboot_springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
public class UserController {

    @RequestMapping("/hello")
    public String test(Model model){
        model.addAttribute("name","MarkerJava");
        model.addAttribute("user", Arrays.asList("merk","java"));
        return "test";
    }
}
