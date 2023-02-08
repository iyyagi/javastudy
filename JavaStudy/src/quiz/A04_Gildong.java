package quiz;

public class A04_Gildong {

	public static void main(String[] args) {
		// 변수명은 항상 소문자로..
		String name = "홍길동";
		int age = 20;
		String phone = "010-1234-1234";
		float cm = 178.5f;
		float kg = 75f; // 몸무게는 소수점도 나올 수 있기 때문에 float or double로 한다.
		String blood = "O";
		
		System.out.println("========== 출력 결과 ==========");
		System.out.println("");
		System.out.println("이름:\t" + name);
		System.out.println("나이:\t" + age);
		System.out.println("tel:\t" + phone);
		System.out.println("키:\t" + cm);
		System.out.println("몸무게:\t" + kg);
		System.out.println("혈액형:\t" + blood);
		
	}
	
}
