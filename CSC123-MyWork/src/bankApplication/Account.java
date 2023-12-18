package bankApplication;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Account {
	
private AccountOwner accountOwner;
private double balance;
private double overdraftLimit;
private List<Transaction> transactions;

public Account(AccountOwner accountOwner, double balance, double overdraftLimit, List<Transaction> transactions) {
	super();
	this.accountOwner = accountOwner;
	this.balance = 0;
	this.overdraftLimit = overdraftLimit;
	this.transactions = new ArrayList<>();
}

public void deposit(double amount) {
	balance += amount;
	transactions.add(new Transaction("Deposit", amount));
}

public void withdraw(double amount) {
	if (balance - amount >= -overdraftLimit) {
		balance -= amount;
		transactions.add(new Transaction("Withdraw", amount));
	} 
	else {
		System.out.println("Insufficient Funds");
		}
	}

public static Account openAccount(AccountOwner accountOwner, AccountType accountType, double overdraftLimit) {
int minSavingsAge = 5;
int minCheckingAge= 16;
int minOverdraftAge = 18;

int accountOwnerAge = calculateAge(accountOwner.getDateOfBirth());

if (accountType == AccountType.SAVINGS && accountOwnerAge >= minSavingsAge) {
	return new Account(accountOwner, 0, overdraftLimit, null);
}
else if (accountType == AccountType.CHECKING && accountOwnerAge >=minCheckingAge) {
	return new Account(accountOwner, 0, overdraftLimit, null);
}
else if (accountType == AccountType.CREDIT && accountOwnerAge >= minOverdraftAge) {
	return new Account(accountOwner,0, overdraftLimit, null);
} 
else {
	System.out.println("Account owner does not meet age requirement to use account type");
	return null;
	}
}

private static int calculateAge(String dateOfBirth) {
	DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MM/dd/yyyy");
	LocalDate birthDate=LocalDate.parse(dateOfBirth, formatter);
	LocalDate currentDate = LocalDate.now();
	
	Period ageInYears = Period.between(birthDate, currentDate);
	return ageInYears.getYears();
}

public boolean isOwnerEligibleForAccount(int minAge) {
	int birthYear = Integer.parseInt(accountOwner.getDateOfBirth());
	int currentYear = Calendar.getInstance().get(Calendar.YEAR);
	int age = currentYear - birthYear;
	
	return age >= minAge;
	}

public void closeAccount() {
	if (balance > 0) {
		System.out.println("Cannot close account. Withdraw remaining balance");
	}
	else if (balance < 0) {
		System.out.println("Pay overdraft fees, Account will close when balance is 0");
	}
	else {
		System.out.println("Account closed successfully.");
	}
}

public void printStatement() {
	System.out.println("Account Statement for : " + accountOwner.getName());
	System.out.println("Balance: $" + balance);
	System.out.println("Transactions: ");
	for (Transaction transaction : transactions) {
	System.out.println(transaction.getType() + ": $" + transaction.getAmount());
		}
	}

enum AccountType {
	SAVINGS,
	CHECKING,
	CREDIT
}
}
