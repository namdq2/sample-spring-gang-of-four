package com.namdq.gof.factorymethod.impl;

import com.namdq.gof.factorymethod.Product;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcreteProductA implements Product {

    public ConcreteProductA() {
        doStuff();
    }

    @Override
    public void doStuff() {
        log.info("Result of the ConcreteProductA");
    }
}
