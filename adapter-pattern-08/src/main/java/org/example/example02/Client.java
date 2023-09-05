package org.example.example02;

import org.example.example01.*;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {

        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.read(sdCard));

        System.out.println("--------------------------------");

        TFCard tfCard = new TFCardImpl();
        SDAdapterTF sdAdapterTF = new SDAdapterTF(tfCard);
        System.out.println(computer.read(sdAdapterTF));

    }
}
