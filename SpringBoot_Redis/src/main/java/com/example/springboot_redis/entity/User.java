package com.example.springboot_redis.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

    private Integer id;
    private String name;
    private String age;


}
