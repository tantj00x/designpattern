package org.example.factory.schemes02.controller;

import org.example.factory.schemes02.entity.AwardInfo;
import org.example.factory.schemes02.entity.ResponseResult;
import org.example.factory.schemes02.factory.FreeGoodsFactory;
import org.example.factory.schemes02.service.IFreeGoods;

/**
 * 发放奖品的接口
 */
public class DeliverController {

    /**
     * 发放奖品
     */
    public ResponseResult awardToUser(AwardInfo awardInfo){
        try {
            IFreeGoods freeGoods = FreeGoodsFactory.getInstance(awardInfo.getAwardTypes());
            ResponseResult responseResult = freeGoods.sendFreeGoods(awardInfo);
            return responseResult;
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseResult("201","奖品发放失败！");
        }
    }


}
