package org.example.example02;

/**
 * 指纹支付
 */
public class PayFingerPrintMode implements IPayMode{
    @Override
    public boolean security(String UID) {
        System.out.println("指纹支付，风控校验->指纹信息");
        return true;
    }
}
