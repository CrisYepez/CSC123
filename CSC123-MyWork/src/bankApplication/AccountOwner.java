package bankApplication;

public class AccountOwner {
	
	private String name;
	private String dateOfBirth;
	private String socialSecurityNumber;
	private String address;
	
	public AccountOwner(String name, String dateOfBirth, String socialSecurityNumber, String address) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.socialSecurityNumber = socialSecurityNumber;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public String getAddress() {
		return address;
	}

	
	
	
	
	

}
