package cn.shadow.starter.autoconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import cn.shadow.starter.HelloFormateTemplate;
import cn.shadow.starter.formate.FormateProcessor;

@Import(FormateAutoConfiguration.class)
@Configuration
public class HelloAutoConfiguration {

	@Bean
	public HelloFormateTemplate helloFormateTemplate(FormateProcessor formateProcessor) {
		return new HelloFormateTemplate(formateProcessor);
	}
}
