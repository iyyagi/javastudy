package quiz;

import java.util.Scanner;

public class B08_CountAlphabat01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 예외1 > 소수와 정수를 연산 가능
//		System.out.println(123 < 123.456);
		
		// 예외2 > 문자열은 모든 타입과 +가 가능(이어붙이기)
//		System.out.println("나이 :" + 123.1234);
		
		// 예외3 > 문자 타입은 정수로 인식되어 다른 숫자들과 연산 가능
//		System.out.println('A' + 3.123);
		
		String txt = "";
		System.out.print("문자를 입력하셔요 >>");
		txt = sc.nextLine();
		
		
		
		int count = 0;
		// 0번부터 문자열의 길이만큼 반복하며 문자를 하나씩 거낸다.
		for (int i = 0; i < txt.length(); ++i) {
			// 꺼낸 문자가 'e'인지 비교한다.
			if(txt.charAt(i) == 'e' || txt.charAt(i) == 'E') {
				System.out.printf("%d번째에서 e가 등장했습니다.\n", i);
				++count;
			}
			
		}
		System.out.printf("총 %d회 등장했습니다.",count);

	}
}
