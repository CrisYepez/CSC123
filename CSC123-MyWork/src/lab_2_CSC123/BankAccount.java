package lab_2_CSC123;
import java.util.ArrayList;
public class BankAccount {
	// fields
	private String name = "Default Name";
	private int accountNumber;
	private ArrayList <Double> transactions =new ArrayList<Double>();
	private boolean open=true;
	
	//constructor	
	public BankAccount(String accountName, int acNumber) {
	name=accountName;
	accountNumber = acNumber;
	}
	
	public void deposit(double amount) {		
		if (isOpen())
		transactions.add(amount);
	}
	
	
	public void withdraw(double amount) {
		if (balance() - amount >=0)
		transactions.add(amount*-1);
}
	public void printStatement() {
		for (double d: transactions) {
			System.out.println(d); 
		}
	}
 	public double balance() {
 		double startingBalance=0;
 		for(double t:transactions) {
 		startingBalance+=t;
 	}
		return startingBalance;
}
	public void close() {
		open=false;
}
	public boolean isOpen() {
	return open;
	}
	}
	
