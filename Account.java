package account;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private java.util.Date createdDate;

	public Account(int id, double balance, double annualInterestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		createdDate = new java.util.Date();
	}

	public Account() {
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public java.util.Date getDateCreated() {
		return createdDate;
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	public double getMonthlyInterest() {
		return balance * (annualInterestRate / 12);
	}

	public void withdraw(double amount) {
		if (balance < amount) {
			System.out.println("amount withdrawn exceeds the current balance!");
		} else {
			balance -= amount;
		}

	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public String toString() {
		return "Balance " + balance + " ,monthly interest "
				+ annualInterestRate / 12 + " ,Created Date " + createdDate;
	}

}
