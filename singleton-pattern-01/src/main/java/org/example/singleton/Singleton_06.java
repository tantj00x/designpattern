package org.example.singleton;

/**
 * 反射对于单例的破坏，解决办法
 * 缺点：这种方式使代码简洁性遭到破坏,设计不够优雅.
 */
public class Singleton_06 {
    /**
     * 私有化构造方法
     */
    private Singleton_06() {
        // 判断instance实例被加载后，不允许访问
        if (SingletonHandler.instance != null) {
            throw new RuntimeException("不允许非法访问");
        }
    }

    /**
     * 创建静态内部类
     */
    private static class SingletonHandler {
        // 在静态内部类中创建单例，在装载内部类的时候，才会创建单例对象
        // 线程安全由JVM来实现，因为类是JVM加载的
        private static Singleton_06 instance = new Singleton_06();
    }

    public static Singleton_06 getInstance() {
        return SingletonHandler.instance;
    }
}
