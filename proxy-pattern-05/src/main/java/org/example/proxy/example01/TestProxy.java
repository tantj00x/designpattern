package org.example.proxy.example01;

/**
 * 测试类
 */
public class TestProxy {
    /**
     * 静态代理
     *      优点：可以在不修改目标类的前提下，扩展目标类的功能
     *      缺点：
     *          1.冗余，由于代理对象要实现和目标对象一致的接口，会产生很多的代理
     *          2.不易维护，一旦接口中增加方法，目标对象和代理对象都要进行修改
     */
    public void testStaticProxy() {
        // 目标类
        IUserDao userDao = new UserDaoImpl();
        // 代理对象
        UserDaoProxy proxy = new UserDaoProxy(userDao);
        proxy.save();
    }
}
