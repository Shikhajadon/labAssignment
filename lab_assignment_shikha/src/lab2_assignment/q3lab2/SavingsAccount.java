package q3lab2;

public class SavingsAccount extends Account {

	private final int rate = 5;
	private double maxWithdrawAmountLimit;
	private final double minimumBalance = 500;

	public SavingsAccount(String memberName, double accountBalance, double maxWithdrawAmountlimit) {
		super(memberName, accountBalance);
		this.maxWithdrawAmountLimit = maxWithdrawAmountlimit;

	}
    @Override
	public double getBalance() {
		double interest = (getAccountBalance() * rate * 1) / 100;
		return interest + getAccountBalance();
	}
    @Override
	public double withdraw(double amount) {
		
		if(amount<= maxWithdrawAmountLimit && getAccountBalance()-amount>=minimumBalance) {
			setAccountBalance(getAccountBalance()-amount);
			return amount;
		}
		else
		{
			System.out.println("please enter valid amount to withdraw");
			return -1;
		}
	}
}
