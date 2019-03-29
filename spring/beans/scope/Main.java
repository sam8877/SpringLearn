package spring.beans.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.beans.autowire.Car;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-scope.xml");
		Car car = (Car) ctx.getBean("car");
		Car car2 = (Car) ctx.getBean("car");
		
		System.out.println(car==car2); //car 和 car2 为同一个对象。
										//默认类型为singelton
		
		Car car3 = (Car) ctx.getBean("newcar");
		Car car4 = (Car) ctx.getBean("newcar");
		System.out.println(car3==car4);
		
		((AbstractApplicationContext) ctx).close();
	}
}
