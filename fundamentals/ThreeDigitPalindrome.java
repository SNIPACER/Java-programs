/*
Define a method which returns the 1 if the given three digit number is palindrome, in other case return 0. write the method with the following specifications:
Name of method isPalindrome () // which accepts an integer value as argument and return true if the given number is palindrome, else return false.
Arguments: one argument of type integer
Return Type: an integer value
Specifications: The value returned by the method isPalindrome () is determined
by the following rules:
if the given number is on three digit number, retun 1 if the number is
palindrome, else return 8. Example: if x 232, return 1. if x 345, return
if the given number is negative or zero, return -1
if the given number is not an three digit number, return -2
*/

import java.util.Scanner;

public class Task5 {
	int n,m,y=0,z;
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int x=sc.nextInt();
			System.out.println(new Task5().isPalindrome(x));
		}
		
	}
	int isPalindrome(int a) 
	{
		
		if(a<=0) {
			return -1;
		}
		if(a>999) {
			return -2;
		}
		if(a>99 && a<1000) {
			m=a;
			while(a!=0) {
				z=a%10;
				y=y*10+z;
				a=a/10;
			}
			if(m==y) {
        System.out.println(y);
				return 1;
			}
			else 
				return 0;
		}
		else 
			return 0;
		
	}
}
