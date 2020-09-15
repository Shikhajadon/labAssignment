package q4lab2;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		System.out.println("Enter the details like name,id and grade");

		String choice;

		String name = null;
		String id = null;
		double grade = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Do yo want to provide name// type 'y' for yes and 'n' foe no");
         choice = sc.nextLine();
		if (choice.equals("y")) {
			System.out.println("Enter your name");
			name = sc.nextLine();
		}

		/*System.out.println("Do yo want to provide id// type 'y' for yes and 'n' foe no");

		choice = sc.nextLine();

		if (choice.equals("y")) {
			System.out.println("Enter your id");
			sc.nextLine();
			id = sc.nextLine();
		}*/

		System.out.println("Do yo want to provide grade// type 'y' for yes and 'n' foe no");

		choice = sc.nextLine();

		if (choice.equals("y")) {
			System.out.println("Enter your grade");
			grade = sc.nextDouble();
		}
		
		System.out.println("Enter your id");

		id = sc.nextLine();
		
		Student student=null;
		if(name!=null && grade!=0)
		{
			student=new Student(name,id,grade);
		}
		else if(name!=null && grade==0)
		{
			student=new Student(name,id);
		}
		else if(name==null && grade==0)
		{
			student=new Student(id);
		}
		
		System.out.println("Student registered succesfully");
		
		System.out.println("Do yo want to provide year// type 'y' for yes and 'n' foe no");

		choice = sc.nextLine();

		int year=2000;
		if (choice.equals("y")) {
			System.out.println("Enter your year");
			year = sc.nextInt();
		}
		if(year>2000)
		{
			student.display(year);
		}
		else
		{
			student.display();
		}
		sc.close();	
	}

}
