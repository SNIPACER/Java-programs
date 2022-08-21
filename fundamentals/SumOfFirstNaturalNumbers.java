package prograjfds;

import java.util.Scanner;

public class Test1 {
	/*
	 * Create a class with a method which can calculate the sum of first n natural numbers
	 * which are divisible by 3 or 5
	 * method name:- calculateSum
	 * Argument:- int
	 * Return type:- int
	 */
		int sum;
		public static void main(String[] args) {
			try (Scanner sc = new Scanner(System.in)) {
				int r=sc.nextInt();
				System.out.println(new Test1().calculateSum(r));
			}
		}
		int calculateSum(int n) {
			for(int i=1;i<=n;i++) {
				if(i%3==0 || i%5==0) {
					sum+=i;
				}
			}
			return sum;
		}
	}
