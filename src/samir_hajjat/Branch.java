package samir_hajjat;

public class Branch {

	public static void main(String[] args) {

		Bank user1 = new Bank(123456789,"Ahmed","222222");
		user1.setLastName("Lubani");
		System.out.println(user1.getName());
		System.out.println(user1.getAccountNumber());
		
		
		Bank user2 = new Bank();
		user2.setName("Jack");
		user2.setAccountNumber(112222);
		user2.setSsn("46826482");
		user2.setLastName("Jon");
		System.out.println(user2.getName());
		System.out.println(user2.getName());

		Bank user3 = new Bank();
		user3.setName("Atef");
		user3.setLastName("Boreeni");
		user3.setSsn("1342614e2566");
		user3.setAccountNumber(123456789);
		
		
		
		
		System.out.println(user3.toString());
	}

}
