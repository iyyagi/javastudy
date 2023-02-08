package quiz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import myobj2.parking.Car;
import myobj2.parking.CarType;

public class D14_ParkingSystem_T {


	/*
	  차량5부제 프로그램 만들기
	  myobj2.parking Car, CarType 클래스
	  
	 
	*/
	
	
	public static String checkRestricted(Car car, LocalDate date) {
		if (car.getType() == CarType.DISABLED) { // CarType은 인스턴스가 4개라 == 비교가 가능하다. CarType클래스에서 생성을 제한해둠
			return String.format("[%s] 장애인 차량은 차량5부제 제외차량 입니다.", car, 
					date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
		} else if (car.getType() == CarType.KID) {
			return String.format("[%s] 유아동승 차량은 차량5부제 제외차량 입니다.", car, date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
		} else if (car.getType() == CarType.LIGHTCAR) {
			return String.format("[%s] 경차 차량은 차량5부제 제외차량 입니다.", car, date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
		}
		
		char lastNum = car.getNumber().charAt(car.getNumber().length()-1);
		
		// && 는 || 보다 먼저 연산되므로 주의해야 한다.
		if ((lastNum == '1' || lastNum == '6') && date.getDayOfWeek() == DayOfWeek.MONDAY) {
			return String.format("[%s]는 %s에 출입가능 입니다.", car, 
					date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
		} else if ((lastNum == '2' || lastNum == '7') && date.getDayOfWeek() == DayOfWeek.TUESDAY) {
			return String.format("[%s]는 %s에 출입가능 입니다.", car, 
					date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
		} else if ((lastNum == '3' || lastNum == '8') && date.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
			return String.format("[%s]는 %s에 출입가능 입니다.", car, 
					date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
		} else if ((lastNum == '4' || lastNum == '9') && date.getDayOfWeek() == DayOfWeek.THURSDAY) {
			return String.format("[%s]는 %s에 출입가능 입니다.", car, 
					date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
		} else if ((lastNum == '5' || lastNum == '0') && date.getDayOfWeek() == DayOfWeek.FRIDAY) {
			return String.format("[%s]는 %s에 출입가능 입니다.", car, 
					date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
		}
		
		return String.format("[%s]는 %s에 출입금지 입니다.", car, date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
	}
	
	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>(10);
		for (int i = 0; i < 10; ++i) {
			cars.add(new Car());
		}
		
		LocalDate checkDay = LocalDate.now();
		
		final int A_WEEK = 7;
		for (int i = 0; i < A_WEEK; ++i) {
			System.out.println(checkDay.getDayOfWeek() + " TEST : ");
			// Car 클래스의 car라는 변수에 cars를 넣음 For - Each
			for (Car car : cars) {
				String result = checkRestricted(car, checkDay);
				System.out.println("\t" + result);
			}
			checkDay = checkDay.plusDays(1);
		}
		
		
	}
}
