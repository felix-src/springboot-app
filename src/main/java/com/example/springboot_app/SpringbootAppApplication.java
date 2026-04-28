package com.example.springboot_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class SpringbootAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAppApplication.class, args);
    }
}

@RestController
class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello from Kubernetes!";
    }
}
