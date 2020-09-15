package q4lab1;

import java.util.Scanner;

public class CopyClass {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		
		int array[]=new int[n];
		
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		System.out.println("Original Array");
		printCopyArray(array);
		System.out.println();
		
		int arr[]=copyOf(array);
		
		System.out.println("Copied Array");
		printCopyArray(arr);
		
	}
	private static void printCopyArray(int[] arr) {
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	public static int[] copyOf(int[] array) {
		
		return array;
		
	}

}
