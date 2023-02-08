package quiz;

import myobj.PhoneBook;
import myobj.PhoneBookInfo;

public class D08_PhoneBook {

	/*
	 	# HashMap을 이용해 전화번호부를 구현해보세요.

		1. [그룹명/전화번호/개인정보]를 저장해야 한다.
		2. 전화번호부 해쉬맵에 그룹명을 키값으로 넣으면 해당 그룹의 해쉬맵을 꺼낼 수 있다.
		3. 꺼낸 그룹맵에 전화번호를 키값으로 넣으면 그 사람의 개인정보 DTO를 꺼낼 수 있다.

		# 구현해야 할 메서드
		1. 새로운 그룹을 추가시키는 메서드
		2. 그룹에 전화번호 및 개인정보를 추가하는 메서드
		3. 이름의 일부를 입력하면 일치하는 모든 사람의 목록을 보여주는 메서드
		4. 전화번호의 일부를 입력하면 일치하는 모든 사람의 목록을 보여주는 메서드
		5. 등록된 모든 정보를 그룹명 순으로 출력, 같은 그룹 내에서는 이름 기준 오름차순으로 출력하는 메서드

		// HashMap<String, HashMap<String, Info> phonebook;

		// 일단 그룹명/전화번호/개인정보 나오게끔 출력
	 */


	public static void main(String[] args) {
		PhoneBook pb = new PhoneBook();
		
		pb.addGroup("가족");
		pb.addPerson(new PhoneBookInfo("학원", "010-1234-1234", "김민수"));
		pb.printAll();
		System.out.println(pb);
		
	}
}
