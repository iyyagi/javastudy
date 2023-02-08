package quiz;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01_Array2 {

	//1. 전달한 문자가 알파벳이면 true를 변환 아니면 false를 변환하는 함수.
	public static boolean rise(int a) {
		boolean tf = false;
		
		if (a >= 'a' && a <= 'z' || a >= 'A' && a <= 'Z') {
			tf = true;
		}
		return tf;
	}
	//2. 전달한 숫자가 3의 배수이면 true 아니면 false를 반환하는 함수.
	public static boolean three(int b) {
		return b % 3 == 0;
	}
	//3. 숫자를 하나 전달하면 문자열 "짝수입니다.", 또는 "홀수입니다"를 반환하는 함수
	public static String holjak(int c) {
		return c % 2 == 0 ? "짝수입니다." : "홀수입니다.";
	}
	//4. 숫자를 전달하면 해당 숫자의 모든 약수를 배열 형태로 반환하는 함수
//	public static int[] yaksu(int d) {
//		int[] yak = new int[d];
//		
//		for (int i = 1; i < d; ++i) {
//			if(d % i == 0) {
//				yak[i] = i;
//			}
//		}
//		
//		return yak;
//		
//	}
	
	// 5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하세요.
	public static boolean sosu(int e) {
		
		boolean prime = false;
		for (int i = 2; i <= e; ++i) {
			for (int j = 2; j < i; ++j) {
				if(i % j == 0) {
					prime = true;
					break;
				}
			}
			
		}
		return prime;
		
	}
	public static void main(String[] args) {
		
		
		// 1번.
		System.out.println(rise('a'));
		System.out.println(rise(5));
		
		// 2번.
		System.out.println(three(6));
		System.out.println(three(5));
		
		// 3번.
		System.out.println(holjak(22));
		System.out.println(holjak(33));
		

	}
}
