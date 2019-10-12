package com.example.demo.firstDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
//@ComponentScan(basePackages="????")来制定扫描的包
public class ConfigurationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ConfigurationMain.class);
		/*
		 * DemoClass class1= applicationContext.getBean(DemoClass.class);
		 * class1.sayHello();
		 */
		String [] name=applicationContext.getBeanDefinitionNames();
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
	}
}
