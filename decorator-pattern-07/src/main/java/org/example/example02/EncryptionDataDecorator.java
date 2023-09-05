package org.example.example02;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * 具体装饰着类-对文件的内容进行加密和解密
 */
public class EncryptionDataDecorator extends DataLoaderDecorator {

    public EncryptionDataDecorator(DataLoader dataLoader) {
        super(dataLoader);
    }

    @Override
    public String read() {
        return decode(super.read());
    }

    @Override
    public void write(String data) {
        super.write(encode(data));
    }

    /**
     * 加密操作
     */
    public String encode(String data) {
        try {
            Base64.Encoder encoder = Base64.getEncoder();
            // 先把得到的数据转换为字节数组
            byte[] bytes = data.getBytes("utf-8");
            // 获取加密后的字符串
            String result = encoder.encodeToString(bytes);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 解密操作
     */
    public String decode(String data) {
        try {
            Base64.Decoder decoder = Base64.getDecoder();
            String s = new String(decoder.decode(data), "utf-8");
            return s;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
