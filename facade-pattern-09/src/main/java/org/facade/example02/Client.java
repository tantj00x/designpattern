package org.facade.example02;

/**
 * 测试
 */
public class Client {
    public static void main(String[] args) {
        SmartAppliancesFacade smartAppliancesFacade = new SmartAppliancesFacade();
        smartAppliancesFacade.say("打开家电");
        System.out.println("--------------------------------");
        smartAppliancesFacade.say("关闭家电");
    }
}
