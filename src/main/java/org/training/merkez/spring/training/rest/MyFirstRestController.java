package org.training.merkez.spring.training.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.training.merkez.spring.training.rest.model.Person;

@RestController
@RequestMapping("/my/first")
public class MyFirstRestController {

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hello1() {
        return "hello1";
    }

    @GetMapping("/hello2")
    public String hello2() {
        return "hello2 GET";
    }

    @PostMapping("/hello2")
    public String hello2a() {
        return "hello2 POST";
    }

    @PatchMapping("/hello2")
    public String hello2b() {
        return "hello2 PATCH";
    }

    @PutMapping("/hello2")
    public String hello2c() {
        return "hello2 PUT";
    }

    @DeleteMapping("/hello2")
    public String hello2d() {
        return "hello2 DELETE";
    }

    // /my/first/hello3?name=osman
    @GetMapping("/hello3")
    public String hello3(@RequestParam("name") String name) {
        return "hello3 " + name;
    }

    // /my/first/hello3?name=osman&surname=yaycıoğlu
    @GetMapping("/hello4")
    public String hello4(@RequestParam("name") String name,
                         @RequestParam("surname") String surname) {
        return "hello4 " + name + " " + surname;
    }

    @GetMapping("/hello5/{name}/{surname}")
    public String hello5(@PathVariable("name") String name,
                         @PathVariable("surname") String surname) {
        return "hello5 " + name + " " + surname;
    }

    @GetMapping("/hello6/{name}")
    public String hello6(@PathVariable("name") String name,
                         @RequestParam("surname") String surname) {
        return "hello6 " + name + " " + surname;
    }

    @PostMapping("/hello7")
    public String hello7(@RequestBody Person personParam) {
        return "hello7 " + personParam;
    }


}
