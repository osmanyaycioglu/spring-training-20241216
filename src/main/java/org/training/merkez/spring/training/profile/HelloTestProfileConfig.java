package org.training.merkez.spring.training.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.training.merkez.spring.training.interfaces.HelloEng;
import org.training.merkez.spring.training.interfaces.HelloTr;
import org.training.merkez.spring.training.interfaces.IHello;

@Profile("test")
@Configuration
public class HelloTestProfileConfig {

    @Bean
    public IHello helloProf(){
        return new HelloTr();
    }


}
