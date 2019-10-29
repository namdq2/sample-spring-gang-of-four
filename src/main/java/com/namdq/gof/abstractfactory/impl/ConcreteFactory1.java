package com.namdq.gof.abstractfactory.impl;

import com.namdq.gof.abstractfactory.AbstractFactory;
import com.namdq.gof.abstractfactory.ProductA;
import com.namdq.gof.abstractfactory.ProductB;

public class ConcreteFactory1 extends AbstractFactory {

    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}
