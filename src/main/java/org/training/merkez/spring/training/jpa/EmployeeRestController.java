package org.training.merkez.spring.training.jpa;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/employee")
@RequiredArgsConstructor
public class EmployeeRestController {
    private final IEmployeeRepository employeeRepository;

    @PostMapping("/add")
    public String method(@RequestBody Employee employeeParam){
        employeeRepository.save(employeeParam);
        return "OK";
    }

}
