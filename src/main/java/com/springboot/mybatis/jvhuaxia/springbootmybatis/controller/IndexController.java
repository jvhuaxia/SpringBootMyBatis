package com.springboot.mybatis.jvhuaxia.springbootmybatis.controller;

import com.springboot.mybatis.jvhuaxia.springbootmybatis.mapper.UserMapper;
import com.springboot.mybatis.jvhuaxia.springbootmybatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

  @Autowired
  UserMapper userMapper;

  @RequestMapping("/user")
  public User user(Integer id) {
    return userMapper.getUser(id);
  }
}
