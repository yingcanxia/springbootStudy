package com.example.demo.thirdDemo;

import java.lang.annotation.*;

import org.springframework.context.annotation.Import;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited//是否允许被继承
@Import({CacheImportSelector.class,LoggerDefinitionRegister.class})//与以前的config不同
public @interface EnableDefineService {

	//此处可以配置一些方法
	Class<?>[] exclude() default {};
}
