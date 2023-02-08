package quiz;

public class B12_Count369 {
	/*
	  랜덤 양의 정수를 하나 생성하고 
	  해당 숫자까지 369 게임이 진행 되나면 박수를 총 몇번 쳐야 하는지 출력하세요
	*/
	
	public static void main(String[] args) {
		
		int num = (int)(Math.random() * 10000);
		System.out.println("이번에 검사할 숫자 " + num);
		// 1. 문자열을 활용하는 방식
		int clap = 0;
		for (int i = 3; i < num; ++i) {
			// 검사할 숫자를 문자열로 변환
			String check = "" + i;
			System.out.println(check + "검사결과 :");
			// 문자열이 된 숫자를 하나씩 떼서 박수를 쳐야하는지 검사
			for (int j = 0; j < check.length(); ++j) {
				char ch = check.charAt(j);
				System.out.printf("- %d번째 숫자 [%c]\n", j, ch);
				
				// "44839" - > '4', '4', '8', '3', '9'
				if (ch == '3' || ch == '6' || ch == '9') {
					++clap;
					System.out.println("짝");
				} else {
					System.out.println();
				}
			}
		}
		System.out.print("총 박수 : " + clap + "회 입니다.");
	}
}
