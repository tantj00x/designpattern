package org.example.proxy.example01;

/**
 * 代理类
 */
public class UserDaoProxy implements IUserDao{

    private IUserDao target;

    public UserDaoProxy(IUserDao target) {
        this.target = target;
    }

    @Override
    public void save() {
        // 拓展额外功能
        System.out.println("开启事务");
        target.save();
        System.out.println("提交事务");
    }
}
