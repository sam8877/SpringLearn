package spring.aop.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args)
	{
	    ApplicationContext ctx = new ClassPathXmlApplicationContext("aop-hello.xml");
	    
	    HelloWorld hw1 = (HelloWorld)ctx.getBean("helloWorldImpl1");
	    HelloWorld hw2 = (HelloWorld)ctx.getBean("helloWorldImpl2");
	    hw1.printHelloWorld();
	    System.out.println();
	    hw1.doPrint();
	    
	    System.out.println();
	    hw2.printHelloWorld();
	    System.out.println();
	    hw2.doPrint();
	    
	    ((AbstractApplicationContext) ctx).close();
	    
	}
}
