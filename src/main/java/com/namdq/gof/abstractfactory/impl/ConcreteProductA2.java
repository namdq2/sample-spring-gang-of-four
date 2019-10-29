package com.namdq.gof.abstractfactory.impl;

import com.namdq.gof.abstractfactory.ProductA;

public class ConcreteProductA2 implements ProductA {

    @Override
    public String methodA() {
        return "The result of the Product A2.";
    }
}
