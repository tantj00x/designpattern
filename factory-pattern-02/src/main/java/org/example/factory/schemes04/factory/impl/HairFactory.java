package org.example.factory.schemes04.factory.impl;

import org.example.factory.schemes04.factory.AppliancesFactory;
import org.example.factory.schemes04.product.AbstractFreezer;
import org.example.factory.schemes04.product.AbstractTV;
import org.example.factory.schemes04.product.impl.HairFreezer;
import org.example.factory.schemes04.product.impl.HairTV;

public class HairFactory implements AppliancesFactory {
    @Override
    public AbstractTV createTV() {
        return new HairTV();
    }

    @Override
    public AbstractFreezer createFreezer() {
        return new HairFreezer();
    }
}
