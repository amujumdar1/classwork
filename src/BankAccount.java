public class BankAccount {
	float balance;
	private int accountNumber;
	private int pin;
	
	public BankAccount(float balance, int accountNumber, int pin) {
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.pin = pin;
	}
	
	public void deposit (int amount) {
		if (amount < 1) return;
		balance += amount;
	}
	
	public void withdraw (int amount) {
		if (amount > balance) return;		
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