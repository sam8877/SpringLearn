package spring.aop.annoatation;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//order指定切面的优先级,值越小优先级越高
@Order(2)
//把这个类声明为一个切面:需要把该类放入到IOC容器中, 再声明为一个切面
@Aspect
@Component
public class LoggingAspect {
	
	//定义一个方法,用于声明切入点表达式,一般的该方法中不再需要添入其他代码
	@Pointcut("execution(public int spring.aop.impl.ArithmeticCalculatorImpl.*(..))")
	public void declareJoinPointExpression() {}
	
	
	
	//声明该方法是一个前置通知，在目标方法开始之前执行
	@Before("execution(public int spring.aop.impl.ArithmeticCalculatorImpl.*(..))")
	public void beforeMethod(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		List<Object> args = Arrays.asList(jp.getArgs());
		//Object args = jp.getArgs();
		System.out.println("the method " + methodName + " begin with " + args);
	}
	
	//后置通知:在目标方法执行后(无论是否发生异常)执行的通知
	//后置通知中还不能访问目标方法执行的结果。
	@After("declareJoinPointExpression()")
	public void afterMethod(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		System.out.println("the method " + methodName + " end" );
	}
	
	//在方法正常结束后执行的代码
	//返回通知是可以访问方法返回值的
	@AfterReturning(value="execution(public int spring.aop.impl.ArithmeticCalculatorImpl.*(int, int))", returning="result")
	public void afterReturning(JoinPoint jp, Object result) {
		String methodName = jp.getSignature().getName();
		System.out.println("the method " + methodName + " end with " + result );
	}
	
	//在目标方法出席现异常时，会运行的代码
	//可以访问到异常对象,且可以指定在出现特定异常时才执行通知代码
	@AfterThrowing(value="execution(public int spring.aop.impl.ArithmeticCalculatorImpl.*(int, int))", throwing="ex")
	public void afterThrowing(JoinPoint jp, Exception ex) {
		String methodName = jp.getSignature().getName();
		System.out.println("the method " + methodName + " occour excetion with: " + ex);
	}
	
	//需要ProceedingJoinPoint类型的参数
	//环绕通知类似于动态代理的全过程:ProceedingJoinPoint 类型的参数可以决定是否执行目标方法
	//且环绕通知必须有返回值，返回值即目标方法的返回值
//	@Around(value="execution(public int spring.aop.impl.ArithmeticCalculatorImpl.*(int, int))")
//	public Object aroundMethod(ProceedingJoinPoint pjd) {
//		Object result = null;
//		String methodName = pjd.getSignature().getName();
//		List<Object> args = Arrays.asList(pjd.getArgs());
//		try {
//			//前置通知
//			System.out.println("the method " + methodName + " begin with " + args);
//			result = pjd.proceed();
//			//返回通知
//			System.out.println("the method " + methodName + " end with " + result );
//			
//		} catch (Throwable e) {
//			e.printStackTrace();
//			//异常通知
//			System.out.println("the method " + methodName + " occour excetion with: " + e);
//		}finally {
//			//后置通知
//			System.out.println("the method " + methodName + " end");
//		}
//		return result;
//	}
	
	
}
