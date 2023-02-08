package myobj;

import java.util.Arrays;

public class Lotto1 {

	static int MAX_NUM = 45;
	static int MIN_NUM = 1;
	static int NUM_OF_LOTTO = 5;
	static int LOTTO_LENGTH = 6;
	static int WIN_LENGTH = 7;
	
	int[][] nums;
	
	
	public static boolean isWin(int[] winNum, Lotto1 lotto) {
		
		for (int i = 0; i < NUM_OF_LOTTO; ++i) {
			int cnt = 0;
			for (int j = 0; j < LOTTO_LENGTH; ++j) {
				for (int k = 0; k < WIN_LENGTH; ++k ) {
					if (lotto.nums[i][j] == winNum[k]) {
						++cnt;
						break;
					}
				}
			}
			if (cnt >= 6) {
				return true;
			}
		}
	
		return false;
	}
	public Lotto1() {
		nums = new int[NUM_OF_LOTTO][LOTTO_LENGTH];
		for (int i = 0; i < NUM_OF_LOTTO; ++i) {
			nums[i] = auto();
		}
	}
	
	public Lotto1(int[][] nums) {
		this.nums = nums;
	}
	
	public static int[] auto() {
		int[] lotto = new int[LOTTO_LENGTH];
		for (int i = 0; i < LOTTO_LENGTH; ++i) {
			lotto[i] = (int)(Math.random() * MAX_NUM + MIN_NUM);
			for (int j = 0; j < i; ++j) {
				if (lotto[i] == lotto[j]) {
					lotto[i] = (int)(Math.random() * MAX_NUM + MIN_NUM);
					--i;
					break;
				}
			}
			
		}
		return lotto;
	}
	
	public static int[] getWinNum() {
		int[] win = new int[WIN_LENGTH];
		
		for (int i = 0; i < WIN_LENGTH; ++i) {
			win[i] = (int)(Math.random() * MAX_NUM + MIN_NUM);
			for (int j = 0; j < i; ++j) {
				if (win[i] == win[j]) {
					win[i] = (int)(Math.random() * MAX_NUM + MIN_NUM);
					--i;
					break;
				}
			}
		}
		return win;
 	}
	public void view() {
		for (int i = 0; i < NUM_OF_LOTTO; ++i) {
			System.out.println(Arrays.toString(nums[i]));
		}
	}
	
	public static void main(String[] args) {
		int[] winNum = Lotto1.getWinNum();
		int cnt = 0;
		
		while(true) {
			Lotto1 lotto = new Lotto1();
			++cnt;
			if (Lotto1.isWin(winNum, lotto)) {
				System.out.println("당첨 용지가 나왔습니다...");
				lotto.view();
				System.out.println("--------------------");
				System.out.println("당첨번호 : " + Arrays.toString(winNum));
				break;
			}
		}
		System.out.printf("당첨용지는 %d번 만에 나왔네!!", cnt);
	}
	
}
