package com.mitrai.istio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class IstioDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IstioDemoApplication.class, args);
	}

}
