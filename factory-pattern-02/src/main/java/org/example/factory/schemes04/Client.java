package org.example.factory.schemes04;

import org.example.factory.schemes04.factory.AppliancesFactory;
import org.example.factory.schemes04.factory.impl.HisenseFactory;
import org.example.factory.schemes04.product.AbstractFreezer;
import org.example.factory.schemes04.product.AbstractTV;

/**
 * 客户端
 */
public class Client {

    private AbstractTV tv;

    private AbstractFreezer freezer;

    public Client() {
    }

    public Client(AppliancesFactory factory){
        // 在客户端看来就是使用抽象工厂来生产加点
        this.tv = factory.createTV();
        this.freezer = factory.createFreezer();
    }

    public AbstractTV getTv() {
        return tv;
    }

    public void setTv(AbstractTV tv) {
        this.tv = tv;
    }

    public AbstractFreezer getFreezer() {
        return freezer;
    }

    public void setFreezer(AbstractFreezer freezer) {
        this.freezer = freezer;
    }

    public static void main(String[] args) {
        // 通过结果可以查看，只需要提供给客户端海立信的工厂，即可创建对应的产品
        Client client = new Client(new HisenseFactory());
        AbstractTV tv = client.getTv();
        AbstractFreezer freezer = client.getFreezer();

        System.out.println("tv = " + tv);
        System.out.println("freezer = " + freezer);
    }
}
