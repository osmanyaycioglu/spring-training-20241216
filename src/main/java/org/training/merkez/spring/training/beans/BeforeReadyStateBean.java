package org.training.merkez.spring.training.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BeforeReadyStateBean implements CommandLineRunner {
    private MyFirstBean myFirstBean;

    @Autowired
    private MySecondBean mySecondBean;
    private MySecondBean mySecondBean2;
    // @Autowired
    // Constructor Injection
    public BeforeReadyStateBean(@Qualifier("myFirstBean") final MyFirstBean myFirstBeanParam) {
        System.out.println("early init");
        myFirstBean = myFirstBeanParam;
        System.out.println("before ready init");
    }

    @Override
    public void run(final String... args) throws Exception {
        System.out.println("Command line runner : " + myFirstBean.helloWorld("osman yaycıoğlu"));
    }

    @Autowired
    public void xyz(MySecondBean mySecondBeanParam){
        mySecondBean2 = mySecondBeanParam;
    }

    @PostConstruct
    public void abc(){
        System.out.println("init");
    }

}
