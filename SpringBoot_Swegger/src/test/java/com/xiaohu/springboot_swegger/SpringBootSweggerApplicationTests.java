package com.xiaohu.springboot_swegger;

import com.xiaohu.springboot_swegger.entity.User;
import com.xiaohu.springboot_swegger.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootSweggerApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void findAll() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

}
