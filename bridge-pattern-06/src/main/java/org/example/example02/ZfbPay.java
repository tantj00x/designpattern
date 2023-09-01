package org.example.example02;

import java.math.BigDecimal;

/**
 * 支付宝支付渠道
 */
public class ZfbPay extends Pay{

    public ZfbPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uid, String tradeId, BigDecimal amount) {
        System.out.println("支付宝渠道支付划账开始......");
        boolean security = payMode.security(uid);
        System.out.println("支付宝渠道支付风险校验：" + uid + "," + tradeId + "," + security);

        if (!security) {
            System.out.println("支付宝渠道支付划账失败！！！");
            return "500";
        }

        System.out.println("支付宝渠道划账成功！金额：" + amount);
        return "200";
    }
}
