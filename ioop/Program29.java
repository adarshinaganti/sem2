// Account class

class Account {
	private String customerName;
	private String accountNumber;
	private String accountType;
	protected double balance;
	
	public Account() {
		this.customerName = "";
		this.accountNumber = "";
		this.accountType = "";
		this.balance = 0;
	}
	
	public Account(String customerName, String accountNumber, String accountType, double initialBalance) {
		this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = initialBalance;
	}
	
	public String get_customerName() {
        return customerName;
    }

    public String get_accountNumber() {
        return accountNumber;
    }

    public String get_accountType() {
        return accountType;
    }

    public double get_balance() {
        return balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit of " + amount + " successful.");
        }
        else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: $" + balance);
    }
    
    public void computeAndDepositInterest() {
        System.out.println("Interest computation not applicable for this account type.");
    }

    public void withdraw(double amount) {
        System.out.println("Withdrawal not directly permitted for this account type. Please use subclass methods.");
    }

    public void checkMinimumBalanceAndImposePenalty() {
        System.out.println("Minimum balance check not applicable for this account type.");
    }
}

class CurrentAccount extends Account {
	private static final double MINIMUM_BALANCE = 1000;
    private static final double PENALTY = 50;
    
    public CurrentAccount() {
    	super();
    }

    public CurrentAccount(String customerName, String accountNumber, double initialBalance) {
        super(customerName, accountNumber, "Current", initialBalance);
    }
    
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful.");
            checkMinimumBalanceAndImposePenalty();
        }
        else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        }
        else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
    
    @Override
    public void checkMinimumBalanceAndImposePenalty() {
        if (balance < MINIMUM_BALANCE) {
            balance -= PENALTY;
            System.out.println("Balance is below minimum level. Penalty of " + PENALTY + " imposed.");
        }
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount() {
        super();
        this.interestRate = 0;
    }

    public SavingsAccount(String customerName, String accountNumber, double initialBalance, double interestRate) {
        super(customerName, accountNumber, "Savings", initialBalance);
        this.interestRate = interestRate;
    }

    public double get_interestRate() {
        return interestRate;
    }

    public void set_interestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void computeAndDepositInterest() {
        double interest = balance * (interestRate / 100);
        deposit(interest);
        System.out.println("Interest of " + interest + " deposited.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful.");
        }
        else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        }
        else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}

public class Program29 {
    public static void main(String[] args) {
        CurrentAccount currentAccount = new CurrentAccount("abc", "123456789", 2000);
        System.out.println("Current Account:");
        currentAccount.displayBalance();
        currentAccount.deposit(500);
        currentAccount.displayBalance();
        currentAccount.withdraw(1200);
        currentAccount.displayBalance();
        currentAccount.withdraw(500);
        currentAccount.displayBalance();

        SavingsAccount savingsAccount = new SavingsAccount("def", "987654321", 3000, 5);
        System.out.println("\nSavings Account:");
        savingsAccount.displayBalance();
        savingsAccount.deposit(1000);
        savingsAccount.displayBalance();
        savingsAccount.computeAndDepositInterest();
        savingsAccount.displayBalance();
        savingsAccount.withdraw(2000);
        savingsAccount.displayBalance();
    }
}