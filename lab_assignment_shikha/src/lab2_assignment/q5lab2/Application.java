package q5lab2;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		System.out.println("Enter the type of Vehicle");
		System.out.println("Enter '1',create Vehicle object");
		System.out.println("Enter '2',create Car object");
		System.out.println("Enter '3',create Convertible object");
		System.out.println("Enter '4',create SportCar object");

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		int noOfWheel;
		int noOfPassenger;
		int model;
		String make;
		int noOfDoor;
		Boolean isHoodOpen;

		Vehicle vehicle;
		switch (choice) {
		case 1:
			System.out.println("Enter the no of wheels");
			noOfWheel = sc.nextInt();

			System.out.println("Enter the no of Passengers");
			noOfPassenger = sc.nextInt();

			System.out.println("Enter the model");
			model = sc.nextInt();

			System.out.println("Enter the make");
			sc.nextLine();
			make = sc.nextLine();

			vehicle = new Vehicle(noOfWheel, noOfPassenger, model, make);
			System.out.println("Vehicle details");
			
			vehicle.display();
			break;

		case 2:
			System.out.println("Enter the no of wheels");
			noOfWheel = sc.nextInt();

			System.out.println("Enter the no of Passengers");
			noOfPassenger = sc.nextInt();

			System.out.println("Enter the model");
			model = sc.nextInt();

			System.out.println("Enter the make");
			sc.nextLine();
			make = sc.nextLine();

			System.out.println("Enter the no of Doors");
			noOfDoor = sc.nextInt();

			vehicle = new Car(noOfWheel, noOfPassenger, model, make, noOfDoor);
			System.out.println("Car details");
			
			vehicle.display();
			break;

		case 3:
			System.out.println("Enter the no of wheels");
			noOfWheel = sc.nextInt();

			System.out.println("Enter the no of Passengers");
			noOfPassenger = sc.nextInt();

			System.out.println("Enter the model");
			model = sc.nextInt();

			System.out.println("Enter the make");
			sc.nextLine();
			make = sc.nextLine();

			System.out.println("Enter the no of Doors");
			noOfDoor = sc.nextInt();

			System.out.println("Enter the is Hood open or not");
			isHoodOpen = sc.nextBoolean();

			vehicle = new Convertible(noOfWheel, noOfPassenger, model, make, noOfDoor, isHoodOpen);
			System.out.println("Convertible details");
			
			vehicle.display();
			break;

		case 4:
			System.out.println("Enter the no of wheels");
			noOfWheel = sc.nextInt();

			System.out.println("Enter the no of Passengers");
			noOfPassenger = sc.nextInt();

			System.out.println("Enter the model");
			model = sc.nextInt();

			System.out.println("Enter the make");
			sc.nextLine();
			make = sc.nextLine();

			vehicle = new SportCar(noOfWheel, noOfPassenger, model, make, 2);
			System.out.println("SportCar details");
			vehicle.display();
			break;
			
		 default:
			 System.out.println("No object created");
			 break;
		}

	}

}
