package assignment_2;

import java.util.ArrayList;
import java.util.Scanner;

public class UserManager {
	
	private String firstName;
	private String lastName;
	private String email;
	
	public UserManager(String firstName, String lastName, String email) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	}
	
	public String getfirstName() {
		return firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		return lastName + ", " + firstName + " (" + email + ")";
	}

	public static void main(String[] args) {
		ArrayList<UserManager> users=new ArrayList<>();
		Scanner input= new Scanner(System.in);
		
		while(true) { 
			System.out.println("1 - Register User");
			System.out.println("2 - List User");
			System.out.println("3 - Exit");
			System.out.println("Please enter your choice: ");
			
			int choice = input.nextInt();
			input.nextLine();
			
			switch (choice) {
			case 1:
				System.out.println("Enter your first name: ");
				String firstName = input.nextLine();
				System.out.println("Enter your last name: ");
				String lastName = input.nextLine();
				System.out.println("Enter your email: ");
				String email = input.nextLine();
				
				UserManager newUser=new UserManager(firstName, lastName, email);
				users.add(newUser);
				
				System.out.println("Thank you, user" + newUser.getfirstName() + " " + newUser.getlastName() + " (" + newUser.getEmail() + ") has been registered" );
				
				break;
			case 2:
				System.out.println("List of Users:");
				int userCount = 0;
				for (UserManager usermanager: users) {
					System.out.println((userCount++) + " - " + usermanager);
				}
				System.out.println("Total users: " + userCount);
				break;
			case 3:
				System.out.println("Thank you for using User Manager, Goodbye");
				input.close();
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice. Please enter a valid option (1-3).");
				

			}			
		}
	}
}