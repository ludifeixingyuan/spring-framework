package com.wz.course2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wz
 * @desc
 * @date 2021-08-22 17:28
 */
public class Course2 {
	public static void main(String[] args) {
		// BeanDefinition 经过 BeanFactoryPostProcessor增强
		ApplicationContext context = new ClassPathXmlApplicationContext("myBeanFactoryPostProcessor.xml");
		A bean = context.getBean(A.class);
		// 获取类实现的ApplicationContextAware接口
		// 会打印出 org.springframework.context.support.ClassPathXmlApplicationContext@256216b3, started on Sat Nov 20 00:06:52 CST 2021
		System.out.println(bean.getApplicationContext());
		// 获取类实现的EnvironmentAware接口
		// 会打印出 StandardEnvironment {activeProfiles=[], defaultProfiles=[default], propertySources=[PropertiesPropertySource {name='systemProperties'}, SystemEnvironmentPropertySource {name='systemEnvironment'}]}
		System.out.println(bean.getEnvironment());
	}
}
