package spring.beans.cycle;

public class Car {
	
	private String brand;

	public Car() {
		System.out.println("Car's Constructor...");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		System.out.println("set brand...");
		this.brand = brand;
	}
	
	private void init() {
		System.out.println("init...");
	}
	
	private void destroy() {
		System.out.println("destroy...");
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + "]";
	}
	
	
	
}
