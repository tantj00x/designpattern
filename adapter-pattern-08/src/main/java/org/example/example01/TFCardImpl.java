package org.example.example01;

/**
 * TF卡实现类
 */
public class TFCardImpl implements TFCard{

    @Override
    public String readTF() {
        String msg = "TF card reading data";
        return msg;
    }


    @Override
    public void writeTF(String msg) {
        System.out.println("TF card writing data : " + msg);
    }
}
