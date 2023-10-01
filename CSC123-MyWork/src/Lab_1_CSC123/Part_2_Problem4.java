package Lab_1_CSC123;

import java.util.Scanner;

public class Part_2_Problem4 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.println("Input the first number: ");
		int n = input.nextInt();
		
		System.out.println("Input second number: ");
		int m = input.nextInt();
		
		System.out.println("Input third number: ");
		int o = input.nextInt();
		
		if (n > m) {
		System.out.println("The result is: True");
		}
		else if(o > m) {
			System.out.println("The result is: True");
		}
		
		else {
			System.out.println("The result is: False");
		}
	}
}


