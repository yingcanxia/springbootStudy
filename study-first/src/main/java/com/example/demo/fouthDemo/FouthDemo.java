package com.example.demo.fouthDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.thirdDemo.EnableDemoMain;

import cn.shadow.myMaven.Mycore;

@SpringBootApplication
public class FouthDemo {

	public static void main(String[] args) {
		ConfigurableApplicationContext ca=SpringApplication.run(EnableDemoMain.class,args);
		System.out.println(ca.getBean(Mycore.class).study());
	}
}
