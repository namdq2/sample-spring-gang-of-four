package com.namdq.gof.abstractfactory;

import com.namdq.gof.abstractfactory.impl.ConcreteFactory2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class ConcreteFactory2Tests {

    @Test
    void createProductA() {
        AbstractFactory abstractFactory = new ConcreteFactory2();
        ProductA productA = abstractFactory.createProductA();

        log.info(productA.methodA());
    }

    @Test
    void createProductB() {
        AbstractFactory abstractFactory = new ConcreteFactory2();
        ProductA productA = abstractFactory.createProductA();
        ProductB productB = abstractFactory.createProductB();

        log.info(productB.methodB());
        log.info(productB.anotherMethodB(productA));
    }
}