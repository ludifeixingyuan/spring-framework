package com.wz.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 王宗滨
 * @desc
 * @date 2021-08-21 21:32
 */
@Configuration
@ComponentScan("com.wz")
public class MainStat {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MainStat.class);
		UserServiceImpl bean = context.getBean(UserServiceImpl.class);
		bean.sayHello();

	}
}
