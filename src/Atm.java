import java.util.Scanner;

public class Atm {
	private BankAccount bank;
	
	static Scanner in = new Scanner(System.in);
	
	public Atm(BankAccount bank) {
		this.bank = bank;
		/*this.bank = new AccountHolder(82347283, "Johnny Appleseed", "123-456-7890", 
				"1776 Raritan Road, Scotch Plains, NJ, 07076");*/
	}
	
	public static void main(String[] args) {
		Atm atm = new Atm(setCredentials());
		
		atm.showMenu(400);
		
	}
	
	public static BankAccount setCredentials(){
		AccountHolder account = new AccountHolder(34723283,
				"Johnny Appleseed", "345-765-4967", "1776 Raritan Road");
		
		return new BankAccount(0, 7, 2428);
		/*int SSN; String Name, Phone, Address;
		System.out.println("Please enter your account information.");
		
		System.out.print("Name: ");
		Name = in.nextLine();
		
		System.out.print("SSN: ");
		SSN = in.nextInt();
		
		in.nextLine();
		
		System.out.print("Phone: ");
		Phone = in.nextLine();
		
		System.out.print("Address: ");
		Address = in.nextLine();
		
		AccountHolder account = new AccountHolder(SSN, Name, Phone, Address);*/
		
		
	}
	
	private void showMenu() {
		// System.out.println("Welcome to the ATM.");
		System.out.println("Press 1 to withdraw money.");
		System.out.println("Press 2 to deposit money.");
		System.out.println("Press 3 to show your current balance");
		int input = in.nextInt();
		in.nextLine();
		
		switch(input) {
			case 1:
				System.out.println("How much do you want to withdraw?");
				System.out.print("Amount: ");
				this.withdraw(in.nextFloat());
				in.nextLine();
				break;
			case 2:
				System.out.println("How much do you want to deposit?");
				System.out.print("Amount: ");
				this.deposit(in.nextFloat());
				in.nextLine();
				break;
			case 3:
				System.out.println("Your balance is " + showBalance() + ".");
				break;
			default:
				System.out.println("You didn't enter a valid number!");
		}
		System.out.println("Do you want to do anything else? (Y/N)");
		char decision = in.next().toUpperCase().charAt(0);
		
		switch(decision) {
			case 'Y':
				showMenu();
			default:
				return;
		}
	}
	
	public void deposit(float amount) {
		this.deposit(amount);
	}
	
	public void withdraw(float amount) {
		this.withdraw(amount);
	}
	
	public float showBalance() {
		return bank.balance;
	}
	
	public void setAccount(BankAccount account) {
		this.bank = account;
	}

}