package org.example.example01.builder;

import org.example.example01.product.Bike;

/**
 * 抽象建造者类
 */
public abstract class Builder {
    /**
     * protected 只让子类去使用此Bike对象
     * 也就是给具体的建造者使用即可
     */
    protected Bike mBike = new Bike();

    /**
     * 创建车架抽象方法
     */
    public abstract void buildFrame();

    /**
     * 创建车座抽象方法
     */
    public abstract void buildSeat();

    /**
     * 返回创建好的Bike产品对象
     * @return Bike产品对象
     */
    public abstract Bike createBike();
}
