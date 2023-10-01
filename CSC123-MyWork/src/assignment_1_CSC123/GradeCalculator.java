package assignment_1_CSC123;
import java.util.Scanner;
public class GradeCalculator {
	// Cristobal Yepez cyepez5@toromail.csudh.edu
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your score: ");
		Double n = input.nextDouble();
		
		char grade;
		String comment;
		
		if (n >= 90) {
			grade = 'A';
			comment = "Excellent";
		}
		else if (n >= 80) {
			grade = 'B';
			comment = "Good job";
		}
		else if (n >= 70) {
			grade = 'C';
			comment = "Needs Improvement";
		}
		else if (n >= 60) {
			grade = 'D';
			comment = "Needs Improvement";
		}
		else if (n <= 59 && n >= 0) {
			grade = 'F';
			comment = "Needs Improvement";
		}
		else {
			System.out.println("Invalid test score. Enter a test score from 1 to 100.");
		return;
		}

		System.out.println("Your grade is: " + grade);
		System.out.println("Comment: " + comment);
		
		input.close();
	}


}
