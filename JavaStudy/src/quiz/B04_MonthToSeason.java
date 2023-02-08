package quiz;

import java.util.Scanner;

public class B04_MonthToSeason {
		/*
		  사용자로부터 몇 월인지 입력받으면 해당하는 계절을 출력해 보세요.
		  (반드시 switch-case문을 사용할 것)
		*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int month = 0;
		
		System.out.print("월을 입력하세요>>");
		month = sc.nextInt();
		
		
		switch(month) {
			case 11,12,1,2,3:
				System.out.println("겨울입니다.");
				break;
			case 4,5:
				System.out.println("봄 입니다.");
				break;
			case 6,7,8:
				System.out.println("여름 입니다.");
				break;
			case 9,10:
				System.out.println("가을 입니다.");
				break;
			default:
				System.out.println("월을 다시 입력해 주세요.");
				break;
		}
			
		
		
	}
}
