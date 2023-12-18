package bankApplication;

public class Transaction {
	
	private String type;
	private double amount;
	
	public Transaction(String type, double amount) {
		super();
		this.type = type;
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public double getAmount() {
		return amount;
	}

}
