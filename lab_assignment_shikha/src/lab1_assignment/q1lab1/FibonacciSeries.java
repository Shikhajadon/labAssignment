package q1lab1;

class Fibo
{
	private int arr[];
	private int n;
	private float sum;
	
	public Fibo(int n){
		this.n=n;
		arr =new int[n];
	}
	
	public void findFibo(){
		arr[0]=1;
		arr[1]=1;
		for(int i=2;i<n;i++)
		{
			arr[i]=arr[i-1]+arr[i-2];
		}
	}
	
	public void printFibo(){
		sum=0;
		System.out.println("The first 20 Fibonacci numbers are: ");
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
	public void findAvg()
	{
		System.out.println("The average is "+sum/n);
	}
}

public class FibonacciSeries {
	
	public static void main(String[] args){
		
		Fibo f=new Fibo(20);
		f.findFibo();
		f.printFibo();
		f.findAvg();
		
	}

}
