package org.example.singleton;

/**
 * 单例模式-静态内部类(懒加载形式)----推荐使用静态内部类实现单例模式
 * 根据静态内部类的特性（在静态内部类中创建单例对象，静态内部类只有在使用到的时候才会创建、加载，外部类不影响静态内部类）同时解决了延时加载，线程安全的问题，并且代码更加简洁
 */
public class Singleton_05 {
    /**
     * 私有化构造方法
     */
    private Singleton_05() {

    }

    /**
     * 创建静态内部类
     */
    private static class SingletonHandler {
        // 在静态内部类中创建单例，在装载内部类的时候，才会创建单例对象
        // 线程安全由JVM来实现，因为类是JVM加载的
        private static Singleton_05 instance = new Singleton_05();
    }

    public static Singleton_05 getInstance() {
        return SingletonHandler.instance;
    }
}
