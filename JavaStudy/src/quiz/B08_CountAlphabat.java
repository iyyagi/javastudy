package quiz;

import java.util.Scanner;

public class B08_CountAlphabat {
	/*
	  사용자가 문장을 입력하면
	  해당 문장에 알파벳 e가 몇 회 등장하는지 알려주는 프로그램을 만들어보세요
	  힌트 : 모든 문자가 해당 문자인지
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg = "";
		System.out.print("문장을 입력하세요. >>");
		msg = sc.nextLine();
		int count = 0;
		for (int index = 0; index < msg.length(); ++index ) {
			if(msg.charAt(index) == 'e' || msg.charAt(index) == 'E') {
				count += 1;
			}
		}
		System.out.printf("입력값 %s, e또는 E의 횟수 : %d\n", msg, count);
	}
}
