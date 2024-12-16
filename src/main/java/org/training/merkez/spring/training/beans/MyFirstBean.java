package org.training.merkez.spring.training.beans;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("anotherBeanName")
// @Primary
// @Data
public class MyFirstBean {


    public String helloWorld(String name){
        return "Hello world : " + name;
    }

}
