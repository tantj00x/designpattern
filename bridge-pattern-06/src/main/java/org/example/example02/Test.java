package org.example.example02;

import java.math.BigDecimal;

/**
 * 测试类
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("测试场景1：微信支付，人脸方式");
        Pay wxPay = new WxPay(new PayFaceMode());
        wxPay.transfer("wx_00001","10090909",new BigDecimal(100));

        System.out.println("------------------------------------------------");

        System.out.println("测试场景1：支付宝支付，指纹方式");
        Pay zfbPay = new ZfbPay(new PayFingerPrintMode());
        zfbPay.transfer("zfb_00002","10010009",new BigDecimal(100));
    }
}
