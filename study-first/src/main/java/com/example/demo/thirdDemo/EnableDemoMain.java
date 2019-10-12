package com.example.demo.thirdDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDefineService(exclude = {LoggerService.class})//可以带参数
public class EnableDemoMain {
//在这里带的参数是可以在后边可以检测的到这样可以进行判断配置
	public static void main(String[] args) {
		SpringApplication.run(EnableDemoMain.class, args);
	}
}
