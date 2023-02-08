package quiz;

import java.util.Scanner;

public class B00_CalcAge {

	// 사용자로부터 태어난 해를 태어났는지 입력 받으면 나이를 출력해 주는
	// 프로그램을 만들어보세요.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age = 0;
		System.out.print("태어난 연도를 입력해 주세요. >> ");
		int year = sc.nextInt();
		
		String name;
		System.out.print("이름을 입력해 주세요 >> ");
		name = sc.next();
		
		age = (2022 - year) + 1;
		System.out.printf("현재 나이는 %d세 ", age);
		System.out.printf("이름은 %s 입니다. ", name);
		
		/*
		
		// 강사님 문제풀이
		Scanner yearScanner = new Scanner(System.in)
		
		int thisYear, birthYear, age;
		
		System.out.print("올해와 태어난 해를 입력해주세요>> ");
		birthYear = yearScanner.nextInt();
		thisYear = yearScanner.nextInt();
		
		age = thisYear - birthYear +1;
		
		System.out.printf("당신의 나이는 %d살 입니다.", age);
		
		*/
		
		
	}
	
}
