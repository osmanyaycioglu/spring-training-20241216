package org.training.merkez.spring.training.properties;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/props")
@RequiredArgsConstructor
public class MyAppPropsRestController {
    private final MyAppProps myAppProps;

    @GetMapping("/get")
    public MyAppProps getMyAppProps() {
        return myAppProps;
    }
}
