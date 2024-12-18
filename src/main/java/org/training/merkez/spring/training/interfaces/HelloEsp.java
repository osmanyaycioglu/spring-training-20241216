package org.training.merkez.spring.training.interfaces;

import org.springframework.stereotype.Component;

public class HelloEsp implements IHello {

    @Override
    public String sayHello(final String name) {
        return "Ola " + name;
    }

    @Override
    public String sayGoodbye(final String name) {
        return "Adios " + name;
    }
}
