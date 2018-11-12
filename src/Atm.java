import java.util.Scanner;

public class Atm {
	private BankAccount account;
	
	static Scanner in = new Scanner(System.in);

	private AccountHolder bank;
	
	public Atm(BankAccount account) {
		this.account = account;
		/*this.bank = new AccountHolder(82347283, "Johnny Appleseed", "123-456-7890", 
				"1776 Raritan Road, Scotch Plains, NJ, 07076");*/
	}
	
	public static void main(String[] args) {
		Atm atm = new Atm(setCredentials());
		
		atm.showMenu();
		
	}
	
	public static BankAccount setCredentials(){
		System.out.println("Enter your SSN please.");
		return account;
	}
	
	public void showMenu(int amount) {
		// System.out.println("Welcome to the ATM.");
		System.out.println("Press 1 to deposit money.");
		System.out.println("Press 2 to withdraw money.");
		System.out.println("Press 3 to show your current balance");
		int input = in.nextInt();
		in.nextLine();
		
		switch(input) {
			case 1:
				this.withdraw(amount);
			case 2:
				account.deposit(amount);
			case 3:
				showBalance();
			default:
				System.out.println("You didn't enter a valid number!");
		}
		
	}
	
	public void deposit(int amount) {
		this.deposit(amount);
	}
	
	public void withdraw(int amount) {
		this.withdraw(amount);
	}
	
	public float showBalance() {
		return account.balance;
	}
	
	public void setAccount(BankAccount account) {
		this.account = account;
	}

}