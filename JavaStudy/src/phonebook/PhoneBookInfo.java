package phonebook;

public class PhoneBookInfo  {
	String group;
	String name;
	String phoneNumber;
	
	
	public PhoneBookInfo() {
		
	}
	
	public PhoneBookInfo(String group, String name, String phoneNumber) {
		this.group = group;
		this.name = name;
		this.phoneNumber = phoneNumber;
		
	}
	

	@Override
	public String toString() {
		
		return String.format("[%s, %s, %s]", group, name, phoneNumber);
	}
}
