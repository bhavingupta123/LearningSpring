package SpringDemo1_CoreSpring.SpringDemo1;

public class Car {

	//	private Tyre tyre = new Tyre(); old way of creating object
	private String model;
	private Tyre tyre;

	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

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

	public void run() {
		System.out.println("car is running");
		System.out.println("tyre is of type:" + tyre.getName());
	}

}
