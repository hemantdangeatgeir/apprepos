package com.clinicalpatient.intelligence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class IntelligenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntelligenceApplication.class, args);
	}

}
@RestController
class HelloController
{
	@GetMapping("/")
	public String appResponse() {
		return "CICD approch.";
	}
}