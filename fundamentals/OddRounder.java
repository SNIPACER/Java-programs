/*
Define a method which returns the number it if it is an even number, if the number is odd then return the next multiple of 10.
Write the method with the following specifications: 
Name of method: oddRounder() // which accepts an integer value as argument and return the same value if it is an even number, if the value is odd then return the next multiple of 10. 
Arguments: one argument of type integer
Return Type: an integer value 
+-----------------------------------------------------------------+
+   Example if x = 24 then return 24, if x = 25 then return 30.   +
+-----------------------------------------------------------------+
Specifications: The value returned by the method oddRounder() is determined by the following rules:
If any of the given number is negative, return -1.
If any of the given number is zero, return -2.
If the given number is even, return the same number.
If the given number is odd, return the next multiple of 10.
*/


import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			int r=sc.nextInt();
			System.out.println(new Task10().oddRounder(r));
		}
	}
	int oddRounder(int a) {
		if(a<0) {
			return-1;
		}
		if(a==0){
			return -2;
		}
		if(a%2!=0) {
			a=a/10;
			a+=1;
			a*=10;
			return a;
		}
		if(a%2==0) {
			return a;
		}
		else {
			return 0;
		}
	}
}
