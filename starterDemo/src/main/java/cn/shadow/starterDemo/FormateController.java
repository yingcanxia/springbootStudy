package cn.shadow.starterDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.shadow.starter.HelloFormateTemplate;

@RestController
public class FormateController {
	//正常使用springMVC的时候是这样的：
	@Autowired
	private HelloFormateTemplate helloFormateTemplate;
	//但是并不行因为该类并没有被spring的IOC容器所托管
	//starter的作用就体现在此
	@GetMapping("/formate")
	public String formate() {
		User user=new User();
		user.setAge(18);
		user.setName("影残霞");
		return helloFormateTemplate.doFormate(user);
	}
}
