package com.example.demo.secondDemo.current;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.example.demo.secondDemo.other.OtherConfig;

@Import(OtherConfig.class)
@Configuration
public class SpringConfig {

	@Bean
	public DefaultBean defaultBean() {
		return new DefaultBean();
	}
}
