package spring.beans;

public class HelloWorld {
	private String name;
	
	public HelloWorld() {
		System.out.println("HelloWorld's Constructor...");
	}
	
	public void setName(String name) {
		System.out.println("setname:"+name);
		this.name = name;
	}
	
	public void hello() {
		System.out.println("hello:"+name);
	}
}
