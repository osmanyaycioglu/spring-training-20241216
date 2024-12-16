package org.training.merkez.spring.training.interfaces;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
@RequiredArgsConstructor
public class HelloConfig {
    private final ApplicationContext contextParam;

    @Bean
    public IHello dynamicHello(Environment environmentParam) {
        String language = environmentParam.getProperty("my.app.language");
        return switch (language) {
            case "eng" -> new HelloEng();
            default -> new HelloTr();
        };
    }

    @Bean
    public IHello dynamicHello3() {
        String language = contextParam.getEnvironment().getProperty("my.app.language");
        return switch (language) {
            case "eng" -> new HelloEng();
            default -> new HelloTr();
        };
    }

    @Bean
    public IHello dynamicHello2(@Value("${my.app.language}") String language) {
        switch (language) {
            case "eng":
                return new HelloEng();
            case "tr":
            default:
                return new HelloTr();

        }
    }

}
