package org.example.factory.schemes04.factory.impl;

import org.example.factory.schemes04.factory.AppliancesFactory;
import org.example.factory.schemes04.product.AbstractFreezer;
import org.example.factory.schemes04.product.AbstractTV;
import org.example.factory.schemes04.product.impl.HisenseFreezer;
import org.example.factory.schemes04.product.impl.HisenseTV;

public class HisenseFactory implements AppliancesFactory {
    @Override
    public AbstractTV createTV() {
        return new HisenseTV();
    }

    @Override
    public AbstractFreezer createFreezer() {
        return new HisenseFreezer();
    }
}
