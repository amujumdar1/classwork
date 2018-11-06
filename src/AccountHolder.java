public class AccountHolder{
	private int SSN;
	private String Name;
	private String Phone;
	private String Address;
	
	public AccountHolder (int SSN, String Name, String Phone, String Address) {
		this.SSN = SSN;
		this.Name = Name;
		this.Phone = Phone;
		this.Address = Address;
	}
	
	public int getSSN() {
		return SSN;
	}
	
	public void setSSN(int SSN) {
		this.SSN = SSN; 
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public String getPhone() {
		return Phone;
	}
	
	public void setPhone(String Phone) {
		this.Phone = Phone;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public void setAddress(String Address) {
		this.Address = Address;
	}
}