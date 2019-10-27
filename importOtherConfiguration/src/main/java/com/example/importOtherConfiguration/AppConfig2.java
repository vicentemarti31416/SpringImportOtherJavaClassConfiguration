package com.example.importOtherConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.importOtherConfiguration.bean.BeanTarget;

@Configuration
public class AppConfig2 {

	@Bean
	public BeanTarget beanTarget() {
		return new BeanTarget();
	}
	
}
