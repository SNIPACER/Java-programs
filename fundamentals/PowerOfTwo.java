/*
Create a class with a method to check if a number is a power of two or not.
Method name: checkNumber
Argument: int 
Return type: boolean
For eg: 8 is a power of 2 so return true

*/
import java.util.Scanner;

public class Test1 {
	int sum=1;
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int r = sc.nextInt();
			System.out.println(new Test1().checkNumber(r));
		}
	}
	boolean checkNumber(int a) {
		for (int i = 1; i < a ; i++) {
			sum = sum * 2;
			if (sum == a)
				break;
		}
		if (sum == a)
			return true;
		else
			return false;
	}
}
