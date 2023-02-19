package com.xiaohu.dao;

import com.xiaohu.entity.Role;
import com.xiaohu.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    //根据用户名返回用户方法
    User loadUserByUsername(String username);

    //根据用户id查询角色
    List<Role> getRolesByUid(Integer uid);
}
