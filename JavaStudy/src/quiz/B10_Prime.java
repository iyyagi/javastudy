package quiz;

import java.util.Scanner;

public class B10_Prime {

	/*
	  	사용자로부터 숫자(양수)를 입력 받으면
	  	1부터 입력한 숫자 사이에 있는 모든 소수를 출력해보세요.
		
		※ 소수 : 나누어 떨어지는 수가 1과 자기 자신밖에 없는 수
			ex > 2, 3, 5, 7, 11, 13
		
		※ 사용자가 잘못된 숫자를 입력하는 경우 다시 제대로 입력하게 만들 것.
	*/
	
	public static void main(String[] args) {
		
		//int num = 50; 
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		for (;;) { // 무한반복
			System.out.print(">> ");
			num = sc.nextInt();
			// num에 원하는 숫자가 들어와야 반복문을 탈출할 수 있다.
			if(num > 1) {
				break;
			}
			System.out.println("2이상의 숫자를 입력하세요.");
		}	
		
		// 1 ~ 50 사이에 있는 모든 소수를 찾기
		// i 가 소수인지 검사
		// 방법1 - i를 1부터 i까지의 숫자로 모두 나누어 본다.
		//        모두 나누었을 때 약수가 2개라면 소수다.
		int count = 0;
		for (int i = 2; i <= num; ++i) {
			boolean prime = true;
			for (int j = 1; j <= i; ++j) {
				if(i % j == 0) {
					++count;
				}
			}
			
			if (prime=(count == 2)) {
				System.out.printf("약수가 %d개 입니다. 결과는? %s\n ", i, prime);
			}
		}
		
		System.out.println("=========================");
		
		
		// 방법2 - i를 2부터 자기 자신 직전까지의 나눈다.
	    //        나누어 떨어지는 수가 없으면 소수다.
		//        즉, 나누어 떨어지는 숫자가 하나라도 있으면 소수가 아니다.
		for (int i = 2; i <= num; ++i) {
			boolean prime = true;
			for (int j = 2; j < i; ++j) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
			System.out.printf("%d ", i);
			}
		}
		System.out.println();
		
		// 방법3 - i를 2부터 검사하는 숫자의 제곱근까지의 숫자로 나눈다.
	    // 		  Math.sqrt()
		                     // 50
		for (int i = 2; i <= num; ++i) {
			boolean prime = true; // i
			for (int j = 2; j <= Math.sqrt(i); ++j) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				System.out.printf("%d ", i);
			}
		}
	}
}