package org.example.example02;

/**
 * 刷脸支付
 */
public class PayFaceMode implements IPayMode{
    @Override
    public boolean security(String UID) {
        System.out.println("人脸支付，风控校验->脸部识别");
        return true;
    }
}
