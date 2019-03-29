package spring.aop.hello;

public class HelloWorldImpl1 implements HelloWorld {

	@Override
	public void printHelloWorld() {
		System.out.println("Enter HelloWorldImpl1.printHelloWorld()");
	}

	@Override
	public void doPrint() {
		System.out.println("Enter HelloWorldImpl1.doPrint()");
	}

}
