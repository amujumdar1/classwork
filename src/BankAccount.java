public class BankAccount {
	double balance;
	private long accountNumber;
	private int pin;
	AccountHolder account;
	
	public BankAccount(double balance, long accountNumber, int pin, AccountHolder account) {
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
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public int getPin() {
		return pin;
	}
	
	public void setPin(int pin) {
		this.pin = pin;
	}
}