package spring.aop.annoatation;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Aspect
@Component
public class VlidationAspect {
	
	@Before("execution(* spring.aop.impl.ArithmeticCalculatorImpl.*(..))")
	public void validationArgs(JoinPoint jp) {
		System.out.println("validate:" + Arrays.asList(jp.getArgs()));
	}
	
	@After("LoggingAspect.declareJoinPointExpression()")
	public void afterMethod(JoinPoint jp) {
		System.out.println("vlidation end" );
	}
	
	@AfterReturning(value="spring.aop.impl.LoggingAspect.declareJoinPointExpression()", returning="result")
	public void afterReturning(JoinPoint jp, Object result) {
		System.out.println("vliadation" + " end with " + result );
	}
	
	
}
