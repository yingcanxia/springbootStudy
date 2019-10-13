package cn.shadow.starter.autoconfiguration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import cn.shadow.starter.formate.FormateProcessor;
import cn.shadow.starter.formate.JsonFormateProccessor;
import cn.shadow.starter.formate.StringFormateProccessor;

@Configuration
public class FormateAutoConfiguration {

	//直接使用bean进行注册的话相当于一个组有多个实现
	//需要定义一下组，并且需要自动化的选择
	@ConditionalOnMissingClass("com.alibaba.fastjson.JSON")
	@Bean
	@Primary
	public FormateProcessor stringFormate() {
		return new StringFormateProccessor();
	}
	
	@ConditionalOnClass(name="com.alibaba.fastjson.JSON")
	@Bean
	public FormateProcessor jsonFormate() {
		return new JsonFormateProccessor();
	}
}
