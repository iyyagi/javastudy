package myobj;

public class PhoneBookInfo {
	
	String group;
	String number;
	String name;
	
	public PhoneBookInfo(String group, String number, String name) {
		this.group = group;
		this.number = number;
		this.name = name;
		
	}
	
	@Override
	public String toString() {
		
		return String.format("%s/%s/%s", group, number, name);
	}
	
}
