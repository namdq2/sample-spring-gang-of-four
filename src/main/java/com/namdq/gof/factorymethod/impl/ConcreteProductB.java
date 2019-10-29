package com.namdq.gof.factorymethod.impl;

import com.namdq.gof.factorymethod.Product;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcreteProductB implements Product {

    public ConcreteProductB() {
        doStuff();
    }

    @Override
    public void doStuff() {
        log.info("Result of the ConcreteProductB");
    }
}
