package com.wz.course4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wz
 * @desc 04_源码分析--spring启动流程细节
 * @date 2021-08-22 17:28
 */
public class Course4 {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("person.xml");
	}
}
