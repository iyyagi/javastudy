package quiz;

import java.util.Random;

public class B12_TempPassword2 {
	/*
	  대문자, 소문자, 특수문자, 숫자로 구성된 랜덤 비밀번호 6자리를 생성하여 출력해주세요.
	  
	  ※ 사용 가능한 특수문자
	  ! @ # $ % ^ & * - _ + = | : ; < > @ [ ] ^ ~ \

	*/
	public static void main(String[] args) {
		Random ran = new Random();
		String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
		"abcdefghijklmnopqrstuvwxyz" + "!@#$%^&*()~";
		for (int i = 0; i < 6; ++i) {
			System.out.print(charset.charAt(ran.nextInt(charset.length())));
			
			
		}
		
//		for (int i = 0; i < 6; ++i) {
//			char ch = (char)(ran.nextInt(93)+33);
//			if (!(ch == 33 || ch ==34 || ch == 36 || ch ==40 || ch == 41 || ch ==45 || ch == 95 ||
//			    ch == 123 || ch == 125)) {
//				System.out.print(ch);	
//				continue;
//			} 
//		}
		// 강사님 풀이
//		for (int i = 0; i < 6; ++i) {
//			switch (ran.nextInt(4)) {
//			case 0:
//				// 숫자
//				System.out.print((char)(ran.nextInt(10) + '0'));
//				break;
//			case 1:
//				// 소문자
//				System.out.print((char)(ran.nextInt(26) + 'a'));
//				break;
//			case 2:
//				// 대문자
//				System.out.print((char)(ran.nextInt(26) + 'A'));
//				break;
//			case 3:
//				//특수문자
//				String charset ="!@#$%^&*-_+=|:;<>@[]^~\\";
//				// int random_index = ran.nextInt(charset.length());
//				System.out.print(charset.charAt(ran.nextInt(charset.length())));
//				// System.out.print(charset.charAt(random_index));
//				break;
//			}
//		}
	}
}
