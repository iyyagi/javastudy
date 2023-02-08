package myobj;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Peach implements Comparable {

	String kind; // 백도 황도
	int grade;	 // 1 ~ 5등급
	double sweet;	 // 10 ~ 20%
	int country; // 국가코드
	int price;
	String enName;
	String countryName;
	static String[] countryNames = {"China", "Italy", "Spain", "Usa"};
	
	private static Random r = new Random();
	private static int[] countryCodes = {86, 39, 34, 1};

	private static String[] enNames = {"china", "italy", "spain", "usa"};
	private static int[] enValues = {1, 2, 3, 4};
	
	public Peach() {
		int countrys = r.nextInt(countryCodes.length);
		kind = r.nextBoolean() ? "백도" : "황도";
		grade = r.nextInt(5) + 1;
		sweet = r.nextDouble(10) + 10;
		price = (r.nextInt(21) +10) *100; // 1000원 ~ 3000원
		// 국가코드 중국(86) 이탈리아(39), 스폐인(34), 미국(1)
		int randomCountry = r.nextInt(countryCodes.length);
		country = countryCodes[randomCountry];
		
		// enName = enNames[countrys];
		countryName = countryNames[randomCountry];
	}
	
	// 다른 패키지 에서는 수정할 수 없도록 제어할 수 없음
	public int getPrice() {
		return price;
	}
	
	public double getSweet() {
		return sweet;
	}

	public String getCountryName() {
		return countryName;
	}
	
	@Override
	public String toString() {
		return String.format("[%s/%d등급/%.2f%%/(%d)/%d원/%s\n", kind, grade, sweet, country, price, countryName);
	}
	
	// compareTo : Comparable 인터페이스에 딸려 있는 추상 메서드 
	// 			   현재 인스턴스와 매개변수로 전달받은 인터페이스의 비교 결과를 정의해 놓아야 한다.
	@Override
	public int compareTo(Object o) {
		Peach p2 = (Peach) o; // 다운캐스팅
		
		// this 와 매개변수로 전달 받은 인스턴스 p2를 비교 해야한다.
		// 비교 결과를 int로 전달해준다. 
		// return 1 : this가 더 크다(오름차순 시 오른쪽으로 가야한다.)
		// return 0 : 두 인스턴스 크기가 같다.
		// return -1 : this가 더 작다. (오름차순 시 왼쪽으로 가야한다.
		if (this.grade > p2.grade) {
			return 1;
		} else if (this.grade < p2.grade) {
			return -1;
		} else {
			return 0;
		}
	}
}
