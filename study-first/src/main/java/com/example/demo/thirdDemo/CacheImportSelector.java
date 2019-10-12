package com.example.demo.thirdDemo;

import java.util.Map;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class CacheImportSelector implements ImportSelector{

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
			//注解中的原数据
		// TODO Auto-generated method stub
		//可以定义
		Map<String, Object>attributes= importingClassMetadata.getAnnotationAttributes(EnableDefineService.class.getName());
		
		//在这里可以写自己的内容。返回的String数组及时给spring容器托管的bean
		//这里可以进行判断取到标签EnableDefineService中的内容
		return new  String[] {CacheService.class.getName()};//返回的是固定的service，是spring进行托管
	}

}
