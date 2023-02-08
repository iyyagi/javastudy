package quiz;

import java.util.Scanner;

public class E06_Factorial {
	/*
	  사용자가 정수를 입력하면 해당 정수의 !를 구하는 메서드를 만들어보세요. 
	  10! -> 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1
	  7! -> 7 * 6 * 5 * 4 * 3 * 2 * 1
	 */

	// Stack Over Flow를 발생시킨다.
	public static int test(int num) throws Exception {
		if (num == -200) { // 맨밑에 main함수를 보기위해 제한을 걸었다.
			throw new Exception("이제그만");
		}
		
		System.out.println("test : " + num);
		return test(num -1);
	}
	
	// 자기 자신을 호출하는 재귀함수 방식 (recursive, 성능 안좋음)
	public static int factorial2(int num) {
		if (num == 1) {
			return 1;
		}
		return num * factorial2(num-1);
	}

	public static void facCalc(int num) {

		int factorial = 1;
		for (int i = num; i > 0; --i) {
			System.out.print(i + " ");
			factorial = factorial * i;
		}
		System.out.println();
		System.out.println(num + "! " + factorial);

	}

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		int num = 0;
//		num = sc.nextInt();
//		facCalc(num);
		System.out.println(factorial2(10));
		try {
			System.out.println(test(5));
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}
}
