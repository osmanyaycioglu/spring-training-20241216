package org.training.merkez.spring.training.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.training.merkez.spring.training.interfaces.HelloEng;
import org.training.merkez.spring.training.interfaces.IHello;

@Profile("dev")
@Configuration
public class HelloDevProfileConfig {

    @Bean
    public IHello helloProf(){
        return new HelloEng();
    }


}
