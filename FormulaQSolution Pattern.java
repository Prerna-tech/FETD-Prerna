import java.util.Scanner;

public class FormalQSolution {
	public static void main(String[] args) {
		formulaQ("FORMULAQSOLUTIONS");
	}
	
	
	public static void formulaQ(String str)
	{
		for (int i = 0; i <=str.length()/2; i++) {
			for (int j =i; j <=str.length()/2; j++) 
				System.out.print(" ");
			int k=i;
			
			for (int j = 0; j < (i*2)+1; j++) {
				if (k==str.length()) k=0;
					System.out.print(str.charAt(k++));
			}
			System.out.println();
		}
		
		for (int i = 0; i <str.length()/2; i++) {
			for (int j =0; j <=i+1; j++) {
				System.out.print(" ");
			}
			int k=str.length()/2+1+i;
			for (int j =i*2; j<str.length()-2; j++) {
				if (k==str.length()) k=0;
					System.out.print(str.charAt(k++));
			}
			System.out.println();
		}
	}
}
