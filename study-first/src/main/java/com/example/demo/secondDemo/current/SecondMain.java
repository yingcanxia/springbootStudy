package com.example.demo.secondDemo.current;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SecondMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig.class);
		String[]names=applicationContext.getBeanDefinitionNames();
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
	}
}
