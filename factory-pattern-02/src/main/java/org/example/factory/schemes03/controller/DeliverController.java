package org.example.factory.schemes03.controller;


import org.example.factory.schemes03.entity.AwardInfo;
import org.example.factory.schemes03.entity.ResponseResult;
import org.example.factory.schemes03.factory.FreeGoodsFactoryMap;
import org.example.factory.schemes03.factory.impl.DiscountFreeGoodsFactory;
import org.example.factory.schemes03.factory.FreeGoodsFactory;
import org.example.factory.schemes03.factory.impl.SmallGiftFreeGoodsFactory;
import org.example.factory.schemes03.service.IFreeGoods;

/**
 * 发放奖品接口
 */
public class DeliverController {
    /**
     * 发放奖品
     */
    public ResponseResult awardToUser(AwardInfo awardInfo) {

        // 根据类型获取具体工程
        FreeGoodsFactory factory = FreeGoodsFactoryMap.getParserFactory(awardInfo.getAwardTypes());

        // 从工厂类中获取对应实例
        IFreeGoods instance = factory.getInstance();

        System.out.println("================================工厂方法模式================================");

        ResponseResult responseResult = instance.sendFreeGoods(awardInfo);

        return responseResult;
    }
}
