package com.example.demo.mapper;


import com.example.demo.model.User;

public interface UserMapper {

    int insert(User record);
    User selectByPrimaryKey(String id);

    User getUser(User user);
}