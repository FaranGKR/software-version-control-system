package pk.edu.niit.version_system.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/hello-world")
    public String helloworld()
    {
        return "Muqadas";
    }
    @PostMapping("/student")
    public String getStudent(@RequestParam String name, @RequestParam int age)
    {
        return "My name is " + name + "and my age is " + age;
    }
}
