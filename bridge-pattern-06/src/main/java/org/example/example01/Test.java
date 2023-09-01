package org.example.example01;

import java.math.BigDecimal;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        PayController payController = new PayController();
        System.out.println("测试：微信支付--人脸支付方式");
        payController.doPay("wx_001","10010000",new BigDecimal(100),1,2);

        System.out.println("测试：支付宝--指纹支付方式");
        payController.doPay("zfb_001","10010010",new BigDecimal(100),2,3);
    }
}
