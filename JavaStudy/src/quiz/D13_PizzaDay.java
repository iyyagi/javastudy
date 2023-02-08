package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class D13_PizzaDay {

	/*
	  실행하면 오늘로부터 1년간의 이벤트 날짜를 모두 출력해주는 프로그램을 만들어보세요
	  파파스데이 : 매월 18일
	  파파프라이데이 : 홀수 번째 금요일

	  이벤트 날짜가 겹치는 경우 둘 모두 적용됨을 알려줘야 함

	 */
	public static boolean cehckPapasDay(Calendar toCheck) {
		return toCheck.get(Calendar.DATE) == 18;
	}
	
	public static boolean checkPapaFriday(Calendar toCheck) {
		return toCheck.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY && 
				toCheck.get(Calendar.DAY_OF_WEEK_IN_MONTH) % 2 == 1;
	}
	public static void printEventDays(Calendar start) {
		//Calendar event = start; // 얕은 복사
		Calendar event = (Calendar)start.clone();// clone은 Object 타입이라 다운 캐스팅 깊은 복사
		SimpleDateFormat eventDayFromat = new SimpleDateFormat("yy-MM-dd E");
		
		for (int i = 0; i < 365; ++i) {
			event.add(Calendar.DATE, 1);
			System.out.print(eventDayFromat.format(event.getTime()) + " - ");
			boolean otherEventExist = false;
			boolean eventExist = false;
			if (cehckPapasDay(event)) {
				System.out.print("파파스데이");
				otherEventExist = true;
				eventExist = true;
			}
			if (checkPapaFriday(event)) {
				if (otherEventExist) {
					System.out.print(", 파파프라이데이 (중복 적용 가능)");
				} else {
					System.out.print("파파프라이데이");
				}
				eventExist = true;
			}
			if (!eventExist) {
				System.out.print("x");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// 강사님 풀이
		Calendar today = Calendar.getInstance();
		printEventDays(today);
		System.out.println("메서드를 실행한 후의 today : " + today.get(Calendar.YEAR));
		
		
		
//		Calendar now = Calendar.getInstance();
//		Date date = now.getTime();
//
//		SimpleDateFormat myDateFormat = new SimpleDateFormat("yyyy-MM-dd EE");
//		String result = myDateFormat.format(date);
//		System.out.println(result);
//		
//		for (int i = 0; i < 365; ++i) {
//			
//			now.add(Calendar.DATE, 1);
//			if ((now.get(Calendar.DATE) == 18) && (now.get(Calendar.WEEK_OF_MONTH) % 2 == 1)  && (now.get(Calendar.DAY_OF_WEEK) == 6)) {
//				System.out.printf("%d년 %2d월 %2d일 ", now.get(Calendar.YEAR), now.get(Calendar.MONTH) + 1, now.get(Calendar.DATE));
//				System.out.println("(파파스데이 + 파파프라이데이) 둘다 적용됩니다.");
//				
//			}else if (now.get(Calendar.DATE) == 18) {
//				System.out.printf("%d년 %2d월 %2d일 ", now.get(Calendar.YEAR), now.get(Calendar.MONTH) + 1, now.get(Calendar.DATE));
//				System.out.println("파파스데이");
//			}else if ((now.get(Calendar.WEEK_OF_MONTH) % 2 == 1) && (now.get(Calendar.DAY_OF_WEEK) == 6)) {
//				System.out.printf("%d년 %2d월 %2d일 ", now.get(Calendar.YEAR), now.get(Calendar.MONTH) + 1, now.get(Calendar.DATE));
//				System.out.println("파파프라이데이");
//			}
//		}
	}
}
