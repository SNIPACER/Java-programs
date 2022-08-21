/*
Define a method which returns the 1 if the given number is even, in other case return 0
Name of method: isEven() // which accepts an integer value as argument and return 1 if the given number is even, else retrun 0.
Argument: int
Return type: an integer value 

*/

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number:");
		int x=sc.nextInt();
		System.out.println(new Task7().isEven(x));
	}
	int isEven(int a) {
		if(a%2 ==0) {
			System.out.println("Even");
			a=1;
		}
		else {
			System.out.println("Odd");
			a=0;
		}
		return a;
	}
}
