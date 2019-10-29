package com.namdq.gof.abstractfactory.impl;

import com.namdq.gof.abstractfactory.ProductA;
import com.namdq.gof.abstractfactory.ProductB;

public class ConcreteProductB2 implements ProductB {

    @Override
    public String methodB() {
        return "The result of the Product B2.";
    }

    @Override
    public String anotherMethodB(ProductA productA) {
        String result = productA.methodA();
        return "The result of the Product B2 collaborating with the (" + result + ")";
    }
}
