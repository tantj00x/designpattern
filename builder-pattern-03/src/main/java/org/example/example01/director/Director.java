package org.example.example01.director;

import org.example.example01.builder.Builder;
import org.example.example01.product.Bike;

/**
 * 指挥者类
 */
public class Director {
    /**
     * 创建Builder抽象
     */
    private Builder mBuilder;

    public Director(Builder mBuilder) {
        this.mBuilder = mBuilder;
    }

    /**
     * 自行车制作方法
     * @return Bike产品
     */
    public Bike construct() {
        mBuilder.buildFrame();
        mBuilder.buildSeat();
        return mBuilder.createBike();
    }
}
