package com.xieps.spring.start.service.impl;

import com.xieps.spring.start.dao.UserDao;
import com.xieps.spring.start.dao.impl.UserDaoImpl;
import com.xieps.spring.start.dao.impl.UserDaoSQLImpl;

/**
 * @author xieps
 * @version 1.0
 * @date 2021/10/13 23:31
 */
public class UserServiceImpl implements UserDao {

    //原始方法
    //private UserDao userDao = new UserDaoImpl();
    //private UserDao userDao = new UserDaoSQLImpl();

    //改进方法

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUserInfo() {
        userDao.getUserInfo();
    }
}
