package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApps2 {
public static void main(String[] args) {
	//Triangle triangle=new Triangle();
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("Spring.xml"));
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring2.xml");
	context.registerShutdownHook();
	Triangles2 triangle=(Triangles2)context.getBean("triangle");
	triangle.draw();

}
}
