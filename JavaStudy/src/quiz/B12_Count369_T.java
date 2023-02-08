package quiz;

public class B12_Count369_T {
	/*
	  랜덤 양의 정수를 하나 생성하고 
	  해당 숫자까지 369 게임이 진행 되나면 박수를 총 몇번 쳐야 하는지 출력하세요
	*/
	public static void main(String[] args) {
		int num = (int)(Math.random() * 1000);
		int clap = 0;
		
		for(int i = 3; i <= num; ++i) {
			
			int check = i;
			System.out.println("이번에 검사할 숫자 : " + check);
			
			// 십진수는 % 10으로 한 자리씩 나눌 수 있다.
			while (check > 0) {
				System.out.printf("-%d : ", check % 10);
				int digit = check % 10;
				if (digit != 0 && digit % 3 == 0) {
					System.out.println("짝");
					++clap;
				} else {
					System.out.println();
				}
				check /= 10;
			}
			
			
		}
		
		System.out.print("총 박수 : " + clap + "회 입니다.");
	}
}
