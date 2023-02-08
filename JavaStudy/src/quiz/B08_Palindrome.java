package quiz;

import java.util.Scanner;

public class B08_Palindrome {
	/*
	  사용자가 단어를 입력하면 해당 단어가 완벽하게 좌우 대칭인지
	  판별해주는 프로그램을 만들어보세요.
	  
	  >> Lelvel
	  -> 좌우대칭이 아닙니다.
	  >> level
	  -> 좌우대칭 입니다.
	  >> abba
	  -> 좌우대칭 입니다.

	*/
	
	public static void main(String[] args) {
		
		System.out.print("단어를 입력하세요 >>");
		String text = new Scanner(System.in).nextLine();
		System.out.println("단어는 " + text );
		
		
		int count = 0;
		int len = text.length();
		if (count == len) {
			System.out.println("좌우대칭 입니다.");
		}else {
			System.out.println("좌우대칭이 아닙니다.");
		}
		
		for (int i = 0; i < len; ++i) {
			char ch = text.charAt(i);
			char ch1 = text.charAt(len -i -1);

			if (ch == ch1) {
				++count;
			}else if(ch != ch1) {	
				++count;
			}
		}
		
	}	
}
