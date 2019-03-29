package spring.beans.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.beans.annotation.controller.UserController;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");
		
//		TestObject to = (TestObject) ctx.getBean("testObject");
//		System.out.println(to);
		
		UserController uc = (UserController) ctx.getBean("userController");
		System.out.println(uc);
		uc.execute();
		
//		UserService us =  (UserService) ctx.getBean("userService");
//		System.out.println(us);
//		
//		UserRepository ur = (UserRepository) ctx.getBean("userRepository");
//		System.out.println(ur);
		
		((AbstractApplicationContext) ctx).close();
	}
}
