package org.example.example01.builder.impl;

import org.example.example01.builder.Builder;
import org.example.example01.product.Bike;

/**
 * 哈罗单车建造者
 */
public class HelloBikeBuilder extends Builder {
    @Override
    public void buildFrame() {
        System.out.println("制作碳纤维车架！");
        super.mBike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        System.out.println("制作橡胶车座！");
        super.mBike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return super.mBike;
    }
}
