public class BankAccount {
	float balance;
	private int accountNumber;
	private int pin;
	AccountHolder bank;
	
	public BankAccount(float balance, int accountNumber, int pin, AccountHolder bank) {
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.bank = bank;
	}
	
	public void deposit (int amount) {
		balance += amount;
	}
	
	public boolean withdraw (int amount) {
		if (amount > balance) return false;		
		balance -= amount; 
		return true;
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