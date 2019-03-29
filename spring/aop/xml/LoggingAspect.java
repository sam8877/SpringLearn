package spring.aop.xml;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {
	
	public void declareJoinPointExpression() {}
	
	
	
	public void beforeMethod(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		List<Object> args = Arrays.asList(jp.getArgs());
		//Object args = jp.getArgs();
		System.out.println("the method " + methodName + " begin with " + args);
	}
	
	public void afterMethod(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		System.out.println("the method " + methodName + " end" );
	}
	
	public void afterReturning(JoinPoint jp, Object result) {
		String methodName = jp.getSignature().getName();
		System.out.println("the method " + methodName + " end with " + result );
	}
	
	public void afterThrowing(JoinPoint jp, Exception ex) {
		String methodName = jp.getSignature().getName();
		System.out.println("the method " + methodName + " occour excetion with: " + ex);
	}
	
	public Object aroundMethod(ProceedingJoinPoint pjd) {
		Object result = null;
		String methodName = pjd.getSignature().getName();
		List<Object> args = Arrays.asList(pjd.getArgs());
		try {
			System.out.println("the method " + methodName + " begin with " + args);
			result = pjd.proceed();
			System.out.println("the method " + methodName + " end with " + result );
			
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println("the method " + methodName + " occour excetion with: " + e);
		}finally {
			System.out.println("the method " + methodName + " end");
		}
		return result;
	}
	
	
}
