package phonebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class PhoneBook {

	HashMap<String, HashMap<String, PhoneBookInfo>> phonebook = new HashMap<>();
	
	public PhoneBook() {

	}
	// 1. 그룹을 추가하는 메서드
	public boolean addGroup(String groupName) {
		if (!phonebook.containsKey(groupName)) { // groupName이 없다면
			phonebook.put(groupName, new HashMap<>()); // 새로운 그룹key를 hashmap에 저장
			System.out.printf("그룹 [%s]을(를) 성공적으로 추가했습니다.\n", groupName); // 그룹추가 시 나타나는 문구
			return true;
		} else {
			//			phonebook.put(groupName, new HashMap<>()); // 그룹에 대한 해쉬맵 생성
			//			System.out.printf("새그룹 %s(이)가 추가되었습니다.\n", groupName);
			//			return true;
			System.out.println("이미 존재하는 그룹입니다.");
			return false;
		}
	}

	public boolean personAlreadyExistOtherGroup(PhoneBookInfo info) {
		boolean exist = false;
		for (String groupName : phonebook.keySet()) {
			if (groupName.equals(info.group)) {
				continue;
			}
			HashMap<String, PhoneBookInfo> groupMap = phonebook.get(groupName);
			exist = exist || groupMap.containsKey(info.phoneNumber); // containsKey가 true면 or exist false기 때문에 true 
		}
		return exist;
	}
	
	// 2. 그룹이 존재한다면 정보를 추가하는 메서드
	public boolean addPerson(PhoneBookInfo info) {
		if (personAlreadyExistOtherGroup(info)) {
			System.out.println("다른 그룹에 이미 등록된 전화번호 입니다.");
			return false;
		}
		if (phonebook.containsKey(info.group)) {
			HashMap<String, PhoneBookInfo> groupMap = phonebook.get(info.group);

			if (groupMap.containsKey(info.phoneNumber)) {
				System.out.printf("'%s' 님의 정보를 수정했습니다.\n", info.name);
			} else {
				System.out.println("새로운 정보를 등록했습니다.");
			}
			groupMap.put(info.phoneNumber, info);
			return true;
		} else {
			System.out.println("해당 그룹이 존재하지 않습니다. 추가실패");
			return false;
		}
		//		HashMap<String, PhoneBookInfo> group = phonebook.putIfAbsent(groupName, new HashMap<>());
		//		if (group == null) {
		//			group = phonebook.get(groupName);
		//			System.out.println("이미 존재하는 그룹이라 추가할 수 없습니다.");
		//		}
		//		group.put(info.phoneNumber, info);
	}
	
	// 3. 이름을 검색해서 꺼내는 메서드
	public void searchByName(String nameFrag) {
		for (HashMap<String, PhoneBookInfo> group : phonebook.values()) {
		
			for (PhoneBookInfo info : group.values()) {
				if (info.name.contains(nameFrag)) {
					System.out.println(info);					
				}
			}
		}
	}
	
	// 4. 번호를 꺼내는 메서드
	public void searchByPhoneNumber(String numberFrag) {
		for (HashMap<String, PhoneBookInfo> group : phonebook.values()) {
			for (PhoneBookInfo info : group.values()) {
				if (info.phoneNumber.contains(numberFrag)) {
					System.out.println(info);
				}
			}
		}
	}

	public void prinrAll() {
		List<PhoneBookInfo> allInfo = new ArrayList<>();
		for (HashMap<String, PhoneBookInfo> group : phonebook.values()) {
			for (PhoneBookInfo info : group.values()) {
				allInfo.add(info);
			}
		}
		Collections.sort(allInfo, new Comparator<PhoneBookInfo>() {

			@Override
			public int compare(PhoneBookInfo i1, PhoneBookInfo i2) {
				int r1 = i1.group.compareTo(i2.group);
				if (r1 == 0) {
					return i1.name.compareTo(i2.name);
				} else {
					return r1;
				}
			}
		});
		
		System.out.println("### Print All Info ###");
		for (PhoneBookInfo info : allInfo) {
			System.out.println(info);
		}
	}
}
