package org.training.merkez.spring.training.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// @Controller
// @Repository
// @Service
@Configuration
public class MyConfigBean {

    @Bean
    public MyFirstBean myFirstBeanMethod(){
        return new MyFirstBean();
    }

}
