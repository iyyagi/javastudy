package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class C06_PirateGame {
	/*
	  해적 아저씨 게임을 객체 지향적으로 만들어보세요.

	  1. 게임이 시작되면 우선 플레이어가 몇 명인지 정한다.

	  2. 여러 플레이어가 돌아가며 통에 칼을 꼽는다.

	  3. 잘못된 곳에 칼을 꼽은 플레이어가 게임에 패배한다.

	  4. 칼을 찌를 수 있는 홈은 15개가 있고, 그 중 3개가 꽝이 된다.
	     (꽝의 위치는 매 판마다 랜덤으로 설정된다.)

	  5. 사용자가 원한다면 게임 설정을 변경할 수 있어야 한다.
	     (홈의 개수와 꽝의 개수 설정)
	 */
	public static int player;
	static int knife;
	public static int input;
	// gameSize = 홈의 갯수를 넣어두는 사이즈
	public static int homSize = 15;
	public static int min_HomeSize = 1;
	public static int kkwang = 3;
	int[] game;

	public static int[] game() {
		int[] hom = new int[homSize];

		for (int i = 1; i < hom.length; ++i) {
			hom[i] += i;
		}
		return hom;
	}
	public static boolean isWin (int input) {
		int count = 0;
		int[] knife = new int[homSize];

		for (int i = 0; i < homSize; ++i) {
			for (int j = 0; j < kkwang; ++j) {
				knife[i] = (int)(Math.random() * 15);
				if (knife[i] == input) {
					System.out.println("폭탄이 터졌습니다!!");
					break;
				} else if(knife[i] !=input) {
					++count;
					System.out.println("성공입니다.");
					continue;
				}
				if (count == kkwang) {
					System.out.println("승리");
					return true;
				}
				return false;
			}


		}
		return false;
	}

	//		while(true) {
	//			for (int i = 0; i < homSize; ++i) {
	//				knife[i] = (int)(Math.random() * 15);
	//				if (knife[i] == input) {
	//					System.out.println("폭탄이 터졌습니다!!");
	//					break;
	//				} else if (knife[i] != input){
	//					++count;
	//					System.out.println("성공입니다.");
	//					continue;
	//
	//				}
	//			}
	//			if(count == kkwang) {
	//				System.out.println("게임에서 승리!!");
	//				return true;
	//			}
	//			return false;
	//		}



	public C06_PirateGame() {

	}
	// 해적 선장 게임에서 옵션을 변경해주는 메서드
	public C06_PirateGame (int player, int homSize, int kkwang) {
		this.player = player;
		this.homSize = homSize;
		this.kkwang = kkwang;
		this.homSize = homSize;
		
	}



	public void info() {
		System.out.printf("플레이 인원 %d명\n", player);
		System.out.println("게임시작 ------>");
		System.out.printf("기본적으로 %d개의 홈과 %d개의 꽝이 생성되었습니다.", homSize, kkwang);


	}

	public static void main(String[] args) {
		C06_PirateGame admin = new C06_PirateGame();
		int[] num = C06_PirateGame.game();
		Scanner sc = new Scanner(System.in);
		System.out.print("플레이어는 몇명인가요? >>");
		admin.player = sc.nextInt();
		admin.info();
		System.out.println();
		for (int i = 0; i < player; ++i) {
			System.out.printf("%d번째 플레이어...홈중에서 몇번째에 칼을 꽂을까요? >>", i);
			System.out.print(Arrays.toString(game()));
			admin.input = sc.nextInt();
			System.out.print(C06_PirateGame.isWin(input));
		}

	}
}
