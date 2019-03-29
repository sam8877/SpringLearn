package spring.beans.generic.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-generic-di.xml");
		UserService us = (UserService) ctx.getBean("userService");
		us.add();
		
		((AbstractApplicationContext) ctx).close();
	}
}
