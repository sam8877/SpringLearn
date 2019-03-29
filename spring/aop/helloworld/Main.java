package spring.aop.helloworld;

public class Main {
	public static void main(String[] args) {
//		ArithmeticCalculator arithmeticCalculator = null;
//		arithmeticCalculator = new ArithmeticCalculatorImpl();
		
		ArithmeticCalculator target = new ArithmeticCalculatorImpl();
		ArithmeticCalculator proxy = new ArithmeticCalculatorLoggingProxy(target).getLoggingProxy();
		
		
		proxy.add(2, 3);
		proxy.sub(1, 2);
		proxy.mul(3, 3);
		proxy.div(8, 2);
		

	}
}
