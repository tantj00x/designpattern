package org.example.factory.schemes01.controller;

import org.example.factory.schemes01.entity.AwardInfo;
import org.example.factory.schemes01.entity.DiscountResult;
import org.example.factory.schemes01.entity.SmallGiftInfo;
import org.example.factory.schemes01.service.DiscountService;
import org.example.factory.schemes01.service.SmallGiftService;
import org.example.factory.schemes01.service.YouKuMemberService;

import java.util.UUID;

/**
 * 发放奖品接口
 */
public class DeliverController {
    /**
     * 按照类型的不同发放奖品 1.打折券 2.优酷会员 3.小礼品
     *
     * @param awardInfo 获奖信息实体类
     */
    public void awardToUser(AwardInfo awardInfo) {

        if (awardInfo.getAwardTypes() == 1) {

            DiscountService discountService = new DiscountService();
            DiscountResult senddiscount = discountService.senddiscount(awardInfo.getUid(), awardInfo.getAwardNumber());
            System.out.println("打折券发放成功！" + senddiscount);

        } else if (awardInfo.getAwardTypes() == 2) {

            String phone = awardInfo.getExtMap().get("phone");

            YouKuMemberService youKuMemberService = new YouKuMemberService();
            youKuMemberService.openMember(phone, awardInfo.getAwardNumber());
            System.out.println("优酷会员发放成功！");

        } else if (awardInfo.getAwardTypes() == 3) {

            // 封装收货人信息
            SmallGiftInfo smallGiftInfo = new SmallGiftInfo();
            smallGiftInfo.setAddress(awardInfo.getExtMap().get("address"));
            smallGiftInfo.setUserPhone(awardInfo.getExtMap().get("phone"));
            smallGiftInfo.setUserName(awardInfo.getExtMap().get("username"));
            smallGiftInfo.setOrderId(UUID.randomUUID().toString());

            SmallGiftService smallGiftService = new SmallGiftService();
            Boolean flag = smallGiftService.giveSmallGift(smallGiftInfo);
            if (flag) {
                System.out.println("小礼品发放成功！");
            }

        }

    }


}
