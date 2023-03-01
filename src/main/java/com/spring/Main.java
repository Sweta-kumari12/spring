package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	//declares a private static variable called "context" of type ApplicationContext.

	private static ApplicationContext context;
public static void main(String[] args) {
	/*creates a new instance of ClassPathXmlApplicationContext, which loads the Spring 
	 * configuration file "beans.xml" from the classpath and creates a Spring application context.
	 */
	context=new ClassPathXmlApplicationContext("beans.xml");
	//retrieves the "HelloBean" bean from the Spring context using the "getBean" method.

	HelloBean helloBean=(HelloBean)context.getBean("HelloBean");
	
	helloBean.sayHello();
}
}
