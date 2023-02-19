package com.xiaohu.springboot_tracsactional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringBootTracsactionalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTracsactionalApplication.class, args);
	}

}
