package org.example.factory.schemes02.factory;

import org.example.factory.schemes02.service.IFreeGoods;
import org.example.factory.schemes02.service.impl.DiscountFreeGoods;
import org.example.factory.schemes02.service.impl.SmallGiftFreeGoods;
import org.example.factory.schemes02.service.impl.YouKuMemberFreeGoods;

/**
 * 具体工厂：生成免费商品
 */
public class FreeGoodsFactory {

    public static IFreeGoods getInstance(Integer awardInfo) {

        IFreeGoods iFreeGoods = null;

        if (awardInfo == 1){
            // 打折券
            iFreeGoods = new DiscountFreeGoods();
        }else if (awardInfo == 2){
            // 优酷会员
            iFreeGoods = new YouKuMemberFreeGoods();
        }else if (awardInfo == 3){
            // 小礼品
            iFreeGoods = new SmallGiftFreeGoods();
        }

        return iFreeGoods;
    }


}
