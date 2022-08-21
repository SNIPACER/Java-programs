/*
Define a method which returns the sum of three numbers after rounding off each number to the next multiple of 10. If any of the given number is multiple of 10 dont change it's value
Write the method with the following specifications:
Name of method sumofMultiples () // which accepts three integer value as argument and return the sum of three numbers after rounding off each number to the next multiple of 10.
Example
----------
if a = 23, b = 34, c = 69
30+ 40+ 70 = 140 

if a = 23, b = 34, c = 50
30+ 40+ 50 = 120
 
if a = 32 , b = 51, c = 64
40+ 60+ 70 = 170

Arguments: three argument of type integer
Return Type: an integer value Specifications: The value returned by the method sumofMultiples() is determined by the following rules:
if any of the given number is negative or zero, return -1. if the number is an multiple of 10
if the given number is odd, return cube of the given number.


*/

import java.util.Scanner;

public class Task6 {
	int x,y,z,a=1; long q;
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int r=sc.nextInt();
			int s=sc.nextInt();
			int t=sc.nextInt();
			Task6 obj= new Task6();
			System.out.println(obj.sumOfMultiples(r, s, t));
		}
	}
	long sumOfMultiples(int a, int b, int c) {
		if(a<=0 || b<=0 || c<=0) {
			return -1;
		}
		else {
			if(a%10!=0 && a>9) {
				x=a/10;
				x+=1;
				x=x*10;
			}
			else {
				x=a;
			}
			if(b%10!=0 && b>9) {
				y=b/10;
				y+=1;
				y*=10;
				}
			else {
				y=b;
			}
			if(c%10!=0 && c>9) {
				z=c/10;
				z+=1;
				z=z*10;
			}
			else {
				z=c;
			}
			

		}
		if((x+y+z)%2!=0) {
			q=x+y+z;
			q=q*q*q;
			return q;
			}
		else 
			return (x+y+z);
		
	}
}
