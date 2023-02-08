package quiz;

import java.util.Scanner;

public class B04_MonthToSeason_T {
		
	public static void main(String[] args) {
		// 강사님 문제풀이
		String season;
		int month;
		System.out.println("몇 월 인가요?");
		
		switch(month = new Scanner(System.in).nextInt()) {
		case 12,1,2:
			season = "겨울";
			break;
		case 3,4,5:
			season = "봄";
			break;
		case 6,7,8:
			season = "여름";
			break;
		case 9,10,11:
			season = "가을";
			break;
		default:
			season = "없음";
			break;
		}
		System.out.printf("%d월은 %s입니다.", month, season);
	}
}
