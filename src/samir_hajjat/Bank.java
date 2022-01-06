package samir_hajjat;

public class Bank {
	private static int costumerCount;
	private  long accountNumber;
	private  String name ;
	private  String ssn;
	private  String lastName;
	
	public Bank(long accountNumber , String name , String ssn,String lastName) {
		this(accountNumber,name,ssn);
		this.lastName = lastName;
		
		
	}
	
	public Bank(long accountNumber , String name , String ssn) {
		this(accountNumber,ssn);
		this.name = name;
		
		
	}
	
	public Bank (long accountNumber , String ssn) {
		this(accountNumber);
		this.ssn =ssn;
	}
	public Bank(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public Bank () {costumerCount++;}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	 String getName() {
		return name;
	}
	
	public String getSsn() {
		
		return ssn;
	}
	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void setName(String name) {
		if(name == null) {
			System.out.println("name can not be null");
		}else {
		this.name = name;
		}
		
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public  String toString() {
		return costumerCount+" customer full name : "+name+" "+lastName+" AccountNumber: "+accountNumber;
	
	}

}
