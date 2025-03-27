package week4;

class BankAccount {
	private String name;
	private long acc_no;
	private String type;
	private float bal;
	private static float rate = 5f;

	public BankAccount() {
		this.name = "Unknown";
		this.acc_no = 0;
		this.type = "Unknown";
		this.bal = 0f;
	}

	public BankAccount(String name, long acc_no, String type, float balance) {
		this.name = name;
		this.acc_no = acc_no;
		this.type = type;
		this.bal = balance;
	}

	public void deposit(float amt) {
		if (amt > 0 && bal - amt >= 500) {
			bal -= amt;
			System.out.println(amt + " withdrawn. New balance: " + bal);
		}
		else {
			System.out.println("Insufficient amount.");
		}
	}

	public void display_details() {
		System.out.println("Depositor Name: " + name);
		System.out.println("Account Number: " + acc_no);
		System.out.println("Account Type: " + type);
		System.out.println("Balance: " + bal);
		System.out.println();
	}

	public static void display_rate() {
		System.out.println("Rate of interest: " + rate);
	}
}

public class BankAccountDemo {
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount("abc", 123456789, "Savings", 10000f);
		BankAccount acc3 = new BankAccount("def", 987654321, "Current", 5000f);

		acc1.display_details();
		acc2.display_details();
		acc3.display_details();

		acc2.deposit(2000);
		acc3.deposit(3000);

		acc2.display_details();
		acc3.display_details();

		BankAccount.display_rate();
	}
}