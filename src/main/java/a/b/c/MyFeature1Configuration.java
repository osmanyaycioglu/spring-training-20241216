package a.b.c;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyFeature1Configuration {

    @Bean
    public MyOtherPackageBean myOtherPackageBean(){
        return new MyOtherPackageBean();
    }

}
