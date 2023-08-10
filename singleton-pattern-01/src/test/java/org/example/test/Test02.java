package org.example.test;

import org.example.singleton.Singleton_05;

import java.lang.reflect.Constructor;

/**
 * 反射对于单例的破坏
 */
public class Test02 {
    public static void main(String[] args) throws Exception {
        Class<Singleton_05> clazz = Singleton_05.class;

        Constructor<Singleton_05> constructor = clazz.getDeclaredConstructor();

        // 设置为true，可以对类中的私有成员进行操作
        constructor.setAccessible(true);

        Singleton_05 instance = constructor.newInstance();
        Singleton_05 instance2 = constructor.newInstance();

        // false
        System.out.println(instance == instance2);
    }
}
