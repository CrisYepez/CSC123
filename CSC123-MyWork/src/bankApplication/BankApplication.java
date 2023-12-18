package bankApplication;

import bankApplication.Account.AccountType;

public class BankApplication {

	public static void main(String[] args) {
		AccountOwner accountOwner = new AccountOwner("Cristobal Yepez", "11/03/2001", "000-00-0000", "000 W 1st, Los Angeles, CA" );
		Account savingsAccount =  Account.openAccount(accountOwner,AccountType.SAVINGS, 0);
		Account checkingAccount = Account.openAccount(accountOwner,AccountType.CHECKING, 100);
	
		savingsAccount.deposit(1000);
		savingsAccount.withdraw(500);
		savingsAccount.withdraw(499);
		savingsAccount.printStatement();
		
		checkingAccount.deposit(500);
		checkingAccount.withdraw(100);
		checkingAccount.deposit(500);
		checkingAccount.printStatement();
	}

}
