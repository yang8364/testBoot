package com.example.demo.model;


import com.fasterxml.jackson.databind.util.JSONPObject;

import java.util.HashMap;
import java.util.Map;

public class User {
    private String id;

    private String userName;

    private String passWord;

    public void setId(String id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        Map map = new HashMap();

        map.put("id",id);
        map.put("userName" ,userName);
        map.put("passWord",passWord);
        return map.toString();
    }
}