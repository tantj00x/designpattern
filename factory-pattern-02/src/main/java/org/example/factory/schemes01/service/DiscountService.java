package org.example.factory.schemes01.service;

import org.example.factory.schemes01.entity.DiscountResult;

/**
 * 打折券服务
 */
public class DiscountService {

    /**
     * 向用户发送优惠券
     *
     * @param uid         用户ID
     * @param awardNumber 奖品编号
     * @return
     */
    public DiscountResult senddiscount(String uid, String awardNumber) {
        System.out.println("向用户发送一张打折券：" + uid + " , " + awardNumber);
        return new DiscountResult("200", "发放打折券成功！");
    }

}
