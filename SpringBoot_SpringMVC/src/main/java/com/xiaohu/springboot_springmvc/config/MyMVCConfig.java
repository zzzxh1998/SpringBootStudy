package com.xiaohu.springboot_springmvc.config;

import org.springframework.boot.web.servlet.view.MustacheViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

@Configuration
public class MyMVCConfig implements WebMvcConfigurer {

    //实现了视图解析器接口的类，我们把它看作视图解析器
    @Bean
    public ViewResolver myViewResolve(){
        return new MyViewResolver();
    }

    public static class MyViewResolver implements ViewResolver{

        @Override
        public View resolveViewName(String viewName, Locale locale) throws Exception {
            return null;
        }
    }

    //URI到视图的映射
    //视图跳转,打开浏览器访问 .../,然后就可以跳转到test.html页面
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/xiaohu").setViewName("test");
    }

    //拦截器
    public void addinterceptors(InterceptorRegistry registry){}

    //跨域访问配置
    public void addCorsRegistry(CorsRegistry registry){}

    //格式化
    public void addFormatterRegistry(FormatterRegistry registry){}

}
