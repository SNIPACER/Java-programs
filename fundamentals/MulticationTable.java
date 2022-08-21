/*
Display Multiplication number table: 

output:
---------
Please enter the Multiplication number:
5
Please enter the FIRST number: 
1
Please enter the the LAST number:
10
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50


*/



import java.util.Scanner;

public class MultiplicationTable {
	
	public static void Multiply(int a,int b,int c) {
		for(int i=b;b<=c;b++) {
			System.out.println(a+" x "+b+" = "+a*b);
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the Multiplication number:");
		int multi=scan.nextInt();
		System.out.println("Please enter the FIRST number: ");
		int first=scan.nextInt();
		System.out.println("Please enter the the LAST number:");
		int second =scan.nextInt();
		
		Multiply(multi, first, second);
	}
}
