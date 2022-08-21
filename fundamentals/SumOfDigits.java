/*
Define a method which return the sum of digits of the given two digit number.
Write the method with the following specification:
Name of method getSumOfDigits() // which accepts an integer value as argument and return the sum of it’s digits
Arguments: one argument of type integer
Return type: int
Specification: The value returned by the method getSumOfDigits() is determined by the following rules:
If the given value is in between 10 and 99, return sum of it’s digits.
Example:-
---------
If x = 34, return 7
If the given value is negative, return -3
If the given value is greater than 99, return -2
If the given value is in between 0 and 9, return -1.


*/


import java.util.Scanner;

public class Test1 {
	
	int x,y,sum;
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int x=sc.nextInt();
			System.out.println("Please enter TWO digit number:");
			System.out.println(new Test1().getSumOfDigits(x));
		}
	}
	int getSumOfDigits(int a) {
		if(a>=10 && a<=99) {
			x=a%10;
			y=a/10;
			return x+y;
		}
		if(a<0) {
			return -3;
		}
		if(a>99) {
			return -2;
		}
		if(a>=0 && a<10) {
			return -1;
		}
		else
			return 0;
	}
}
