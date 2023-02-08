package quiz;

import java.util.Random;
import java.util.Scanner;

public class B14_Lotto {

	/*
	 0. 우선 배열에 랜덤 숫자 6개를 생성하세요.
	 1. 1 ~ 45의 "중복 없는" 랜덤 숫자 6개를 생성하여 당첨 번호를 만들어 보세요. 
	 2. 당첨될때 까지 랜덤 로또 번호를 생성하여 몇 회만에 당첨되었는지 출력해보세요.
	 (6개중 6개 맞추면 1등)
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] lotto = new int[6];
		Random ran = new Random();
		// 랜덤 번호 생성
		for (int i = 0; i < lotto.length; ++i) {
			lotto[i] = ran.nextInt(45) + 1;
			// 중복 제거 
			for (int j = 0; j < i; ++j) {
				if (lotto[i] == lotto[j]) {
					--i;
					break;
				}
			}
		}
		// for 문이 끝나고 6가지의 숫자 생성.
		System.out.println("로또 당첨 번호");
		for (int i = 0; i < 6; ++i) {
			System.out.print(lotto[i] + " ");
		
		}
		System.out.println();
		// 당첨 번호를 입력 하는 곳.
		int[] lucky = new int[6]; // 랜덤으로 발생한 값을 배열에 넣는다.
		int count = 0;
		String winner = " ";
		for (int i = 0; i < 6; ++i) {
		
			lucky[i] = ran.nextInt(45) + 1;
			if (lotto[i] == lucky[i]) {
				++count;
			}
			if (count == 6) {
				winner = "1등";
			} else if(count == 5) {
				winner = "2등";
			} else if (count == 4) {
				winner = "3등";
			} else if (count < 3){
				winner = "꼴등";
			}
			System.out.print(lucky[i] + " ");
		}
		System.out.println();
		System.out.print("맞춘 횟수>> " + count + " 결과>> " + winner);
		
	}
}
