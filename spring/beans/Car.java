package spring.beans;

public class Car {
	
	private String brand;
	private int maxSpeed;
	private double price;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		System.out.println("setBrand....");
		this.brand = brand;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		System.out.println("setMaxSpeed...");
		this.maxSpeed = maxSpeed;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", maxSpeed=" + maxSpeed + ", price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Car init...");
	}
	
	public void destroy() {
		System.out.println("Car destory...");
	}
	
	public Car() {
		System.out.println("Car's consturctor...");
	}
	public Car(String brand, int maxSpeed, double price) {
		super();
		this.brand = brand;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}
	public Car(String brand, int maxSpeed) {
		super();
		this.brand = brand;
		this.maxSpeed = maxSpeed;
	}
	public Car(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	
	
	
}
