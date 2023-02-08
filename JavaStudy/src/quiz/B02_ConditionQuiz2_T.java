package quiz;

import java.util.Scanner;

public class B02_ConditionQuiz2_T {
	/*
	# 알맞은 조건식을 만들어보세요.
	1. char형 변수 a가 'q' 또는 'Q'일 때 true
	2. char형 변수 b가 공백이나 탭이 아닐 때 true
	3. char형 변수 c가 '0' ~ '9'일 때 true
	4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
	5. char형 변수 e가 한글일 때 true
	6. 사용자가 입력한 문자열이 quit일 때 true
	*/
	
	// 강사님 풀이
	public static void main(String[] args) {
		
		//1. char형 변수 a가 'q' 또는 'Q'일 때 true
		char a = 'Q';
		System.out.println((int)'q');
		System.out.println((int)'Q');
		
		System.out.println(a == 'q' || a == 'Q');
		System.out.println(a == 81 || a == 113);
		
		//2. char형 변수 b가 공백이나 탭이 아닐 때 true
		char b = ' ';
		
		System.out.println(b != ' ' && b != '\t');
		System.out.println(!(b==' ' || b == '\t'));
		
		//3. char형 변수 c가 '0' ~ '9'일 때 true
		char c = '3';
		System.out.println(c >= '0' && c <= '9');
		
		//4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
		char d = 'm';
		System.out.println(d >= 'a' && d <= 'z' || d >= 'A' && d <= 'Z');
		
		boolean isUpperCase = d >= 'A' && d <= 'Z';
		boolean isLowerCase = d >= 'a' && d <= 'z';
		System.out.println(isUpperCase || isLowerCase);
		
		// 5. char형 변수 e가 한글일 때 true
		char e = '철';
		
		// 16진수 리터럴 
		System.out.println((char)0xAc00); // 16진수를 사용할 때 앞에 0x유니코드
		System.out.println((char)0xAc01);
		System.out.println((char)0xAc0f);
		System.out.println(e >= '가' && e <= '힣');
		System.out.println(e >= 0xAc00 && e <= 0xD7A3);
		System.out.println(e >= 44032 && e <= 55203);
		
		//6. 사용자가 입력한 문자열이 quit일 때 true
		Scanner sc = new Scanner(System.in);
		String command;
		System.out.print(">");
		command = sc.next();
		System.out.println("Quit?" + (command.equals("quit")));
		
	}

}
