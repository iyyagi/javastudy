package quiz;

import java.util.Scanner;

import org.w3c.dom.Text;

public class B09_Numeric01 {
	/*
		사용자가 입력한 문자열이 모두 숫자로만 구성된 문자열인지
		판별하는 프로그램을 만들어보세요.
		
		1. 한 문자씩 꺼내면서 숫자인지 검사한다.
		2. 끝까지 검사했을 때 모두 숫자였으면 true
		3. 검사하다가 중간에 숫자가 아닌 것을 만나면 false
		
	 */
	// 강사님 풀이
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String test = "";
		System.out.print("문자를 입력하세요");
		test = sc.next();
		
		boolean numeric = true;

		for (int i = 0; i < test.length(); ++i) {
			char ch = test.charAt(i);
			
			if (ch < '0' || ch > '9') {
				numeric = false;
				break;
			}
		}
		System.out.println("결과 :" + numeric);
		
		// 다른 방법
//		for (int i = 0; numeric && i < test.length(); ++i) {
//		char ch = test.charAt(i);
//		numeric = numeric && (ch >= '0' && ch <= '9');
//		}
//		System.out.print("결과 : " + numeric);
	}
}

