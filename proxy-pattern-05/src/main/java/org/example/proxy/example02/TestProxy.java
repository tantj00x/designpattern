package org.example.proxy.example02;

import org.example.proxy.example01.IUserDao;
import org.example.proxy.example01.UserDaoImpl;

/**
 * 测试类
 */
public class TestProxy {
    public static void main(String[] args) {
        // 创建目标类
        IUserDao userDao = new UserDaoImpl();
        // 目标对象的信息
        System.out.println(userDao.getClass());
        // 获取代理对象
        IUserDao proxy = (IUserDao) new ProxyFactory(userDao).getProxyInstance();
        System.out.println(proxy.getClass());
        // 代理方法
        proxy.save();

        while (true){}
    }
}
