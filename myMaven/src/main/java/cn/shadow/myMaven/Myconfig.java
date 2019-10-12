package cn.shadow.myMaven;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Myconfig {

	@Bean
	public Mycore getMycore() {
		return new Mycore();
	}
	
}
