package quiz;

import java.util.Arrays;

public class B14_lotto_T {
	/*
	 0. 우선 배열에 랜덤 숫자 6개를 생성하세요.
	 1. 1 ~ 45의 "중복 없는" 랜덤 숫자 6개를 생성하여 당첨 번호를 만들어 보세요. 
	 2. 당첨될때 까지 랜덤 로또 번호를 생성하여 몇 회만에 당첨되었는지 출력해보세요.
	 (6개중 6개 맞추면 1등)
	 */
	public static void main(String[] args) {
		// 아래 처럼 배열에 직접 값을 넣어도 된다.
//		int[] num = {
//				(int)(Math.random()*45+1), (int)(Math.random()*45+1),
//				(int)(Math.random()*45+1), (int)(Math.random()*45+1),
//				(int)(Math.random()*45+1), (int)(Math.random()*45+1)};
		
		// lotto라는 배열을 생성
		int [] lotto = new int[6]; // 0 ~ 5
		for (int i = 0; i < lotto.length; ++i) {
			// i번째 랜덤 숫자를 뽑음
			lotto[i] = (int)(Math.random() *45 +1);
			System.out.println("방금 뽑은 숫자 : [" + lotto[i] + "]");
			// 이전의 숫자들과 비교해서 뽑았던 숫자가 있다면 다시 뽑아야한다.
			for (int j = 0; j < i; ++j) {
				System.out.printf("이전 숫자 %d: %d\n", j , lotto[j]);
				if (lotto[i] == lotto[j]) {
					lotto[i] = (int)(Math.random() * 45 + 1);
					j = -1;
					System.out.println("다시 뽑은 숫자 : [" + lotto[i] + "]");
					System.out.println("중복이 발생하여 다시 뽑고 처음부터 검사합니다.");
				}
			}
		}
		
		// 출력
		System.out.println("당첨번호: ");
		for (int i = 0; i < lotto.length; ++i) {
			System.out.printf("%-2d ", lotto[i]);
		}
		System.out.println();
		
		// 당첨될 때 까지 출력하는 로또
		int buyCount = 0;
		while (true) {
			int[] myLotto = new int[6];
			
			for (int i = 0; i < myLotto.length; ++i) {
				myLotto[i] = (int)(Math.random() * 45 +1);
				for (int j = 0; j < i; ++j) {
					if (myLotto[i] == myLotto[j]) {
						myLotto[i] = (int)(Math.random() * 45 + 1);
						j = -1;
					}
				}
			}
			++buyCount;
			// lotto[]와 myLotto[]가 같은지 비교를 해야 한다.
			// 당첨 번호 6개가 myLotto[]에 포함되어 있는지 검사해야 한다.
			int winCount = 0;
			for (int i = 0; i < lotto.length; ++i) {	
				for (int j = 0; j < lotto.length; ++j) {
					if (lotto[i] == myLotto[j]) {
						++winCount;
						break;
					}
				}
			}
			if (winCount == 6) {
				System.out.println(buyCount + "만에 1등 당첨");
				break;
			} else if (winCount == 5) {
				System.out.println("2등 ! 아쉽네여");
				 // Arrays.toString() : 배열을 문자열로 변환
				System.out.println(Arrays.toString(myLotto));
			} 
		}
	}
}

