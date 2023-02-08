package quiz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class D14_ParkingSystem {


	public static boolean checkType(String type) {
		List<String> types = new ArrayList();
		Collections.addAll(types, "장애인", "육아동승", "경차", "하이브리드");
		
		if (!types.contains(type)) {
			return false;
		}
		return true;
	}
	
	public static boolean checkCar(String word, String type) {
		LocalDate date = LocalDate.now();
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		boolean monday = false; boolean tuesday = false; boolean wendnesday = false; 
		boolean thursday = false; boolean friday = false; 
		
		LocalDate dateHoliday;
		dateHoliday = LocalDate.of(2022, 11, 10);
		
		List<LocalDate> holidays = new ArrayList();
//		holidays.add(LocalDate.of(2022, 11, 10));
		holidays.add(LocalDate.of(2022, 12, 25));
		holidays.add(LocalDate.of(2023, 01, 01));
		holidays.add(LocalDate.of(2023, 01, 23));
		holidays.add(LocalDate.of(2023, 01, 24));
		char lastNumber = 0;
		for (int i = 0; i < word.length(); ++i) {
			lastNumber = word.charAt((word.length()-1));
		}
		
		System.out.println("끝자리 : " + lastNumber);
		while(true) {
			if (holidays.contains(date.now())) {
				System.out.println("오늘은 공휴일이라 출입이 가능합니다. 공휴일 : " + holidays);
				break;
			}
			
			if (dayOfWeek.equals(DayOfWeek.MONDAY) && lastNumber == '1' || lastNumber == '6' || checkType(type)) {
				System.out.println("출입이 가능한 차량입니다.");
				monday = true;
				break;
			} else if (dayOfWeek.equals(DayOfWeek.THURSDAY) && lastNumber == '2' || lastNumber == '7' || checkType(type)) {
				System.out.println("출입이 가능한 차량입니다.");
				tuesday = true;
				break;
			} else if (dayOfWeek.equals(DayOfWeek.WEDNESDAY) && lastNumber == '3' || lastNumber == '8' || checkType(type)) {
				System.out.println("출입이 가능한 차량입니다.");
				wendnesday = true;
				break;
			} else if (dayOfWeek.equals(DayOfWeek.THURSDAY) && lastNumber == '4' || lastNumber == '9' || checkType(type)) {
				System.out.println("출입이 가능한 차량입니다.");
				thursday = true;
				break;
			} else if (dayOfWeek.equals(DayOfWeek.FRIDAY) && lastNumber == '5' || lastNumber == '0' || checkType(type)) {
				System.out.println("출입이 가능한 차량입니다.");
				friday = true;
				break;
			} else if (dayOfWeek.equals(DayOfWeek.SATURDAY)) {
				System.out.println("휴일은 모든 차량이 출입 가능합니다.");
				break;
			} else if (dayOfWeek.equals(DayOfWeek.SUNDAY)) {
				System.out.println("휴일은 모든 차량이 출입 가능합니다.");
				break;
			}
			if (!monday) {
				System.out.println(word + " 차량은 주차가 불가능합니다.");
				break;
			} else if (!tuesday) {
				System.out.println(word + " 차량은 주차가 불가능 합니다.");
				break;
			} else if (!wendnesday) {
				System.out.println(word + " 차량은 주차가 불가능 합니다.");
				break;
			} else if (!thursday) {
				System.out.println(word + " 차량은 주차가 불가능 합니다.");
				break;
			} else if (!friday) {
				System.out.println(word + " 차량은 주차가 불가능 합니다.");
				break;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("차량번호를 입력하세요.");
		String word = sc.nextLine();
		System.out.println("해당 되시면 입력해주세요. 장애인, 유아동승, 경차, 하이브리드");
		String type = sc.next();
		checkCar(word,type);


	}
}
