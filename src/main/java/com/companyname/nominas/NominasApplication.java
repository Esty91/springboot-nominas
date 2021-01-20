package com.companyname.nominas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.companyname.nominas")
public class NominasApplication {

	public static void main(String[] args) {
		SpringApplication.run(NominasApplication.class, args);

	}

}
