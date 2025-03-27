package midsem;

import java.util.Scanner;

class BankAccount {
	private static int accountNumber;
	private static double balance;
	private static int transactionCount;
	private final static double MINIMUM_BALANCE;
	private final static int MAX_TRANSACTIONS;

	static {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Account number: ");
		accountNumber = sc.nextInt();
		
		System.out.print("Enter initial balance: ");
		balance = sc.nextDouble();

		System.out.print("Enter minimum balance: ");
		MINIMUM_BALANCE = sc.nextDouble();
		
		System.out.print("Enter maximum transactions: ");
		MAX_TRANSACTIONS = sc.nextInt();
	}

	class Transaction {
		private char type;
		private double amount;

		public Transaction(char type, double amount) {
			this.type = type;
			this.amount = amount;
		}

		public void displayTransaction(char type, double amount) {
			if (type == 'w') {
				System.out.println("Transaction: Withdraw | Amount: " + amount);
			}
			else {
				System.out.println("Transaction: Deposit | Amount: " + amount);
			}
		}
	}

	Transaction[] transactions = new Transaction[MAX_TRANSACTIONS];

	public void deposit(double amount) {
		if (transactionCount < MAX_TRANSACTIONS) {
			if (amount > 0) {
				balance += amount;
				Transaction t = new Transaction('d', amount);
				for (int i = 0; i < MAX_TRANSACTIONS; i++) {
					if (transactions[i] == null) {
						transactions[i] = t;
						break;
					}
				}
				System.out.println(amount + " deposited. Current balance: " + balance);
				transactionCount++;
			}
		}
		else {
			System.out.println("Transaction limit reached");
		}
	}

	public void withdraw(double amount) {
		if (transactionCount < MAX_TRANSACTIONS) {
			if (amount > 0 && balance - amount >= MINIMUM_BALANCE) {
				balance -= amount;
				Transaction t = new Transaction('w', amount);
				for (int i = 0; i < MAX_TRANSACTIONS; i++) {
					if (transactions[i] == null) {
						transactions[i] = t;
						break;
					}
				}
				System.out.println(amount + " withdrawn. Current balance: " + balance);
				transactionCount++;
			}
			else {
				System.out.println("Insufficient balance");
			}
			
		}
		else {
			System.out.println("Transaction limit reached");
		}
	}

	public void display() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balance);
		System.out.println("Transactions:");
		for (int i = 0; i < transactionCount; i++) {
			if (transactions[i] != null) {
				transactions[i].displayTransaction(transactions[i].type, transactions[i].amount);
			}
		}
	}
}

public class BankSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount bankAccount = new BankAccount();

		while (true) {
			System.out.println("Choose operation:");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. View transactions");
			System.out.println("4. Exit");

			System.out.print("Enter choice: ");
			int c = sc.nextInt();

			switch (c) {
				case 1:
					System.out.println("Enter amount to deposit: ");
					bankAccount.deposit(sc.nextDouble());
					break;
				case 2:
					System.out.println("Enter amount to withdraw: ");
					bankAccount.withdraw(sc.nextDouble());
					break;
				case 3:
					bankAccount.display();
					break;
				case 4:
					System.out.println("Thank you for banking with us!");
					System.exit(0);
				default:
					System.out.println("Invalid choice");
			}
		}
	}
}