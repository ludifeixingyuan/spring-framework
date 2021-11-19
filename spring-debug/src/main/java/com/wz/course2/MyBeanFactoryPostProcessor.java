package com.wz.course2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author wangzongbin
 * @date 2021-11-19
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// do something
		// BeanDefinition a = beanFactory.getBeanDefinition("a");
		System.out.println("设置BeanDefinition");
	}
}
