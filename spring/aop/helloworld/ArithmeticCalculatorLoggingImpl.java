package spring.aop.helloworld;

public class ArithmeticCalculatorLoggingImpl implements ArithmeticCalculator {

	@Override
	public int add(int i, int j) {
		System.out.println("The mathod add begins with [" + i + "," + j + "]");
		int result = i+j;
		System.out.println("The mathod add end with: " + result);
		return result;
	}

	@Override
	public int sub(int i, int j) {
		System.out.println("The mathod sub begins with [" + i + "," + j + "]");
		int result = i-j;
		System.out.println("The mathod sub end with: " + result);
		return result;
	}

	@Override
	public int mul(int i, int j) {
		System.out.println("The mathod mul begins with [" + i + "," + j + "]");
		int result = i*j;
		System.out.println("The mathod mul end with: " + result);
		return result;
	}

	@Override
	public int div(int i, int j) {
		System.out.println("The mathod div begins with [" + i + "," + j + "]");
		int result = i/j;
		System.out.println("The mathod div end with: " + result);
		return result;
	}

}
