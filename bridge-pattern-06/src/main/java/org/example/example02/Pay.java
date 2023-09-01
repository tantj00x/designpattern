package org.example.example02;

import java.math.BigDecimal;

/**
 * 支付抽象类
 */
public abstract class Pay {

    /**
     * 桥接对象
     */
    protected IPayMode payMode;

    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    public abstract String transfer(String uid, String tradeId, BigDecimal amount);

}
