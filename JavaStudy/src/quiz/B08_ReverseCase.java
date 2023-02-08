package quiz;

import java.util.Scanner;

public class B08_ReverseCase {
	/*
	 사용자가 문장을 입력하면
	 입력한 문장의 소문자는 모두 대문자로, 대문자는 모두 소문자로 바꿔서 출력하세요. 
	 알파벳에 해당하지 않으면 그대로 출력
	*/
	
	public static void main(String[] args) {
		System.out.print("문자를 입력하세요");
		String text = new Scanner(System.in).nextLine();
		
		for (int i = 0; i < text.length(); ++i) {
			char ch = text.charAt(i);
			// 대문자 또는 소문자일때 -> 바꿔서 출력
			if (ch >= 'A' && ch <= 'Z') {
				System.out.printf("%c", ch +32);
			}else if(ch >= 'a' && ch <= 'z') {
				System.out.printf("%c", ch -32);
			}else {
				// 둘다 아닐때 -> 그냥 출력
				System.out.printf("%c", ch);
			}
			
		}
	}
}
