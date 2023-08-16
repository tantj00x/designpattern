package org.example.test;

import org.example.factory.schemes03.controller.DeliverController;
import org.example.factory.schemes03.entity.AwardInfo;
import org.example.factory.schemes03.entity.ResponseResult;
import org.junit.Test;

import java.util.HashMap;

/**
 * 工厂方法模式-测试
 */
public class Test03 {

    private DeliverController deliverController = new DeliverController();

    @Test
    public void test1(){
        // 1.发放打折券优惠
        AwardInfo info = new AwardInfo();
        info.setUid("1001");
        info.setAwardTypes(1);
        info.setAwardNumber("DEL12345");

        ResponseResult responseResult = deliverController.awardToUser(info);
        System.out.println(responseResult);

    }

    @Test
    public void test02() {
        // 2.发放小礼品
        AwardInfo awardInfo = new AwardInfo();
        awardInfo.setUid("1003");
        awardInfo.setAwardTypes(2);
        awardInfo.setAwardNumber("SMJ12345");

        HashMap<String, String> map = new HashMap<>();
        map.put("username","张三");
        map.put("phone","18235429883");
        map.put("address","天安门");
        awardInfo.setExtMap(map);

        deliverController.awardToUser(awardInfo);
    }

}
