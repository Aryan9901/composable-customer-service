package com.aryan;

import org.platformlambda.core.system.AutoStart;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"org.platformlambda", "${spring.component.scan:none}"})
public class CustomerServiceApplication {
	public static void main(String[] args) {
        AutoStart.main(args);
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
}
