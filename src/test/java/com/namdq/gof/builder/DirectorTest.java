package com.namdq.gof.builder;

import com.namdq.gof.builder.impl.ConcreteBuilder1;
import com.namdq.gof.builder.impl.ConcreteBuilder2;
import org.junit.jupiter.api.Test;

public class DirectorTest {

    @Test
    public void constructProduct1() {
        Builder builder = new ConcreteBuilder1();
        Director director = new Director(builder);
        director.constructProduct();
    }

    @Test
    public void constructProduct2() {
        Builder builder = new ConcreteBuilder2();
        Director director = new Director(builder);
        director.constructProduct();
    }
}
