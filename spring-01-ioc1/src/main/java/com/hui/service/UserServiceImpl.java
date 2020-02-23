package com.hui.service;

import com.hui.dao.UserDao;
import com.hui.dao.UserDaoImpl;
import com.hui.dao.UserDaoMySqlImpl;

public class UserServiceImpl {

    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public void getUser(){
        userDao.getUser();
    }
}
