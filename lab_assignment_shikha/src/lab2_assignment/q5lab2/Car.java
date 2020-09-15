package q5lab2;

public class Car extends Vehicle {
	private int noOfDoor;

	public Car(int noOfWheel, int noOfPassenger, int model, String make,int noOfDoor) {
		super(noOfWheel, noOfPassenger, model, make);
		this.noOfDoor=noOfDoor;
	}
	@Override
	public void display()
	{
		System.out.println("Manufacture on "+this.getMake()+", Model "+this.getModel()+", No of Doors "+noOfDoor);
	}
	
}
