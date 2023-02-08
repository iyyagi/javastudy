package quiz;

import java.util.Scanner;

public class B06_ForQuiz2_T {
	/*
	  사용자로부터 숫자를 입력 받으면
	  0부터 해당 숫자사이에 존재하는 모든 5의 배수를 한 줄에 10개씩 출력해 보세요.
	  (음수를 입력받는 경우에도 올바르게 동작해야 합니다.) 
	*/
	// 강사님 풀이
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아무 숫자나 입력");
		int num = sc.nextInt();
		
		System.out.printf("[0부터 %d까지 모든 5의 배수 목록]\n", num);
		if(num>0) {
			for(int i=0, count=1; i<num; i+=5, ++count) {
				System.out.printf("%5d",i);
				if(count % 10 == 0) {
					System.out.println();
				}
			}	
		}else {
			for(int i=0, count=1; i>num; i-=5, ++count) {
				System.out.printf("%5d",i);
				if(count % 10 == 0) {
					System.out.println();
				}
			}
		}
	}
}
