package quiz;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import blackjack.Card;

public class D09_CaesarCipher {
	/*
	  # 시저 암호
	  - 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 암호화하는 방식
	  - 키 값만큼 평문의 모든 알파벳을 오른쪽으로 밀어주면 암호화가 되고
	    암호문을 다시 왼쪽으로 키 값만큼 밀어주면 복호화가 된다.

	  ABCDEFGHIJKLMNOPQRSTU

	  		Key가 5일때
	  HELLO -----> MJQQT

	 */

	int key;
	private final static String UPPER_CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private final static String LOWER_CHARSET = "abcdefghijklmnopqrstuvwxyz";
	private final static String KOR_CHARSET = getKorSet();
	public D09_CaesarCipher(int key) {
		this.key = key;
	}
	
	public static String getKorSet() {
		StringBuilder sb = new StringBuilder();
		
		for (char i = '가'; i < '힣'; ++i) {
			sb.append(i);
		}
		return sb.toString();
	}
	
	public String encrypt(String plain) {
		
		StringBuilder sb = new StringBuilder(plain);
		//sb.append(plain); 바로 전달 가능
		int len = sb.length();
		for (int i = 0; i < len; ++i) {
			char ch = sb.charAt(i);
			int index, len2;
			if (Character.isUpperCase(ch)) {
				len2 = UPPER_CHARSET.length();
				index = ch - 'A' + key % len2;
				index = index >= len2 ? index - len2 : index;
				ch = UPPER_CHARSET.charAt(index);
//				ch += key;
//				ch = (char)(ch > 'Z'? ch - 26 : ch);
			} else if (Character.isLowerCase(ch)) {
				len2 = LOWER_CHARSET.length();
				index = ch - 'a' + key % len2;
				index = index >= len2 ? index - len2 : index;
				ch = LOWER_CHARSET.charAt(index);
				// 44032 ~ 55203
			} else if (ch >= '가' && ch <= '힣') {
				len2 = KOR_CHARSET.length();
				index = ch -'가' + key % len2;
				index = index >= len2? index -len2 : index;
				ch = KOR_CHARSET.charAt(index);
			}
			sb.setCharAt(i, ch);
		}
		return sb.toString();	
	}
	public String decrypt (String crypto) {
		StringBuilder sb = new StringBuilder(crypto);
		int len = sb.length();
		int index, len2;
		for (int i = 0; i < len; ++i) {
			char ch = sb.charAt(i);
			if (Character.isUpperCase(ch)) {
				len2 = UPPER_CHARSET.length();
				index = ch - 'A' - key % len2;
				index = index < 0 ? index + len2 : index;
				ch = UPPER_CHARSET.charAt(index);
			} else if (Character.isLowerCase(ch)) {
				len2 = LOWER_CHARSET.length();
				index = ch - 'a' - key % len2;
				index = index < 0 ? index + len2 : index;
				ch = LOWER_CHARSET.charAt(index);
			} else if (ch >= '가' && ch <= '힣') {
				ch = (char)(ch > '힣'? ch - KOR_CHARSET.length() : ch);
//				ch = (char)(ch < '가'? ch + KOR_CHARSET.length() : ch);
			}
			sb.setCharAt(i, ch);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String plainText = "Hello, world!!";
		String text = "히브리어";
		
		D09_CaesarCipher cipher1 = new D09_CaesarCipher(10);
		D09_CaesarCipher cipher2 = new D09_CaesarCipher(13);
		System.out.println("key : 10 " + cipher1.encrypt(plainText));
		System.out.println("key : 13 " + cipher2.encrypt(plainText));
		String crypto1 = "Rovvy, gybvn!!";
		String crypto2 = "Uryyb, jbeyq!!";
		System.out.println(cipher1.decrypt(crypto1));
		System.out.println(cipher2.decrypt(crypto2));		
		D09_CaesarCipher cipher3 = new D09_CaesarCipher(3);
		System.out.println("한글 암호화 : " + cipher3.encrypt(text));
		System.out.println("한글 복호화 : " + cipher3.decrypt(text));
		
//		System.out.println("암호를 입력해 주세요");
//		String key = sc.next();
//		System.out.println("몇번 움직일까요?");
//		int keyword = sc.nextInt();
//		char encryption = 0;
//		char decryption = 0;
//		StringBuilder encry = new StringBuilder();
//		StringBuilder decry = new StringBuilder();
//		StringBuilder encry2 = new StringBuilder();
//		StringBuilder decry2 = new StringBuilder();
//		// 알파벳은 A ~ Z 또는 대문자 A ~ Z까지 있다.
//		// 입력한 값을 세고 key가 5면 5칸씩 뒤로 밀어버린다.
//		// ABCDEFGHIJKLMNOPQRSTUVWXYZ
//		for (int i = 0; i < key.length(); ++i) {
//			if (key.charAt(i) >= 'a' && key.charAt(i) <= 'z') {
//				if (key.charAt(i) > 'z') {
//					encryption = (char)(key.charAt(i)-26 + keyword );
//					decryption = (char)(encryption - keyword +26);
//				} else {
//					encryption = (char)(key.charAt(i) + keyword); 
//					decryption = (char)(encryption - keyword);
//				}
//			}
//			if (key.charAt(i) >= 'A' && key.charAt(i) <= 'Z') {
//				if (key.charAt(i) >= 'Z') {
//					encryption = (char)(key.charAt(i) -26 + keyword);
//					decryption = (char)(encryption - keyword +26);
//				} else {
//					encryption = (char)(key.charAt(i) + keyword); 
//					decryption = (char)(encryption - keyword);
//				}
//			}
//
//			encry.append(encryption);
//			decry.append(decryption);
//		}
//		System.out.println("암호화 : " + encry);
//		System.out.println("복호화 : " + decry);
//
//
//		char encryption2 = 0;
//		char decryption2 = 0;
//		for (int i = 0; i < key.length(); ++i) {
//			if (key.charAt(i) >= '가' && key.charAt(i) <= '힣') {
//				if (key.charAt(i) >= '힣') {
//					encryption2 = (char)(key.charAt(i) -11171 + keyword);
//					decryption2 = (char)(encryption2 - keyword +11171);
//				} else {
//					encryption2 = (char)(key.charAt(i) + keyword);
//					decryption2 = (char)(encryption2 - keyword);
//				}
//			}
//			encry2.append(encryption2);
//			decry2.append(decryption2);
//		}
//		System.out.println("암호화 : " + encry2);
//		System.out.println("복호화 : " + decry2);
		
	}

	public void setKey(int key) {
		this.key = key;
		
	}
}
