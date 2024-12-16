package org.training.merkez.spring.training.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

// @Lazy
@Component
public class MySecondBean {
    @Autowired
    private MyFirstBean myFirstBean;

    public void saySomething(String name){
        System.out.println(myFirstBean.helloWorld(name));
    }

}
