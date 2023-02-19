package com.xiaohu.springboot_jpa.repository;

import com.xiaohu.springboot_jpa.entity.j_user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface juserRepository extends JpaRepository<j_user,Long> {
    public List<j_user> findAll();
}
