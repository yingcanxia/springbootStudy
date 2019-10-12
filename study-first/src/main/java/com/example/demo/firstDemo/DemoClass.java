package com.example.demo.firstDemo;

import org.springframework.stereotype.Service;

//这个类如果想被托管需要进行注册
/**
 * 
 * @author shadow
 * 需要在配置文件进行配置
 * <bean id="" class="com.example.demo.firstDemo.DemoClass">
 */
@Service
public class DemoClass {
	public void sayHello() {
		System.out.println("hello!");
	}
}
