package org.training.merkez.spring.training.jpa;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
@RequiredArgsConstructor
public class EmployeeRestController {
    private final IEmployeeRepository employeeRepository;

    @PostMapping("/add")
    public String add(@Valid @RequestBody Employee employeeParam) {
        employeeParam.getTrainingPhones()
                     .forEach(p -> p.setEmployee(employeeParam));
        employeeRepository.save(employeeParam);
        return "OK";
    }

    @GetMapping("/get/all")
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @GetMapping("/get/by/name")
    public List<Employee> getByName(@RequestParam String name) {
        return employeeRepository.findAll();
    }

}
