package com.xiaohu.springboot_restful.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @GetMapping(value = "/user/{id}/{age}")
    public Object User(@PathVariable("id") Integer id,@PathVariable("age") Integer age){

        Map<String,Object> map = new HashMap<>();
        map.put("id",id);
        map.put("age",age);
        return map;
    }
    @DeleteMapping(value = "/student/detail/{id}/{status}")
    public Object student2(@PathVariable("id") Integer id,
                           @PathVariable("status") Integer status) {
        Map<String,Object> map=new HashMap<>();
        map.put("id",id);
        map.put("status",status);
        return map;
    }


}
