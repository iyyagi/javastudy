package myobj;

import java.util.HashMap;

public class PhoneBook {
	       //String      Integer
	HashMap<String, HashMap<String, PhoneBookInfo>> phonebook;
	
	public PhoneBook() {
		
	}
	
	public boolean addGroup (String groupName) {
		
		return true;
		
	}
	
	public boolean addPerson (PhoneBookInfo info) {
		return true;
	}
	
	// 그룹, 번호, 사람이 출력된다.
	public void printAll() {
		
		
	}

	
}
