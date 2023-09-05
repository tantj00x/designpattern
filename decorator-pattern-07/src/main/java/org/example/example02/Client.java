package org.example.example02;

import org.junit.Test;

/**
 * 测试
 */
public class Client {

    /**
     * 使用不加密方式，原始方式测试
     */
    @Test
    public void test1(){
        String info = "name:tom,age:30";

        BaseFileDataLoader baseFileDataLoader = new BaseFileDataLoader("demo.txt");
        baseFileDataLoader.write(info);

        String read = baseFileDataLoader.read();
        System.out.println(read);
    }

    /**
     * 使用加密方式，装饰者改写类
     */
    @Test
    public void test2(){
        String info = "name:tom,age:30";

        DataLoader decorator = new EncryptionDataDecorator(new BaseFileDataLoader("demo2.txt"));
        decorator.write(info);

        String read = decorator.read();
        System.out.println(read);
    }
}
