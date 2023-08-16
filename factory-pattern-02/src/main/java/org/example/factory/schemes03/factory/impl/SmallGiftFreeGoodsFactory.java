package org.example.factory.schemes03.factory.impl;

import org.example.factory.schemes03.factory.FreeGoodsFactory;
import org.example.factory.schemes03.service.IFreeGoods;
import org.example.factory.schemes03.service.impl.SmallGiftFreeGoods;

public class SmallGiftFreeGoodsFactory implements FreeGoodsFactory {

    @Override
    public IFreeGoods getInstance() {
        return new SmallGiftFreeGoods();
    }
}
