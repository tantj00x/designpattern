package org.example.singleton;

/**
 * 单例模式-懒汉式（线程不安全）
 * 特点：支持懒加载，延时加载，只有调用 getInstance 方法时，才会创建对象
 * 缺点：线程不安全，多线程情况下，获取的实例不一致
 */
public class Singleton_02 {

    /**
     * 1.私有构造方法
     */
    private Singleton_02() {
    }

    /**
     * 2.在本类中创建私有静态的全局对象
     */
    private static Singleton_02 instance;

    /**
     * 3.通过判断对象是否被初始化，来选择是否创建对象
     */
    public static Singleton_02 getInstance() {
        // instance为空去创建实例对象，初始化实例对象
        if (instance == null) {
            instance = new Singleton_02();
        }
        return instance;
    }
}
