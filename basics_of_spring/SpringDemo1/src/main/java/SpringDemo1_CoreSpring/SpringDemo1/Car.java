package SpringDemo1_CoreSpring.SpringDemo1;

public class Car {

	public Car(){
		System.out.println("car constructor called");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		System.out.println("car model setter called");
		this.model = model;
	}

	private String model;

	public void run() {
		System.out.println("car is running");
	}

}
