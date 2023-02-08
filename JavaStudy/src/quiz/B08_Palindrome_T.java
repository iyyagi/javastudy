package quiz;

import java.util.Scanner;

public class B08_Palindrome_T {
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
		
		Scanner sc = new Scanner(System.in);
		String word;
		System.out.print("단어를 입력 > ");
		word = sc.next();
		
		// 01234567
		// straight : 8글자
		// i : 0
		// i:0    word.length() - i - 1 : 7
		// i:1    word.length() - i - 1 : 6
		// i:2    word.length() - i - 1 : 5
		// i:3    word.length() - i - 1 : 4
		// i:4    word.length() - i - 1 : 3
		// ...
		// i:7    word.length() - i - 1 : 0
		
		
		boolean palindrome = true;
		// 1. i번째 글자와 len - i번째 글자가 모두 일치하면 좌우 대칭
		int len = word.length();
		for (int i = 0; i < len; ++i) {
			int i2 = len -1 -i;
			// i : 0, 1, 2, 3 ... len -1
			char ch1 = word.charAt(i);
			char ch2 = word.charAt(i2);
			
			if (ch1 == ch2) {
				System.out.printf("%d번째 [%c]와 %d번째 [%c]가 일치합니다.\n", i, ch1, i2, ch2 );
			
			}else {
				System.out.printf("%d번째 [%c]와 %d번째 [%c]는 일치하지 않습니다.\n", i, ch1, i2, ch2 );
				palindrome = false;
			}

		}
		System.out.println("좌우대칭 여부" + palindrome);
		
		// 2. 입력받은 글자를 거꾸로 뒤집은 후 거꾸로 되기 전과 똑같으면 좌우 대칭
		
		// 비어있는 문자열에 문자를 하나씩 계속 이어 붙여 문자를 만들 수 있다.
		String reversed = "";
		System.out.print("문자를 입력하세요 >>");
		String example = sc.next();
		
		for (int i = example.length() -1; i >= 0; --i) {
			reversed += example.charAt(i);
			
		}
		System.out.println("원래 문자열" + example);
		System.out.println("뒤집은 문자열" + reversed);
		System.out.println("좌우대칭이니?" + example.equals(reversed));
	}
}