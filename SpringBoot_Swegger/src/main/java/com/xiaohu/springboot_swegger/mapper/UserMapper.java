package com.xiaohu.springboot_swegger.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaohu.springboot_swegger.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
