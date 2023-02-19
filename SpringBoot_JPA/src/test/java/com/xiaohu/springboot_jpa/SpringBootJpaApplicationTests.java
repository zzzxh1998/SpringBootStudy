package com.xiaohu.springboot_jpa;

import com.xiaohu.springboot_jpa.entity.j_user;
import com.xiaohu.springboot_jpa.repository.juserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootJpaApplicationTests {

    @Autowired
    private juserRepository  juserRepository;

    @Test
    void test1() {
        List<j_user> jUsers = juserRepository.findAll();
        System.out.println(jUsers);
    }

}
