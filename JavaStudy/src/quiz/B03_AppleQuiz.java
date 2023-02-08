package quiz;

import java.util.Scanner;

public class B03_AppleQuiz {

	/*
	 * 사과를 10개씩 담을 수 있는 바구니가 있다.
	 * 
	 * 사용자가 사과의 개수를 입력하면 사과를 모두 담기 위해 필요한 바구니의 개수를 알려주는 프로그램을 만들어 보세요.
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int apple = 0;
		double basket = 0;

		System.out.println("사과의 개수를 입력하세요 >>>");

		apple = sc.nextInt();

		if (apple % 10 == 0) {

			basket = apple / 10;
			System.out.printf("바구니의 개수 : %.1f\n", basket);

		} else if (apple % 10 > 0) {
				basket = apple / 10.0;
				System.out.printf("바구니의 개수 : %.1f\n", basket);
			
		} else if (apple < 0 ) {
				System.out.println("사과의 개수를 다시 입력해 주세요");
			
		} else {
			System.out.println("사과의 개수를 입력해 주세요." + apple);
			
		}
	}
}