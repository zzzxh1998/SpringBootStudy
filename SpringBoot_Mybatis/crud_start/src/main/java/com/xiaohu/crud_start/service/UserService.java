package com.xiaohu.crud_start.service;

import com.xiaohu.crud_start.entity.User;

public interface UserService extends BaseService<User>{
    User findByName(String name);

}
