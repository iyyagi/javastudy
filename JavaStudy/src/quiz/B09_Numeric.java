package quiz;

import java.util.Scanner;

public class B09_Numeric {
	/*
		사용자가 입력한 문자열이 모두 숫자로만 구성된 문자열인지
		판별하는 프로그램을 만들어보세요.
	 */
	public static void main(String[] args) {
		
		System.out.print("문자를 입력하세요 >>");
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		boolean tf = true;
		int len = word.length(); // 길이 계산
		for (int i = 0; i < len; ++i) { // i 값은 길이만큼 증가
			char a = word.charAt(i);
			if (a >= '0' && a <= '9') {
				System.out.printf("%d번째의 값 [%c] \n", i, a);
			}else {
				// 입력한 문자열이 문자?
				System.out.printf("%d번째의 값 [%c] \n", i, a);
				tf = false; // 문자일 경우 false
				break;
			}
		}
		System.out.print("모두 숫자인가요? " + tf);
	}
}
