package assignment_1_CSC123;
import java.util.Scanner;
public class PalindromeChecker {
	// Cristobal Yepez cyepez5@toromail.csudh.edu
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String n = input.nextLine();
		
		if (palindrome(n))  {
			System.out.println("The string is a palindrome.");
		}
		else {
			System.out.println("The string is not a palindrome.");		
		}
		input.close();
	}

	
public static boolean palindrome(String string) {
	string = string.replaceAll("[^a-zA-Z]", "").toLowerCase();
	
	int beginning = 0;
	int end = string.length() - 1;
	
	while (beginning < end) {
		if (string.charAt(beginning) != string.charAt(end)) {
			return false;
		}
		beginning++;
		end--;
	}
	return true;
	}	
}

