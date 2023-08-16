package org.example.test;

import org.example.factory.schemes01.controller.DeliverController;
import org.example.factory.schemes01.entity.AwardInfo;
import org.junit.Test;

import java.util.HashMap;

public class Test01 {

    DeliverController deliverController = new DeliverController();

    // 测试发放奖品接口
    @Test
    public void test01() {
        // 1.发放打折券优惠
        AwardInfo awardInfo = new AwardInfo();
        awardInfo.setUid("1001");
        awardInfo.setAwardTypes(1);
        awardInfo.setAwardNumber("DEL12345");

        deliverController.awardToUser(awardInfo);
    }

    @Test
    public void test02() {
        // 2.发放优酷会员
        AwardInfo awardInfo = new AwardInfo();
        awardInfo.setUid("1002");
        awardInfo.setAwardTypes(2);
        awardInfo.setAwardNumber("DW12345");

        HashMap<String, String> map = new HashMap<>();
        map.put("phone","18235429883");
        awardInfo.setExtMap(map);

        deliverController.awardToUser(awardInfo);
    }

    @Test
    public void test03() {
        // 2.发放小礼品
        AwardInfo awardInfo = new AwardInfo();
        awardInfo.setUid("1003");
        awardInfo.setAwardTypes(3);
        awardInfo.setAwardNumber("SMJ12345");

        HashMap<String, String> map = new HashMap<>();
        map.put("username","张三");
        map.put("phone","18235429883");
        map.put("address","天安门");
        awardInfo.setExtMap(map);

        deliverController.awardToUser(awardInfo);
    }





}
