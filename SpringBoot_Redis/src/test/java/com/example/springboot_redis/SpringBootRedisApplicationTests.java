package com.example.springboot_redis;

import com.example.springboot_redis.entity.User;
import com.example.springboot_redis.service.CacheService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static javax.swing.text.html.parser.DTDConstants.ID;
import static org.springframework.http.HttpHeaders.AGE;


@SpringBootTest
class SpringBootRedisApplicationTests {

    @Autowired
    private CacheService cacheService;

    @Test
    void add() {
        cacheService.add("test",1234);
    }

    @Test
    void addObject(){
        User user = User.builder()
                .id(ID)
                .name("小猫")
                .age(AGE)
                .build();
        cacheService.add(user.getId(),user);
    }


}
