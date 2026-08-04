package pk.gov.nastp.Project1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("/helloWorld")
    public String healthCheck() {
        return "Hello World!";
    }

    @PostMapping("/displayString")
    public String CallPerson(@RequestBody String name) {
        return name;
    }

    @GetMapping("/Extra")
    public int Extra() {
        return 6;
    }

    @PostMapping("/name") public String NameWorld(@RequestBody String fname) {
        return "Your name is " + fname ;
    }
}