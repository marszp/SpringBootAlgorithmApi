package com.msz.SpringBootAlgorithmApi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloIndex(){
        return  "Greetings from Spring Boot!";
    }
}
