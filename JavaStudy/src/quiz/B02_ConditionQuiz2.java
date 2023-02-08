package quiz;

import java.util.Scanner;

public class B02_ConditionQuiz2 {
	/*
		# 알맞은 조건식을 만들어보세요.
	
		1. char형 변수 a가 'q' 또는 'Q'일 때 true
		2. char형 변수 b가 공백이나 탭이 아닐 때 true
		3. char형 변수 c가 '0' ~ '9'일 때 true
		4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
		5. char형 변수 e가 한글일 때 true
		6. 사용자가 입력한 문자열이 quit일 때 true
		
	*/
	
	public static void main(String[] args) {
		//1. char형 변수 a가 'q' 또는 'Q'일 때 true
		char a = 'q';
		boolean result1 = a == 'q' || a == 'Q';
		System.out.println("a의 결과 :" + result1);
		
		//2. char형 변수 b가 공백이나 탭이 아닐 때 true
		char b = '\t';
		//System.out.println((int)' ');
		//System.out.println((int)'\t');
		boolean result2 = (int)b !=32 && (int)b != 9;
		System.out.println("b의 결과 :" + result2);
		
		//3. char형 변수 c가 '0' ~ '9'일 때 true
		char c = '9';
		boolean result3 = c >= '0' && c <= '9';
		System.out.println("c의 결과 :" + result3);
		
		//4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
		char d = 'c';
		boolean result4 = d == 'd' || d == 'D';
		System.out.println("d의 결과 :" + result4);
		
		//5. char형 변수 e가 한글일 때 true
		char e ='가';
		// System.out.println((int)'가');
		boolean result5 = (int)e == 44032;
		System.out.println("e의 결과 :" + result5);
		
		//6. 사용자가 입력한 문자열이 quit일 때 true
		System.out.print("문자열을 입력하세요 >>");
		String str1;
		Scanner sc = new Scanner(System.in);
		str1 = sc.next();
		String str2 = new String("quit");
		System.out.println(str1.equals(str2));
		
	}
	
}
