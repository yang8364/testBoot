package com.example.demo.service.impr;


import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yy on 2018/12/5.
 * Smile Waits For You
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public User selectByPrimaryKey(String id) {
        return userMapper.selectByPrimaryKey(id);
    }
    @Override
    public User getUser(User user) {
        return userMapper.getUser(user);
    }
}
