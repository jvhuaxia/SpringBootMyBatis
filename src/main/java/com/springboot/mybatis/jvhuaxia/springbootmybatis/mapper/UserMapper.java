package com.springboot.mybatis.jvhuaxia.springbootmybatis.mapper;

import com.springboot.mybatis.jvhuaxia.springbootmybatis.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

  User getUser(int id);
}
