package q3lab1;

import java.util.Scanner;

public class GradeStudents {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of Students");
		Scanner sc=new Scanner(System.in);
		int numStudents=sc.nextInt();
		
		int grades[]=new int[numStudents];
		findStudentGrades(grades);
	}

	private static void findStudentGrades(int[] grades) {
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<grades.length;i++){
			
			System.out.println("Enter the grade for student "+i+":");
			grades[i]=sc.nextInt();
			
			if(grades[i] > 100){
				System.out.println("Invalid grade, try again...");
				i--;
			}
		}
		
		float avg=0;
		
		for(int i=0;i<grades.length;i++) {
			avg+=grades[i];
		}
		System.out.print("The average is:"+ avg/grades.length);
	
	}

}
