
public class B01_Operator01 {

	/*
		# 연산자(Operator)
		
		- 계산할 때 데이터와 함께 사용하는 것
		- +, -, *, /, >, <, >=, <=, !, && ...
		
		# 산술 연산자
		+ : 더하기
		- : 빼기
		* : 곱하기
		/ : 나누기
		% : 나머지
	*/
	public static void main(String[] args) {
		
		int a = 30, b = 8;
		double c = 30, d = 8;
		
		// 정수와 정수의 연산 결과 = 정수
		System.out.println(a+b);
		System.out.println(a+a);
		
		// 정수와 실수의 연산 결과 = 실수
		System.out.println(a+c);
		System.out.println(c+c);
		
		// 정수와 정수를 나누면 몫만 구한다.
		System.out.println(a / b); // 30 / 8
		
		// 정수와 실수를 나누면 정확한 값을 구한다.
		System.out.println(a / d); // 30 / 8.0
		System.out.println(c / b); // 30.0 / 8
		System.out.println(c / d); // 30.0 / 8.0
		
		// 나머지 연산
		System.out.println(20 % 3);
		System.out.println(20 % 8);
		
		// n으로 나눈 나머지는 0 부터 n-1 까지 밖에 나올 수 없다.
		System.out.println("0 % 3 : " + 0 % 3);
		System.out.println("1 % 3 : " + 1 % 3);
		System.out.println("2 % 3 : " + 2 % 3);
		System.out.println("3 % 3 : " + 3 % 3);
		System.out.println("4 % 3 : " + 4 % 3);
		System.out.println("5 % 3 : " + 5 % 3);
		System.out.println("6 % 3 : " + 6 % 3);
		System.out.println("7 % 3 : " + 7 % 3);
		
		// Math.pow(a, b) : a 제곱 b를 구해서 반환한다. (결과가 double 타입)
		System.out.println(Math.pow(2, 10));
		System.out.println(Math.pow(3, 10));
		System.out.println(Math.pow(2, 11));
		System.out.println(Math.pow(2, 12));
		
		// 반환이 있는 함수
		double result = Math.pow(2, 8);
		System.out.println(result);
		
		// 반환이 없는 함수 예
		// double result2 = System.out.println("Hello World");
		
		// Math.sqrt(a) : a의 제곱근을 구해서 반환한다.
		System.out.println(Math.sqrt(2));
		System.out.println(Math.sqrt(49));
		System.out.println(Math.sqrt(51));
		System.out.println(Math.sqrt(64));
		
		// Math.abs(a) : a의 절대값을 구해서 반환한다. 무조건 양수로 변환
		System.out.println(Math.abs(-55)); // 음수가 들어와도 양수
		System.out.println(Math.abs(55)); // 양수가 들어와도 양수
		
		// Math.round(a) : a를 소수 첫째 자리에서 반올림한 결과를 반환한다.
		System.out.println(Math.round(123.55));
		
		// Math.ceil(a) : a를 올린 결과를 반환한다.
		System.out.println(Math.ceil(333.00999));
		System.out.println(Math.ceil(333.0));
		
		// Math.floor(a) : a를 내린 결과를 반환한다.
		System.out.println(Math.floor(333.99999));
		System.out.println(Math.floor(333.12345));
		
		// Math.round()로 원하는 자릿수에서 반올림하기
		// - 반올림하고 싶은 자리를 소수 첫 번째 자리로 만든 후 다시 나눈다.
		double value = 77.65345; // 반올림을 5에서 해보자.
		System.out.println(Math.round(value * 10000) / 10000.0); // 반올림을 5에서 한 예시
		System.out.println(Math.round(value * 1000) / 1000.0); // 반올림을 4에서 한 예시
		System.out.println(Math.round(value * 100) / 100.0);
		System.out.println(Math.round(value * 10) / 10.0);
		
	}
}
