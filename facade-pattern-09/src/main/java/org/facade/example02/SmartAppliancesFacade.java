package org.facade.example02;

/**
 * 外观角色 智能音箱外观类
 */
public class SmartAppliancesFacade {

    private Light light;

    private TV tv;

    private AirCondition airCondition;

    public SmartAppliancesFacade() {
        this.light = new Light();
        this.tv = new TV();
        this.airCondition = new AirCondition();
    }

    public void say(String msg) {
        if (msg.contains("打开")) {
            on();
        } else if (msg.contains("关闭")) {
            off();
        } else {
            System.out.println("对不起没有听清您说什么！请重新再说一遍");
        }
    }

    /**
     * 睡觉了 语音关闭 电灯 电视 空调
     */
    private void off() {
        System.out.println("睡觉了！");
        light.off();
        tv.off();
        airCondition.off();
    }

    /**
     * 起床后 语音开启 电灯 电视 空调
     */
    private void on() {
        System.out.println("起床了！");
        light.on();
        tv.on();
        airCondition.on();
    }
}
