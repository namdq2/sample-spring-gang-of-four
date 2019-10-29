package com.namdq.gof.factorymethod;

import com.namdq.gof.factorymethod.Creator;
import com.namdq.gof.factorymethod.impl.ConcreteCreatorA;
import org.junit.jupiter.api.Test;

public class ConcreteCreatorATests {

    @Test
    void createProductA() {
        Creator creator = new ConcreteCreatorA();
        creator.createProduct();
    }
}
