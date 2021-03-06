package com.jposthau.portfolio.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
public class PortfolioAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioAppApplication.class, args);
	}

}
