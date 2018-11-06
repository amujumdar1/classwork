public class Atm {
	BankAccount atm; 
	
	public void deposit(int amount) {
		atm.deposit(amount);
	}
	
	public boolean withdraw(int amount) {
		return atm.withdraw(amount);
	}
	
	public float showBalance(float balance) {
		return atm.balance;
	}

}