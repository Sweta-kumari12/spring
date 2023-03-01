package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
public static void main(String[] args) {
	//Triangle triangle=new Triangle();
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("Spring.xml"));
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	context.registerShutdownHook();
	//Triangles triangle=(Triangles)context.getBean("triangle");
	//triangle.draw();
	//circle Circle=(circle)context.getBean("circle");
	//Circle.draw();
	shape Shape=(shape)context.getBean("circle");
	shape Shape1=(shape)context.getBean("triangle");

	Shape.draw();
    Shape1.draw();
}
}
