package pk.edu.niit.version_system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthClass {
    @GetMapping("/HealthClass")
    public String hello(){
        return "Hello World";
    }
    @PostMapping("/HealthClass")
    public String create(){
        return "Post request received successfully!";
    }
}
