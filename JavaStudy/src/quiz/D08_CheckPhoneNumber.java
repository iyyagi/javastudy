package quiz;

import java.util.Scanner;

import myobj.Check;

public class D08_CheckPhoneNumber {
	/*
	 
	 	사용자로부터 입력받은 문자열이 유효한 핸드폰 번호인지 검사하는 메서드를 만들어보세요.
	 
	 */
	public static boolean check(String phoneNumber) {
		
		// 0. 바깥쪽의 공백을 제거
		phoneNumber = phoneNumber.trim();
		
		// 1. 010으로 시작하는 문자열인지 체크
		if (!phoneNumber.startsWith("010")) { // 010으로 시작하지 않으면 false;
			return false;
		} 
		
		// 2. 길이가 11(-가 포함되지 않은 값) 또는 13(-가 포함된 값) 인지?
		int len = phoneNumber.length();
		if (len != 11 && len !=13) {
			return false;
		}
		
		// 3. 길이가 13이면 "-"을 공백으로 바꿔준다.
		if (len == 13) {
			// 3번째 8번째 자리에 -가 없으면 false;
			if (phoneNumber.charAt(3) != '-' || phoneNumber.charAt(8) != '-' ){
				return false;
			}
			// -가 있으면 -를 제거
			phoneNumber = phoneNumber.replace("-", "");
		}
		
		// 남은 문자열이 모두 숫자인지 확인한다.
		for (int i = 0; i < phoneNumber.length(); ++i) {
			if (!Character.isDigit(phoneNumber.charAt(i))) { // 숫자가 아니면 false;
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(check("010-3234-1234"));
		System.out.println(check("011-1234-123"));
		System.out.println(check("01012345678"));
		System.out.println(check("010-5634-5678"));
		System.out.println(check("010-qwer-5678"));
		System.out.println(check("010-3234-1234"));
	}
}
