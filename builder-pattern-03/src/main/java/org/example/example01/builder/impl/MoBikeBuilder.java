package org.example.example01.builder.impl;

import org.example.example01.builder.Builder;
import org.example.example01.product.Bike;

/**
 * 摩拜单车建造者
 */
public class MoBikeBuilder extends Builder {
    @Override
    public void buildFrame() {
        System.out.println("制作车架！");
        super.mBike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        System.out.println("制作车座！");
        super.mBike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return super.mBike;
    }
}
