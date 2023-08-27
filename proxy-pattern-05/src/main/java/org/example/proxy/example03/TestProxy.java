package org.example.proxy.example03;

import java.util.List;

/**
 * 测试CGLIB动态代理
 */
public class TestProxy {
    public static void main(String[] args) {
        // 目标对象
        UserServiceImpl userService = new UserServiceImpl();
        System.out.println(userService.getClass());

        // 代理对象
        UserServiceImpl proxy = (UserServiceImpl) new UserLogProxy(userService).getLogProxy();
        System.out.println(proxy.getClass());

        List<User> list = proxy.findUserList();
        System.out.println("用户信息：" + list);
    }
}
