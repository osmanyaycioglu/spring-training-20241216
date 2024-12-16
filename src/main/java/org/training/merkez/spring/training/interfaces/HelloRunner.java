package org.training.merkez.spring.training.interfaces;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HelloRunner implements CommandLineRunner {
    private final IHello hello;

    public HelloRunner(@Qualifier("dynamicHello") IHello hello) {
        this.hello = hello;
    }

    @Override
    public void run(final String... args) throws Exception {
        System.out.println("Interface : " + hello.sayHello("osman"));
    }
}
