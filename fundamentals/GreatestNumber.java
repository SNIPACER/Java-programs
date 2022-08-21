/*
Define a method which returns the greatest number among two numbers.
Write the method with the following specifications: 
Name of method: getGreatest() // which accepts two integer values as argument and return the greatest value.
Arguments: two argument of type integer
Return type: an integer value 
Specifications: The value returned by the method getGreatest() is determined by the following rules:
If any of the given numbers are negative, return -1.
If any of the given numbers are zero, return -2.
If the given numbers are positive, return the greatest.
*/

import java.util.Scanner;

public class Task8{

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter any 2 numbers: ");
		int x=scan.nextInt();
		int y =scan.nextInt();
		System.out.println(new Task8().getGreatest(x,y));
	}
	int getGreatest(int a,int b) {
		int val=0,z=0;
		if(a<0 || b<0) {
			System.out.println("Given numbers are Negative");
			z=-1;
		}
		else if((a!=0 || b!=0) && a>0 || b>0 ) {
			if(a>b) {
				System.out.println("Greatest value: ");
				val=a;
			}
			else {
				System.out.println("Smallest value: ");
				val=b;
			}
			z=val;
		}
		else {
			z=-2;
		}
		return z;
		
	}
}
