package com.namdq.gof.builder.impl;

import com.namdq.gof.builder.Builder;
import com.namdq.gof.builder.Product;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcreteBuilder1 implements Builder {

    private Product product;

    public ConcreteBuilder1() {
        this.reset();
    }

    @Override
    public void reset() {
        this.product = new Product();
    }

    @Override
    public void buildStepA() {
        this.product.setProperty1("stepA");
        log.info("ConcreteBuilder1: stepA complete...");
    }

    @Override
    public void buildStepB() {
        this.product.setProperty2("stepB");
        log.info("ConcreteBuilder1: stepB complete...");
    }

    @Override
    public void buildStepZ() {
        this.product.setProperty3("stepZ");
        log.info("ConcreteBuilder1: stepZ complete...");
    }

    public Product getProduct() {
        log.info("ConcreteBuilder1: Concrete product complete...");
        return this.product;
    }
}
