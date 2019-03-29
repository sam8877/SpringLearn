package spring.aop.annoatation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ArithmeticCalculator arithmeticCalculator = (ArithmeticCalculator) ctx.getBean(ArithmeticCalculator.class);
		arithmeticCalculator.add(3, 6);
		arithmeticCalculator.div(12, 2);
		
		((AbstractApplicationContext) ctx).close();
	}
	
}
