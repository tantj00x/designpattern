package org.example.singleton;

/**
 * 单例模式-懒汉式（线程安全）
 * 使用synchronized锁，锁住创建单例对象的方法，防止多个线程同时调用
 * 缺点：因为对getInstance()方法加了锁，会导致这个函数的并发度很低
 */
public class Singleton_03 {

    /**
     * 1.私有构造方法
     */
    private Singleton_03() {
    }

    /**
     * 2.在本类中创建私有静态的全局对象
     */
    private static Singleton_03 instance;

    /**
     * 3.通过添加synchronized保证多线程模式下的单例对象的唯一性
     */
    public static synchronized Singleton_03 getInstance() {
        // instance为空去创建实例对象，初始化实例对象
        if (instance == null) {
            instance = new Singleton_03();
        }
        return instance;
    }
}
