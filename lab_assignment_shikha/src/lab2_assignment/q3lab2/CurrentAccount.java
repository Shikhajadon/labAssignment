package q3lab2;

public class CurrentAccount extends Account{
	private int tradeLicenseNumber;

	public CurrentAccount(String memberName, double accountBalance,int tradeLicenseNumber) {
		super(memberName, accountBalance);
		this.tradeLicenseNumber=tradeLicenseNumber;
	}
	
	public int getTradeLicenseNumber() {
		return tradeLicenseNumber;
	}
	@Override
	public double getBalance() {
		
		return getAccountBalance();
	}
	 @Override
	public double withdraw(double amount) {
		
		if(amount<=getAccountBalance()) {
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
