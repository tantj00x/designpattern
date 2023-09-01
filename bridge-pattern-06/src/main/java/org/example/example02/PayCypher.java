package org.example.example02;

/**
 * 密码支付
 */
public class PayCypher implements IPayMode{
    @Override
    public boolean security(String UID) {
        System.out.println("密码支付，风控校验-环境安全");
        return true;
    }
}
