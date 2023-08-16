package org.example.factory.schemes03.factory;

import org.example.factory.schemes03.factory.impl.DiscountFreeGoodsFactory;
import org.example.factory.schemes03.factory.impl.SmallGiftFreeGoodsFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 工厂的工厂，用来创建工厂对象 作用是不需要每次创建新的工厂对象
 */
public class FreeGoodsFactoryMap {

    // 创建map集合，保存工厂对象
    private static final Map<Integer, FreeGoodsFactory> cacheFactory = new HashMap<>();

    static {
        cacheFactory.put(1, new DiscountFreeGoodsFactory());
        cacheFactory.put(2, new SmallGiftFreeGoodsFactory());
    }

    public static FreeGoodsFactory getParserFactory(Integer type) {
        if (type == 1) {
            FreeGoodsFactory freeGoodsFactory = cacheFactory.get(1);
            return freeGoodsFactory;
        } else if (type == 2) {
            FreeGoodsFactory freeGoodsFactory = cacheFactory.get(2);
            return freeGoodsFactory;
        }
        return null;
    }


}
