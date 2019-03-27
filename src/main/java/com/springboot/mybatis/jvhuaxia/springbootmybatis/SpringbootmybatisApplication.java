package com.springboot.mybatis.jvhuaxia.springbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

@SpringBootApplication
@MapperScan(value = "com.springboot.mybatis.jvhuaxia.springbootmybatis.mapper",annotationClass = Repository.class)
public class SpringbootmybatisApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootmybatisApplication.class, args);
  }

}
