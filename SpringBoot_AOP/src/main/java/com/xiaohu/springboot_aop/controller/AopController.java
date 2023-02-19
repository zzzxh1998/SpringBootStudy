package com.xiaohu.springboot_aop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aopcontroller")
public class AopController {

    @RequestMapping(value = "/sayhello",method = RequestMethod.GET)
    public String sayHello(String name){
        return "hello" + name;
    }

}
