package com.namdq.gof.factorymethod;

import com.namdq.gof.factorymethod.impl.ConcreteCreatorB;
import org.junit.jupiter.api.Test;

public class ConcreteCreatorBTests {

    @Test
    void createProductB() {
        Creator creator = new ConcreteCreatorB();
        creator.createProduct();
    }
}
