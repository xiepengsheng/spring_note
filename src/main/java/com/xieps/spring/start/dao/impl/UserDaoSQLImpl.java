package com.xieps.spring.start.dao.impl;

import com.xieps.spring.start.dao.UserDao;

/**
 * @author xieps
 * @version 1.0
 * @date 2021/10/13 23:35
 */
public class UserDaoSQLImpl implements UserDao {

    @Override
    public void getUserInfo() {

        System.out.println("获取sql数据库用户信息.................");

    }
}
