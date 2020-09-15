package q3lab2;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {

		System.out.println("Welcome!! to PUNJAB NATIONAL BANK");
		System.out.println("Enter the account you want to open------->");
		System.out.println("Enter '1' for Savings account");
		System.out.println("Enter '2' for Current account");

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		String memberName;
		Account account = null;
		switch (choice) {
		case 1:
			System.out.println("You opt for savings account");
			System.out.println("Enter the member Name who want to open the account");
			sc.nextLine();
			memberName = sc.nextLine();

			System.out.println("Enter the initial deposit,it should bwe greater than 500");
			double accountBalance = sc.nextDouble();

			System.out.println("Enter your max withdraw limit");
			double maxWithdrawAmountlimit = sc.nextDouble();

			account = new SavingsAccount(memberName, accountBalance, maxWithdrawAmountlimit);

			System.out.println("Your Savings Account Created Successfully");
			break;

		case 2:
			System.out.println("You opt for Current account");
			System.out.println("Enter the member Name who want to open the account");
			sc.nextLine();
			memberName = sc.nextLine();

			System.out.println("Enter your tradeLicenceNumber");
			int tradeLicenseNumber = sc.nextInt();

			account = new CurrentAccount(memberName, 0, tradeLicenseNumber);
			System.out.println("Your Current Account Created Successfully");
			break;

		default:
			break;
		}

		System.out.println("Enter '1',to deposit money");
		System.out.println("Enter '2',to withdraw money");
		System.out.println("Enter '3',to display balance");

		int ch = sc.nextInt();
		double amount;
		if (ch == 1) {
			System.out.println("Do yo want to display the balance//Type 'y' for yes and 'n' for no");
			sc.nextLine();
			String s = sc.nextLine();
			if (s.equals("y")) {
				System.out.println(account.getAccountBalance());
			}
			while (true) {
				System.out.println("Enter amount to deposit");
				amount = sc.nextDouble();
				if (amount <= 0) {
					continue;
				} else {
					break;
				}
			}
			account.deposit(amount);
			System.out.println("Amount deposited successfully");
			System.out.println("Do yo want to display the balance//Type 'y' for yes and 'n' for no");
			sc.nextLine();

			String str = sc.nextLine();

			if (str.equals("y")) {
				System.out.println(account.getAccountBalance());
			}
		} else if (ch == 2) {
			System.out.println("Do yo want to display the balance//Type 'y' for yes and 'n' for no");
			sc.nextLine();
			String s = sc.nextLine();
			if (s.equals("y")) {
				System.out.println(account.getAccountBalance());
			}
			while (true) {
				System.out.println("Enter amount to withdraw");
				amount = sc.nextDouble();
				double withdrawaAmt = account.withdraw(amount);

				if (withdrawaAmt >= 0) {
					System.out.println("Amount withdraw successfully");
					break;
				} else {
					continue;
				}
			}

			System.out.println("Do yo want to display the balance//Type 'y' for yes and 'n' for no");
			sc.nextLine();

			String str = sc.nextLine();
			if (str.equals("y")) {
				System.out.println(account.getAccountBalance());
			}
		} else if (ch == 3) {
			account.displayAccountdetails();
		} else {
			System.out.println("Do Nothing");
		}
		System.out.println("THANKS FOR VISTING");
		
	}
}
