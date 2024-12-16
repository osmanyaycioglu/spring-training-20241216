package org.training.merkez.spring.training.interfaces;

import org.springframework.stereotype.Component;

@Component
public class HelloTr implements IHello {

    @Override
    public String sayHello(final String name) {
        return "Merhaba " + name;
    }

    @Override
    public String sayGoodbye(final String name) {
        return "Güle güle " + name;
    }
}
