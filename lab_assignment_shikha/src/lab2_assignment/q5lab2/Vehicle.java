package q5lab2;

public class Vehicle {
	private int noOfWheel;
	private int noOfPassenger;
	private int model;
	private String make;
	
	
	public Vehicle(int noOfWheel, int noOfPassenger, int model, String make) {
		super();
		this.noOfWheel = noOfWheel;
		this.noOfPassenger = noOfPassenger;
		this.model = model;
		this.make = make;
	}
	

	public int getNoOfWheel() {
		return noOfWheel;
	}


	public void setNoOfWheel(int noOfWheel) {
		this.noOfWheel = noOfWheel;
	}


	public int getNoOfPassenger() {
		return noOfPassenger;
	}


	public void setNoOfPassenger(int noOfPassenger) {
		this.noOfPassenger = noOfPassenger;
	}


	public int getModel() {
		return model;
	}


	public void setModel(int model) {
		this.model = model;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public void display() {
		System.out.println("Manufactured on "+ make +", Model "+model+", No of wheels "+noOfWheel+", No of Passengers "+noOfPassenger);
	}
}
