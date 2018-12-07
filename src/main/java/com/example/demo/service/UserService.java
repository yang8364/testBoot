package com.example.demo.service;


import com.example.demo.model.User;

/**
 * Created by yy on 2018/12/5.
 * Smile Waits For You
 */
public interface UserService {
    int addUser(User user);
    User selectByPrimaryKey(String id);
    User getUser(User user);
}


