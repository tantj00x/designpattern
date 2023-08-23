package org.example.example01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

    @org.junit.Test
    public void test1() throws CloneNotSupportedException {
        ConCreatProToType c1 = new ConCreatProToType();
        ConCreatProToType c2 = c1.clone();

        System.out.println("对象C1和C2是同一个对象吗？" + (c1 == c2));
    }

    @org.junit.Test
    public void test2() throws Exception {
        ConCreatProToType c1 = new ConCreatProToType();
        Person p1 = new Person("John");
        c1.setPerson(p1);

        // 复制操作
        ConCreatProToType c2 = c1.clone();
        Person p2 = c2.getPerson();
        p2.setName("Happy");

        c1.show();
        c2.show();
        System.out.println("对象P1和P2是同一个对象吗？" + (p1 == p2));
    }

    @org.junit.Test
    public void test3() throws Exception {
        ConCreatProToType c1 = new ConCreatProToType();
        Person p1 = new Person("John");
        c1.setPerson(p1);

        // 创建对象序列化输出流
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("a.txt"));
        // 将C1对象写到文件
        outputStream.writeObject(c1);
        outputStream.close();

        // 创建对象序列化输入流
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("a.txt"));
        // 读取对象
        ConCreatProToType c2 = (ConCreatProToType) inputStream.readObject();
        Person p2 = c2.getPerson();
        p2.setName("Happy");

        c1.show();
        c2.show();
        System.out.println("对象P1和P2是同一个对象吗？" + (p1 == p2));
    }
}
