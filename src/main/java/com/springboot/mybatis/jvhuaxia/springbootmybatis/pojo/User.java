package com.springboot.mybatis.jvhuaxia.springbootmybatis.pojo;

import java.util.StringJoiner;

public class User {

  private int id;
  private String name;
  private String password;

  public User() {

  }

  public User(int id, String name, String password) {
    this.id = id;
    this.name = name;
    this.password = password;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
        .add("id=" + id)
        .add("name='" + name + "'")
        .add("password='" + password + "'")
        .toString();
  }
}
