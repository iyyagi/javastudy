package myobj;

public class Check {

	public Check() {

	}

	public boolean check(String phoneNumber) {
		if (phoneNumber.startsWith("010")) {
			return false;
		} 
		int len = phoneNumber.length();
		if (len != 11 && len !=13) {
			return false;
		}
		
		
		return true;
	}
	
	
//	public void checkPhoneNumber(String phoneNumber) {
//		if (phoneNumber.length() == 13) {
//			if (phoneNumber.startsWith("010")) {
//				if (phoneNumber.charAt(4) >= '0' && phoneNumber.charAt(4) <= '9' && phoneNumber.charAt(8) >= '0' &&
//						phoneNumber.charAt(8) <= '9') {
//					if (phoneNumber.substring(3, 4).equals("-") && phoneNumber.substring(8, 9).equals("-")) // 문자열 비교 equals {
//						System.out.println("조건에 만족합니다.");
//					} else {
//						System.err.println("조건에 만족하지 않습니다.");
//						return;
//					} 
//				} else {
//					System.out.println("숫자만 들어갈 수 있습니다.");
//				}
//			} else {
//				System.err.println("유효하지 않은 번호입니다.");
//			}
//		} else {
//			System.err.println("일치하지 않는 전화번호 입니다.");
//		}
//	}
}
