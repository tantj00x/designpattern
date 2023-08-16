package org.example.factory.schemes02.service.impl;

import org.example.factory.schemes02.entity.AwardInfo;
import org.example.factory.schemes02.entity.ResponseResult;
import org.example.factory.schemes02.service.IFreeGoods;

/**
 * 模拟打折券服务
 */
public class DiscountFreeGoods implements IFreeGoods {

    @Override
    public ResponseResult sendFreeGoods(AwardInfo awardInfo) {
        System.out.println("向用户发送一张打折券：" + awardInfo.getUid() + " , " + awardInfo.getAwardNumber());
        return new ResponseResult("200","打折券发放成功！");
    }
}
