package com.namdq.gof.factorymethod.impl;

import com.namdq.gof.factorymethod.Creator;
import com.namdq.gof.factorymethod.Product;

public class ConcreteCreatorA extends Creator {

    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
