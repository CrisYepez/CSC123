package assignment_1_CSC123;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		// Cristobal Yepez cyepez5@toromail.csudh.edu
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Would you like to convert to Celcius or Fahrenheit [C/F]?: ");
		String n = input.nextLine();
		
		System.out.println("Please enter temperature value: ");
		double temp = input.nextDouble();
		
		double celcius = ((temp - 32) * (5/9));
		double fahrenheit = (temp * (9/5) * 32);
		
		if (n.equals("C")) {
			System.out.printf("The value in Fahrenheit is %.2f",  fahrenheit,"F");
		}
		else if(n.equals("F")) {
			System.out.printf("The value in Celcius is %.2f",  celcius,"C");
		}
		input.close();
	}

}
