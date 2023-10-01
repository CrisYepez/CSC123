package assignment_1_CSC123;
import java.util.Scanner;
public class PatternGenerator {
	// Cristobal Yepez cyepez5@toromail.csudh.edu
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		int n = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
			 System.out.print("* ");
			}
			System.out.println();
	}
	}
}
