package org.example.example02;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * 具体组件：抽象文件读取接口的实现类
 */
public class BaseFileDataLoader implements DataLoader{

    /**
     * 接受文件地址
     */
    private String filePath;

    public BaseFileDataLoader(String filePath) {
        this.filePath = filePath;
    }

    /**
     * 读方法
     */
    @Override
    public String read() {
        try {
            String result = FileUtils.readFileToString(new File(filePath), "utf-8");
            return result;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 写方法
     */
    @Override
    public void write(String data) {
        try {
            FileUtils.writeStringToFile(new File(filePath),data,"utf-8");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
