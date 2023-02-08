package quiz;

import java.util.Scanner;

public class B06_ForQuiz2 {

	/*
	  사용자로부터 숫자를 입력 받으면
	  0부터 해당 숫자사이에 존재하는 모든 5의 배수를 한 줄에 10개씩 출력해 보세요.
	  (음수를 입력받는 경우에도 올바르게 동작해야 합니다.) 
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		System.out.print("숫자를 입력하세요 >>");
		input = sc.nextInt();
		
	
			for(int i=0, count=1; i<input; ++i) {
				if(i % 5 == 0) {
					System.out.printf("%2d ", i);
					if(count % 10 == 0) {
						System.out.println();
					}
					++count;
				}
			}	
		
			for(int i=0, count =1; i>input; --i) {
				if(i % 5 == 0) {
					System.out.printf("%2d ", i);
					if(count % 10 == 0) {
						System.out.println();
					}
					++count;
				}
			}
	}
}
