package pk.edu.niit.versions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VersionSystemApplication {


	public static void main(String[] args) {

		SpringApplication.run(VersionSystemApplication.class, args);

		System.out.println("Hello World. This is Spring Boot from NIIT Lahore....");
	}

}
