package org.example.factory.schemes03.factory.impl;

import org.example.factory.schemes03.factory.FreeGoodsFactory;
import org.example.factory.schemes03.service.IFreeGoods;
import org.example.factory.schemes03.service.impl.DiscountFreeGoods;

/**
 * 生产优惠卷发放接口-具体工程
 */
public class DiscountFreeGoodsFactory implements FreeGoodsFactory {
    @Override
    public IFreeGoods getInstance() {
        // 返回具体的产品
        return new DiscountFreeGoods();
    }
}
