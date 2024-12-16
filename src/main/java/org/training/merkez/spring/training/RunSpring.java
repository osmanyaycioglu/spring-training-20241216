package org.training.merkez.spring.training;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.training.merkez.spring.training.beans.MySecondBean;

public class RunSpring {

    public static void main(String[] args) {
        ConfigurableApplicationContext contextLoc = SpringApplication.run(SpringTrainingApplication.class,
                                                                          args);
        MySecondBean beanLoc = contextLoc.getBean(MySecondBean.class);
        beanLoc.saySomething("osman");
    }

}
