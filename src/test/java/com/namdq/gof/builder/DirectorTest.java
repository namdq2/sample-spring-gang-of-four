package com.namdq.gof.builder;

import com.namdq.gof.builder.impl.ConcreteBuilder1;
import com.namdq.gof.builder.impl.ConcreteBuilder2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DirectorTest {

    @Test
    public void constructProduct1() {
        ConcreteBuilder1 builder = new ConcreteBuilder1();
        Director director = new Director(builder);
        director.constructProduct();
        Product actual = builder.getProduct();

        Product expected = new Product();
        expected.setProperty1("stepA");
        expected.setProperty2("stepB");
        expected.setProperty3("stepZ");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void constructProduct2() {
        ConcreteBuilder2 builder = new ConcreteBuilder2();
        Director director = new Director(builder);
        director.constructProduct();
        Product actual = builder.getProduct();

        Product expected = new Product();
        expected.setProperty1("stepA");
        expected.setProperty2("stepB");
        expected.setProperty3("stepZ");

        Assertions.assertEquals(expected, actual);
    }
}
