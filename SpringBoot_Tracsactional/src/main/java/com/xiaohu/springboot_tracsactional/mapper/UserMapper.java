package com.xiaohu.springboot_tracsactional.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaohu.springboot_tracsactional.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
