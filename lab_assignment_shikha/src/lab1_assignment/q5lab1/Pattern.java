package q5lab1;

public class Pattern {
	public static void main(String[] args){
		printPattern(8);
	}

	private static void printPattern(int n) {
		// TODO Auto-generated method stub
		
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
