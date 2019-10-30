package com.namdq.gof.builder;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class Director {

    private Builder builder;

    public void constructProduct() {
        this.builder.buildStepA();
        this.builder.buildStepB();
        this.builder.buildStepZ();
    }
}
