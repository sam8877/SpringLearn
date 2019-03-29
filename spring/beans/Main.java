package spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld hw = (HelloWorld) ctx.getBean("helloworld");
		//HelloWorld hw = ctx.getBean(HelloWorld.class);
		System.out.println(hw);
		hw.hello();
		
		Car car=(Car) ctx.getBean("car");
		System.out.println(car);
		
		car=(Car) ctx.getBean("car2");
		System.out.println(car);
		
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
		
		((AbstractApplicationContext) ctx).close();
	}
}
