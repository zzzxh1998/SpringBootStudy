package com.xiaohu.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.util.matcher.AndRequestMatcher;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.OrRequestMatcher;

import javax.sql.DataSource;

@Configuration
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {

//    @Bean
//    public UserDetailsService userDetailsService(){
//        InMemoryUserDetailsManager userDetailsService = new InMemoryUserDetailsManager();
//        userDetailsService.createUser(User.withUsername("aaa").password("{noop}123").roles("admin").build());
//        return userDetailsService;
//    }
//
//    @Autowired
//    public void initialize(AuthenticationManagerBuilder builder) throws Exception {
//        System.out.println("springboot 默认配置:"+builder);
//        builder.userDetailsService(userDetailsService());
//    }
//
//    //作用：用来将自定义AuthenticationManager在工厂中进行暴露，可以在任何位置注入
//    public AuthenticationManager authenticationManagerBean() throws Exception{
//        return super.authenticationManagerBean();
//    }


    //自定义AuthenticationManager
    @Override
    public void configure(AuthenticationManagerBuilder builder) {
        System.out.println("自定义AuthenticationManager："+builder);
    }

    //作用：用来将自定义AuthenticationManager在工厂中进行暴露，可以在任何位置注入
    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception{
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .mvcMatchers("/login.html").permitAll()
                .mvcMatchers("/index").permitAll() //放行资源写在任何前面
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login.html")//指定默认的登陆页面    注意：一旦自定义登陆页面以后必须只能登陆url
                .loginProcessingUrl("/doLogin")//与上面那个一起使用  指定处理登陆的url
                .usernameParameter("uname")
                .passwordParameter("passwd")
//                .successForwardUrl("/hello") //认证成功 forward跳转成功
//                .defaultSuccessUrl("") //也是认证成功之后的跳转 重定向形式
                .successHandler(new MyAuthenticationSuccessHandler()) //认证成功时处理 前后端分离解决方案
//                .failureForwardUrl("/login.html") //认证失败之后 forward跳转
//                .failureUrl("/login.html") //认证失败之后，redirect跳转
                .failureHandler(new MyAuthenticationFailureHandler())//用来自定义认证失败之后处理，前后端分离解决方案
                .and()
                .logout()
//                .logoutUrl("/logout") //指定注销登陆 url 默认请求方式必须：GET
                .logoutRequestMatcher(new OrRequestMatcher(
                        new AntPathRequestMatcher("/aa","GET"),
                        new AntPathRequestMatcher("/bb","POST")
                ))
                .invalidateHttpSession(true) //默认  会话失效
                .clearAuthentication(true)  //默认 清除 认证标记
//                .logoutSuccessUrl("/login.html") //默认  注销登陆 成功之后跳转页面
                .logoutSuccessHandler(new MyLogoutSuccessHander())    //注销登陆成功之后处理
                .and()
                .csrf().disable();//禁止csrf 跨站请求保护
    }
}
