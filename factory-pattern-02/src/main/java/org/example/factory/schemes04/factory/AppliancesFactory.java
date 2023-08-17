package org.example.factory.schemes04.factory;

import org.example.factory.schemes04.product.AbstractFreezer;
import org.example.factory.schemes04.product.AbstractTV;

/**
 * 抽象工厂：在一个抽象工厂中，可以声明多个工厂方法，用于创建不同类型的产品
 */
public interface AppliancesFactory {

    AbstractTV createTV();

    AbstractFreezer createFreezer();

}
