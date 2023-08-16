package org.example.factory.schemes02.service.impl;

import com.alibaba.fastjson.JSON;
import org.example.factory.schemes02.entity.AwardInfo;
import org.example.factory.schemes02.entity.ResponseResult;
import org.example.factory.schemes02.entity.SmallGiftInfo;
import org.example.factory.schemes02.service.IFreeGoods;

import java.util.UUID;

/**
 * 小礼品发放服务
 */
public class SmallGiftFreeGoods implements IFreeGoods {
    @Override
    public ResponseResult sendFreeGoods(AwardInfo awardInfo) {

        SmallGiftInfo smallGiftInfo = new SmallGiftInfo();
        smallGiftInfo.setUserPhone(awardInfo.getExtMap().get("phone"));
        smallGiftInfo.setUserName(awardInfo.getExtMap().get("username"));
        smallGiftInfo.setAddress(awardInfo.getExtMap().get("address"));
        smallGiftInfo.setOrderId(UUID.randomUUID().toString());

        System.out.println("小礼品发放成功，请注意查收:" + JSON.toJSONString(smallGiftInfo));
        return new ResponseResult("200", "小礼品发放成功！", smallGiftInfo);
    }
}
