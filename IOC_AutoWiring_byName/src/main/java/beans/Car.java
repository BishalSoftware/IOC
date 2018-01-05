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
		System.out.println("The name of car is: "+carName);
		System.out.println("The fuel consumption of engine is of type: "+engine.getEngineFuel());
	}
}
