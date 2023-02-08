package quiz;

import java.util.Arrays;

public class C01_MethodQuiz {
	/*
	  # 다음 매서드를 정의하고 올바르게 동작하는지 테스트 해보세요.
	  
	  1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	  
	  2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	  
	  3. 숫자를 하나 전달하면 문자열 "짝수입니다." 또는 "홀수입니다"를 반환하는 함수
	  
	  4. 숫자를 전달하면 해당 숫자의 모든 약수를 int[]로 반환하는 함수
	  
	  5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	  
	 */
	
	// 1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	public static boolean Alphabat(char a) {
//		boolean tf = false;
//		if (a >= 'a' && a <= 'z' || a >= 'A' && a <= 'Z') {
//			tf = true;
//		}
//		return tf;
		// 쉽게 표현 가능하다.
		return a >= 'a' && a <= 'z' || a >= 'A' && a <= 'Z';
	}
	
	//2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	public static boolean three(int a) {
//		boolean tf = false;
//		if (a % 3 == 0) {
//			tf = true;
//		}
//		return tf;
		
		return a % 3 == 0;
	}
	
	// 3. 숫자를 하나 전달하면 문자열 "짝수입니다." 또는 "홀수입니다"를 반환하는 함수
	public static String text(int a) {
		return a % 2 == 0 ? "짝수입니다." : "홀수입니다.";
//	String str = "";
//		if (a % 2 == 0) {
//			str = "짝수 입니다.";
//		} else {
//			str = "홀수 입니다.";
//		}
//		return str;
//		if (a % 2 == 0 ) {
//			return "짝수입니다.";
//		} else {
//			return "홀수입니다.";
//		}
	}
	// 4. 숫자를 전달하면 해당 숫자의 모든 약수를 int[]로 반환하는 함수
	public static int[] yaksu(int a) {
		int cnt = 0;
		for (int i = 1; i <= a; ++i) {
			if (a % i == 0) {
				++cnt;
			}
		}
		int[] yaksu = new int[cnt];
		cnt = 0;
		for (int i = 1; i <= a; ++i) {
			if (a % i == 0) {
				yaksu[cnt++] = i;
			}
		}
		
		return yaksu;
		
//		int count = 0;
//		for (int i = 0; i <= a; ++i) {
//			++count;
//		}
//		
//		int[] num = new int[count];
//		for (int i = 1; i <= a; ++i) {
//			if (a % i == 0) {
//				num[i] = i;	
//			}
//		}
//		return num;
	}
	// 5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	public static boolean primes(int a) {
//		boolean prime = true;
//		for (int i = 2; i <= a; ++i) {
//			for (int j = 1; j < i; ++j) {
//				if (a % 2 == 0) {
//					prime = false;
//					break;
//				}
//			}
//		}	
//			return prime;
		for (int i = 2; i <= Math.sqrt(a); ++i) {
			if (a % i == 0) {
				System.out.println("[INFO] " + i + "로 나누어 떨어져서 소수가 아닙니다.");
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(Alphabat('d'));
		System.out.println(Alphabat('1'));
		System.out.println(three(3));
		System.out.println(three(4));
		System.out.println(text(4));
		System.out.println(text(5));
		System.out.println(Arrays.toString(yaksu(20)));
		System.out.println(Arrays.toString(yaksu(10)));
		System.out.println(primes(7));
		System.out.println(primes(88));
		
		// boolean 타입을 리턴하는 메서드는 조건으로 사용할 수 있다.
		if (primes(337)) {
			System.out.println("소수일 때 도착하는 곳");
		} else {
			System.out.println("소수가 아닐 때 도착하는 곳");
		}

	}
}
