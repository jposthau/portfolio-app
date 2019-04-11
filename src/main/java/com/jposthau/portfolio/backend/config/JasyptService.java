package com.jposthau.portfolio.backend.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class JasyptService {

	@Value("${spring.datasource.password}")
	private String password;
	
	public String getPassword() {
		return password;
	}
	
	public String getPasswordUsingEnvironment(Environment environment) {
		return environment.getProperty("spring.datasource.password");
	}
	
}
