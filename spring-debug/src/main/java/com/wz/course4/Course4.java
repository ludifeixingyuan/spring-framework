package com.wz.course4;

import com.wz.course3.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Constructor;

/**
 * @author wz
 * @desc 04_源码分析--spring启动流程细节
 * @date 2021-08-22 17:28
 */
public class Course4 {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("person.xml");
		Integer x = 3 << 2;
		System.out.println(x);
	}

}
