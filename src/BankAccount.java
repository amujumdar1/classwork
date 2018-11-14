public class BankAccount {
	double balance;
	private int accountNumber;
	private int pin;
	AccountHolder account;
	
	public BankAccount(double balance, int accountNumber, int pin, AccountHolder account) {
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.account = account;
	}
	
	public void deposit (double amount) {
		if (amount < 1) {
			System.out.println("Invalid amount!");
			return;
		}
		balance += amount;
	}
	
	public void withdraw (double amount) {
		if (amount > balance) {
			System.out.println("Invalid amount!");
			return;		
		}
		balance -= amount;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public int getPin() {
		return pin;
	}
	
	public void setPin(int pin) {
		this.pin = pin;
	}
}