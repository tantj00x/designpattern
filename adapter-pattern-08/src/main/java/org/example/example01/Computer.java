package org.example.example01;

/**
 * 电脑类：用来读取SD卡
 */
public class Computer {

    public String read(SDCard sdCard){
        String data = sdCard.readSD();
        return data;
    }
}
