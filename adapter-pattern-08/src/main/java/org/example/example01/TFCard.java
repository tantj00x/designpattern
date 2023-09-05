package org.example.example01;

/**
 * TF卡接口
 */
public interface TFCard {

    /**
     * 读取TF卡
     */
    String readTF();


    /**
     * 写入TF卡
     */
    void writeTF(String msg);

}
