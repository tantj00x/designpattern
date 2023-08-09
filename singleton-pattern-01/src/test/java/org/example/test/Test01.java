package org.example.test;

import org.example.singleton.Singleton_01;
import org.example.singleton.Singleton_02;
import org.example.singleton.Singleton_03;
import org.junit.Test;

public class Test01 {
    /**
     * 饿汉式-单例模式测试
     */
    @Test
    public void test01() {
        Singleton_01 instance = Singleton_01.getInstance();
        System.out.println("instance = " + instance);
        Singleton_01 instance1 = Singleton_01.getInstance();
        System.out.println("instance1 = " + instance1);
        System.out.println(instance == instance1);
    }

    /**
     * 懒汉式-单例模式测试(线程不安全)
     */
    @Test
    public void test02() {
        // 模拟多线程情况下，会出现线程不安全问题
        // 开启100个线程，从Singleton_02中获取实例对象，查看多线程情况下获取的示例是否是同一个
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                Singleton_02 instance = Singleton_02.getInstance();
                System.out.println(Thread.currentThread().getName() + "------" + instance);
            }).start();
        }
        // Thread-31------org.example.singleton.Singleton_02@40a3aa06
        // Thread-0------org.example.singleton.Singleton_02@58526f68
        // 结果证明有线程获取到的实例值不同，代码存在线程不安全问题
    }

    /**
     * 懒汉式-单例模式测试(线程安全)
     */
    @Test
    public void test03() {
        // 模拟多线程情况下，会出现线程不安全问题
        // 开启100个线程，从Singleton_03中获取实例对象，查看多线程情况下获取的示例是否是同一个
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                Singleton_03 instance = Singleton_03.getInstance();
                System.out.println(Thread.currentThread().getName() + "------" + instance);
            }).start();
        }
        // Thread-18------org.example.singleton.Singleton_03@5ac09ccf
        // Thread-2------org.example.singleton.Singleton_03@5ac09ccf
        // Thread-35------org.example.singleton.Singleton_03@5ac09ccf
        // 结果证明线程获取到的实例对象都为同一个，加同步锁方式实现成功，不过还是有缺点，对并发度不高
    }
}
