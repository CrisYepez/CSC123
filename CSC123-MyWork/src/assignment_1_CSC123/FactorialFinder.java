package assignment_1_CSC123;
import java.util.Scanner;
public class FactorialFinder {
	// Cristobal Yepez cyepez5@toromail.csudh.edu
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a positive integer: ");
		int integer = input.nextInt();
		
		if (integer < 0) {
			System.out.println("Please enter a positive integer: ");
		}
		else {
			long factorial = calFactorial(integer);
			System.out.println("The factorial of " + integer + " is " + factorial);
		}
		input.close();
	}
		public static long calFactorial(int n) {
			if (n == 0 || n == 1) {
				return 1;
			}
			else {
				long factorial = 1;
				for (int i = 2; i <= n; i++) {
					factorial*= i;
				}
				return factorial;
		}
	}
}
