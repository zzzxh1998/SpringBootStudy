package com.xiaohu.springboot_helloworld_run_replace;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBootHelloWorldRunReplaceApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringBootHelloWorldRunReplaceApplication.class, args);
        SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringBootHelloWorldRunReplaceApplication.class);
        SpringApplication build = builder.build();
        build.setBannerMode(Banner.Mode.OFF);
        build.run(args);
    }

}


