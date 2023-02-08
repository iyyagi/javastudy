
public class C02_MethodOverloading {

	/*
	  # 메서드 오버로딩(method overloading)
	  - 같은 이름의 메서드를 여러개 선언하는 방식
	  - 매개변수의 타입 또는 개수가 다르다면 이름이 같아도 
	    각 메서드를 구분할 수 있기 때문에 중복 선언이 가능하다.
	*/
	public static int plus(int a, int b) {
		return a + b;
	}
	
	// 매개 변수의 개수가 다르다면 같은 이름으로 메서드를 선언할 수 있다.
	public static int plus(int a, int b, int c) {
		return a + b + c;
	}
	// 매개 변수의 개수가 같아도 타입이 다르다면 다른 메서드로 인식할 수 있다.
	public static float plus(float a, float b) {
		return a + b;
	}
	// 4개 이상의 합을 구할 때 int... 변수명 선언
	public static int plus(int... numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; ++i) {
			sum += numbers[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		plus(1, 2);
		plus(1, 2, 3);
		plus(1.2f, 2.3f);
		plus(1, 2, 3, 4, 5, 6, 7, 8);
		
		System.out.println(plus(5, 6, 7, 8));
	}
	
}
