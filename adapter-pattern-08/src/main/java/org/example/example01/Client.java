package org.example.example01;

/**
 * 客户端测试
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.read(sdCard));

        System.out.println("================================================");

        SDAdapterTF sdAdapterTF = new SDAdapterTF();
        System.out.println(computer.read(sdAdapterTF));
    }
}
