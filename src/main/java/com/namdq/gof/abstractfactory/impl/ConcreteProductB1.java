package com.namdq.gof.abstractfactory.impl;

import com.namdq.gof.abstractfactory.ProductA;
import com.namdq.gof.abstractfactory.ProductB;
import lombok.extern.slf4j.Slf4j;

public class ConcreteProductB1 implements ProductB {

    @Override
    public String methodB() {
        return "The result of the Product B1.";
    }

    @Override
    public String anotherMethodB(ProductA productA) {
        String result = productA.methodA();
        return "The result of the Product B1 collaborating with the (" + result + ")";
    }
}
