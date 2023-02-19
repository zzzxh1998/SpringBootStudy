package com.xiaohu.springboot_swegger;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@MapperScan("com.xiaohu.springboot_swegger.mapper")
public class SpringBootSweggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSweggerApplication.class, args);
    }

}
