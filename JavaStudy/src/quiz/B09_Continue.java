package quiz;

public class B09_Continue {
	/*
	  1. 1부터 30까지 한 줄에 숫자를 5개씩 출력
	  
	  2. 1부터 200까지의 숫자 중 2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합

	*/
	
	public static void main(String[] args) {
		
		for (int i = 1; i <=30; ++i) {
			System.out.printf("%5d", i);
			if (i % 5 == 0 ) {
				System.out.println();
			}
		}
		
		int sum = 0;
		for (int i = 1; i <= 200; ++i ) {
			if ( i % 2 == 0 || i % 3 == 0 ) {
				continue;
			}
			sum = sum + i;
		}
		System.out.println();
		System.out.print("합계 : " + sum);
		
	}
}
