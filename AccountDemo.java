package account;

public class AccountDemo {

	/**
	 * Albert
	 */
	public static void main(String[] args) {

		Account object= new Account(1234, 30000, 5/100);
		object.withdraw(2500);
		object.deposit(3000);

		System.out.println(object);

	}

}
