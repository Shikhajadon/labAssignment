package q2lab1;

class FindTimeTable{
	private int arr[][];
	
	public FindTimeTable(){
		
		arr=new int[9][9];
		
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++) {
				arr[i-1][j-1]=i*j;
			}
			
		}
	}
	
	public void printTable(){
		
		System.out.print("*|");
		for(int i=1;i<=9;i++){
			System.out.print(" "+i);
		}
		System.out.println();
		System.out.print("--");
		for(int i=1;i<=9;i++){
			System.out.print("--");
		}
		System.out.println();
		for(int i=1;i<=9;i++){
			
			System.out.print(i+"|");
			for(int j=1;j<=9;j++) {
				
				System.out.print(arr[i-1][j-1]+" ");
			}
			System.out.println();
		}
	}
}

public class TimeTable {
	public static void main(String[] args) {
		FindTimeTable f=new FindTimeTable();
		f.printTable();
	}

}
