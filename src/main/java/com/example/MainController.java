package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String hello() {
    	return "Hello World, This is an Demo SpringBoot App.\nProject : Setting Up Jenkins Pipeline to Deploy Docker Swarm..!";
          
    }
}
