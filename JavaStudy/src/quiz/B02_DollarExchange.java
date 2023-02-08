package quiz;

import java.util.Scanner;

public class B02_DollarExchange {

	/*
	 	// 원을 입력 받으면 달러로 얼마인지 환율을 계산해 주는 프로그램을 만드세요.	
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double exchange = 1388.59; // 1달러당 1388.59원
		double dollar = 0; 
		
		System.out.print("원￦을 입력하세요. >> ");
		
		int won = sc.nextInt();
		dollar = won / exchange; // 환율 계산
		
		System.out.printf("달러$로는 %.2f$입니다.", dollar);
		
		/*
		  // 강사님 문제풀이
		   
		    int won;
		    double dollar;
		    System.out.print("한국 돈을 입력 > ");
		    
		    // 한 번만 계산하고 끝낼때 이런식으로 Scanner 사용이 가능
		    won = new Scanner(System.in).nextInt(); 
		    
		    // 정수와 실수의 계산 결과는 실수가 된다.
		    dollar = won / 1400.8;
		    
		    System.out.printf("%d원은 %.2f달러 입니다.\n", won, dollar);   
		
		*/
		
	}
}
