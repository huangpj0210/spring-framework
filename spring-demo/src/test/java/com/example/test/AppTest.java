package com.example.test;

import com.example.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author huangpj
 * @classname AppTest
 * @description
 * @create 2021/6/18 19:11
 **/
public class AppTest {

	@Test
	public void getBean(){
		//ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
		ClassPathResource resource = new ClassPathResource("spring-config.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);

		HelloService helloService = (HelloService) factory.getBean("helloService");
		helloService.hello();
	}
}
