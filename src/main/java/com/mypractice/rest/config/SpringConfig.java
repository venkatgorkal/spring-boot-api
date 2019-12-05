package com.mypractice.rest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mypractice.rest.model.MathComponent;

@Configuration
public class SpringConfig {
	
	@Bean
	MathComponent getMath() {
		return new MathComponent();
	}

}
