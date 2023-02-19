package com.xiaohu.springboot_tracsactional.entity;

import lombok.Builder;
import lombok.Data;

import java.math.BigInteger;

@Data
@Builder
public class User {
    private BigInteger id;
    private String name;
    private Integer age;
    private String password;
    private String username;
}
