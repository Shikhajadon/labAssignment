package q3lab2;

// apply exceptional handling*
import java.util.Random;

public abstract class Account {
	private String memberName;
	private String accountNumber;
	private double accountBalance;

	public Account(String memberName, double accountBalance) {
		super();
		this.memberName = memberName;
		this.accountBalance = accountBalance;
		Random rand = new Random();
		this.accountNumber = "" + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10)
				+ rand.nextInt(10);
	}

	abstract public double withdraw(double amount);

	abstract public double getBalance();

	public String getMemberName() {
		return memberName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	protected void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void deposit(double amount) {
			accountBalance += amount;
		
	}

	public void displayAccountdetails() {
		System.out.println("Account Holder name: " + memberName + " Account Number: " + accountNumber);
		System.out.println("Account Balance: " + accountBalance);
	}

}
