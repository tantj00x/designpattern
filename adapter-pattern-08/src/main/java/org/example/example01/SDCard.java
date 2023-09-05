package org.example.example01;

/**
 * SD卡接口
 */
public interface SDCard {

    /**
     * 读取SD卡
     */
    String readSD();


    /**
     * 写入SD卡
     */
    void writeSD(String msg);

}
