package spring.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop-xml.xml");
		ArithmeticCalculator arithmeticCalculator = (ArithmeticCalculator) ctx.getBean("arithmeticCalculator");
		int result = arithmeticCalculator.add(3, 6);
		System.out.println(result);
		result = arithmeticCalculator.div(12, 2);
		System.out.println(result);
		
		((AbstractApplicationContext) ctx).close();
	}
	
}
