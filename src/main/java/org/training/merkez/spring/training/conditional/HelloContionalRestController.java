package org.training.merkez.spring.training.conditional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.training.merkez.spring.training.interfaces.IHello;

@RestController
@RequestMapping("/conditional/hello")
public class HelloContionalRestController {
    @Autowired
    @Qualifier("helloCondition")
    private IHello hello;

    @GetMapping("/say/hello")
    public String sayHello(@RequestParam String name){
        return hello.sayHello(name);
    }


}
