package beans;

public class Car {
	
	private String carName;
	private Engine engine;
	
	public void setCarName(String carName) {
		this.carName=carName;
	}
	
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
	
	public void printData() {
		System.out.println("This car is: "+carName);
		System.out.println("This engine has model year of: "+engine.getModelYear());
	}
}
