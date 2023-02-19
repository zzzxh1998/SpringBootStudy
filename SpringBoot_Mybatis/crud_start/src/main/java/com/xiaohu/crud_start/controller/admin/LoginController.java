package com.xiaohu.crud_start.controller.admin;

import com.xiaohu.crud_start.entity.Result;
import com.xiaohu.crud_start.entity.User;
import com.xiaohu.crud_start.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;


    /*
    * 登陆
    * */
    @RequestMapping("/login")
    @ResponseBody
    public Result login(@RequestParam("username") String username,@RequestParam("password") String password){
        System.out.println("username: " + username + ", password: " + password);
        User user = userService.findByName(username);
        if(user != null){
            if(user != null){
                if(user.getPassword().equals(password)){
                    ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
                    attributes.getRequest().getSession().setAttribute("user", user); //将登陆用户信息存入到session域对象中
                    return new Result(true,user.getUsername());
                }
            }
        }
        return new Result(false,"登陆失败");
    }

    /*
    * 注销
    * */
    @RequestMapping("/logout")
    public String logout(){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        attributes.getRequest().getSession().removeAttribute("user");
        return "home/login";
    }


    /*
    * 注册
    * */
    @ResponseBody
    @RequestMapping("/register")
    public Result register(@RequestParam("username") String username,@RequestParam("password") String password){
        try{
            userService.create(new User(username,password));
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            attributes.getRequest().getSession().setAttribute("user",new User(username,password));//将登陆用户信息存入到session域对象中
            return new Result(true,username);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new Result(false,"发生未知错误");
    }


    /*
    * 登陆页
    * */
    @GetMapping("/login")
    public String login(){
        return "/home/login";
    }

    /*
    * 注册页面
    * */
    @GetMapping("/register")
    public String register(){
        return "/home/register";
    }



}
