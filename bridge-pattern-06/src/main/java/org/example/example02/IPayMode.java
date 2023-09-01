package org.example.example02;

/**
 * 支付模式接口
 */
public interface IPayMode {

    /**
     * 安全校验功能：对各种支付模式进行风控校验操作
     * @return
     */
    boolean security(String UID);

}
