package com.namdq.gof.factorymethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Creator {

    public abstract Product createProduct();

    public void someOperation() {
        log.info("Result of the someOperation method in Creator.");
    }
}
