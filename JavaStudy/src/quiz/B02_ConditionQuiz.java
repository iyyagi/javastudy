package quiz;

public class B02_ConditionQuiz {
	
	/*
		# 알맞은 비교 연산을 만들어보세요.
		1. int형 변수 a가 10보다 크고 20보다 작을 때 true
		2. int형 변수 b가 짝수일 때 true
		3. int형 변수 c가 7의 배수일 때 true
		4. int형 변수 d와 e의 차이가 30 때 true
		5. int형 변수 year가 400으로 나누어 떨어지거나 또는 4로 나누어 떨어지고 
		   100으로 나누어 떨어지지 않을 때 true
		6. boolean형 변수 powerOn이 false일 때 true
		7. 문자열 참조변수 str이 "yes"일 때 true
	*/
	
	public static void main(String[] args) {
		
//		int a = 15;
//		System.out.println(a > 10 && a < 20);
//		
//		int b = 4;
//		System.out.println(b / 2 == 2);
//		
//		int c = 49;
//		System.out.println(c % 7 == 0);
//		
//		int d = 60, e = 30;
//		int f1 = d - e;
//		int f2 = e - d;
//		System.out.println(d - e == 30 || e - d == 30);
//		System.out.println(Math.abs(f1) == 30);
//		System.out.println(Math.abs(f2) == 30);
//		
//		int year = 2000;
//		System.out.println(year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
//		
//		boolean powerOn = (!false);
//		System.out.println(powerOn);
//		
//		String str = "yes";
//		System.out.println(str == "yes");
		
		// 강사님 문제풀이
		//1. int형 변수 a가 10보다 크고 20보다 작을 때 true
		int a = 30;
		boolean result = a > 10 && a < 20; // 비교 연산자는 boolean 타입 변수에 넣을 수 있다.
		System.out.println("1번 결과 : " + result);
		// boolean result = 10 < a < 20 // 자바에서는 해당 연산이 안된다. int 10와 int a를 
		// 비교하면 boolean이되고  boolean이 20보다 크냐는 비교할 수 없다.
		
		//2. int형 변수 b가 짝수일 때 true
		int b = 3;
		System.out.println("2번 결과 : " + (b % 2 == 0));
		
		//3. int형 변수 c가 7의 배수일 때 true
		int c = 49;
		System.out.println("3번 결과 : "+ (c % 7 == 0));
		
		//4. int형 변수 d와 e의 차이가 30 때 true
		int d = 70, e = 40;
		boolean result4 = Math.abs(d - e) == 30;
		System.out.println("4번 결과 : " + result4);
		
		//5. int형 변수 year가 400으로 나누어 떨어지거나 또는 4로 나누어 떨어지고 
		//   100으로 나누어 떨어지지 않을 때 true
		// => 2월이 하루 더 있나 없나를 알 수 있는 공식(윤년)
		int year = 2022;
		boolean result5 = year % 400 == 0 || year % 4 == 0 && year % 100 !=0;
		System.out.printf("%d년에는 2월이 하루 더 있나요? %s\n", year, result5);
		                                           // boolean = %s로도 출력이 가능하다.
		
		//6. boolean형 변수 powerOn이 false일 때 true
		boolean powerOn = false;
		System.out.printf("지금 전원이 꺼져있나요 ? %s\n", !powerOn);
		
		
		// String 메모리에 주소를 넣어둔다.
		// 기본형 변수 int ... -> 데이터를 차곡차곡 쌓는 곳(스택)에 용량을 확보하고 값을 직접 저장
		// 참조형 변수 String... -> 데이터의 길이가 어떻게 될지 모르기 때문에 데이터를 스택에 쌓으면 비효율적
		// 스택에는 실제 데이터의 주소를 저장하고 실제 데이터는 데이터를 유동적으로 저장하는곳 (힙)에 저장
		//7. 문자열 참조변수 str이 "yes"일 때 true
		String str1 = "yes"; // str1, str2 다른 개체지만 주소가 같음
		String str2 = "yes";
		String str3 = new String("yes"); // 새로운 주소의 String yes
		
		// 참조형 변수끼리 == 을 통해 비교하면 실제 내용이 아닌 주소값과 비교한다.
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str2 == str1);
		// 참조형 변수의 실제 내용을 통해 비교하기 위해서는 해당 equals() 메서드를 사용해야한다.
		System.out.println(str1.equals(str3));
		System.out.println(str2.equals(str3));
		
		
	}
	
}
