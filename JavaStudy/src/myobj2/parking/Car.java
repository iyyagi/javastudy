package myobj2.parking;

import java.util.Random;

import phonebook.Main;

// step1
public class Car {

	String number;
	CarType type;
	
	private static Random r = new Random();
	final private static String USAGE_SYMBOLS = "가나다라마거너더러머버서어저고노도로모보소오조구누두루무부수우주하허호배"
			+ "공해육합국";
	final private static CarType[] CAR_TYPES = { // CarType의 DTO를 추가하여 일반 승용차의 확률을 높인다.
			CarType.NOAML, CarType.NOAML, CarType.NOAML, CarType.NOAML, CarType.LIGHTCAR, CarType.NOAML,
			CarType.NOAML, CarType.NOAML, CarType.NOAML, CarType.NOAML, CarType.NOAML,
		CarType.NOAML, CarType.DISABLED, CarType.KID, CarType.NOAML, CarType.LIGHTCAR, CarType.LIGHTCAR
	};
	
	// step3
	private static String randomCarNumber() {
		if (r == null) {
			r = new Random();
		}
		StringBuilder sb = new StringBuilder();
		sb.append(r.nextBoolean()?
				String.format("%02d", r.nextInt(99) + 1) :
				String.format("%03d", r.nextInt(900) + 100)
				);
		sb.append(USAGE_SYMBOLS.charAt(r.nextInt(USAGE_SYMBOLS.length())));
		sb.append(String.format("%04d",r.nextInt(10000))); // 0000 ~ 9999까지의 차량 번호
		return sb.toString();
	}
	// step4
	private static CarType randomCarType() {
		if (r == null) {
			r = new Random();
		}
		return CAR_TYPES[r.nextInt(CAR_TYPES.length)];
	}
	
	// step 2
	public Car() {
		number = randomCarNumber();
		type = randomCarType();
//		System.out.println("차번호 : " + number);
//		System.out.println("타입 : " + type.getDisplayName());
	}
	
	
	public String getNumber() {
		return number;
	}
	
	public CarType getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return number + "/" + type.getDisplayName();
	}
	
	
//	public static void main(String[] args) {
//		new Car();
//	}
}
