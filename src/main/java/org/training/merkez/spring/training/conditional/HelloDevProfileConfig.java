package org.training.merkez.spring.training.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.training.merkez.spring.training.interfaces.HelloEng;
import org.training.merkez.spring.training.interfaces.IHello;

@MyPropCondition(key = "app.group.name",value = "kodlama")
@Configuration("helloDevCondConf")
public class HelloDevProfileConfig {

    @Bean
    public IHello helloCondition(){
        return new HelloEng();
    }


}
