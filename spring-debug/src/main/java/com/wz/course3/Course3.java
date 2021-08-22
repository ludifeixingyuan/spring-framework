package com.wz.course3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * main方法
 *
 * @desc 观察context启动执行流程 refresh()
 * @author wz
 * @date 2021/08/22
 */
public class Course3 {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("person.xml");
        Person bean = ac.getBean(Person.class);
        Person bean2 = ac.getBean(Person.class);
		System.out.println(bean);
		System.out.println(bean2);
    }
}
