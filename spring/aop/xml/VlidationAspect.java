package spring.aop.xml;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;

public class VlidationAspect {
	
	public void validationArgs(JoinPoint jp) {
		System.out.println("validate:" + Arrays.asList(jp.getArgs()));
	}
	
	public void afterMethod(JoinPoint jp) {
		System.out.println("vlidation end" );
	}
	
	public void afterReturning(JoinPoint jp, Object result) {
		System.out.println("vliadation" + " end with " + result );
	}
	
	
}
