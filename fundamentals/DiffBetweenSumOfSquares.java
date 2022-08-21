/*
Create a class with a method to find the difference between the sum of the squares and the square of the sum of the first n natural numbers.
Method name: calculateDifference
Argument : int
Return type : int
For eg: if n is 10, you have to find
(1(square)+2(square)+3(square)+.....10(square)) - (1+2+3+.....+10)(square)    

output:
------
Please enter the final number
10
-2640
*/

import java.util.Scanner;
public class Task2 {
	int add,addi,sum,diff;
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int r=sc.nextInt();
			System.out.println(new Task2().calculateDifference(r));
		}
	}
	int calculateDifference(int n) {
		for(int i=1;i<=n;i++) {
			add=i*i;
			addi+=add;//385
		}
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		sum*=sum;
		diff=addi-sum;
		return diff;
	}
}
