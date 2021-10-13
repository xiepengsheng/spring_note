package com.xieps.spring.start;

import com.xieps.spring.start.dao.impl.UserDaoImpl;
import com.xieps.spring.start.dao.impl.UserDaoSQLImpl;
import com.xieps.spring.start.service.impl.UserServiceImpl;
import org.junit.Test;

/**
 * @author xieps
 * @version 1.0
 * @date 2021/10/13 23:33
 */
public class MyTest {

    @Test
    public void testUser(){

        //原始方法
        //UserServiceImpl userService = new UserServiceImpl();
        //userService.getUserInfo();


        //改进后的方法 spring的控制反转的原型
        //把dao接口变成实现类的成员变量 依靠set方法注入  实现动态的变更
        //把变更的控制者由程序员转换成被动的接受者  达到解耦的目的
        UserServiceImpl userService = new UserServiceImpl(new UserDaoSQLImpl());
        userService.getUserInfo();

        UserServiceImpl userService1 = new UserServiceImpl(new UserDaoImpl());
        userService1.getUserInfo();
    }

}
