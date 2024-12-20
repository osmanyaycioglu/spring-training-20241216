package org.training.merkez.spring.training;

import a.b.c.MyFeature1Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.training.merkez.spring.training.beans.MyFirstBean;

//@SpringBootApplication(scanBasePackages = {"org.training.merkez.spring.training",
//                                           "a.b.c"
//})
@SpringBootApplication
@Import({MyFeature1Configuration.class})
@PropertySource("classpath:my.properties")
@ImportResource("classpath:beans.xml")
public class SpringTrainingApplication {

    @Autowired
    @Qualifier("myFirstBean")
    private MyFirstBean xyz;


}
