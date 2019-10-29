package com.namdq.gof.factorymethod.impl;

import com.namdq.gof.factorymethod.Creator;
import com.namdq.gof.factorymethod.Product;

public class ConcreteCreatorB extends Creator {

    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
