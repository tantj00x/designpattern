package org.example.factory.schemes01.service;


import com.alibaba.fastjson.JSON;
import org.example.factory.schemes01.entity.SmallGiftInfo;

/**
 * 小礼品服务
 */
public class SmallGiftService {

    public Boolean giveSmallGift(SmallGiftInfo smallGiftInfo) {
        System.out.println("小礼品已发送，获奖用户注意查收！" + JSON.toJSON(smallGiftInfo));
        return true;
    }

}
