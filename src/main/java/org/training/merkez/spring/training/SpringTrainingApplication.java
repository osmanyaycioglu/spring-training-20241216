package org.training.merkez.spring.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.training.merkez.spring.training.beans.MyFirstBean;

@SpringBootApplication
public class SpringTrainingApplication {

    @Autowired
    @Qualifier("myFirstBean")
    private MyFirstBean xyz;




}
