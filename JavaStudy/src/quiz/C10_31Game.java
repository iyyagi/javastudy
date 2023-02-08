package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class C10_31Game {

	/*
	  # 31 게임을 만들어보세요.

	  1. 인원은 최소 2명 이상이여야 한다.

	  2. 여러 플레이어가 번갈아 가면서 숫자를 선택 한다.
	     (1, 2, 3)

	  3. 31을 말하는 사람이 패배한다.
	 */


	public void player() {
		
		
	}

	public void start() {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int game = 31;
		System.out.print("인원수를 입력하세요.");
		int player = 0;
		player = sc.nextInt();
		while(true) {
			if (player <= 1) {
				System.out.println("인원수를 다시 입력하세요.");
				player = sc.nextInt();
				continue;
			} else {
				System.out.printf("선택한 인원수는 %d명 입니다. 게임을 시작합니다.\n", player);
				break;
			}
		}	
		while(true) {
			System.out.printf("%d님의 차례입니다.\n", player);
			System.out.println("1 ~ 3까지의 숫자를 입력하세요.");
			choice = sc.nextInt();
			if (choice > 4) {
				System.out.println("숫자를 잘못 입력하셨습니다. 다시 입력하세요.");
				choice = sc.nextInt();
				continue;
			} else {
				System.out.printf("숫자 %d 입력하셨습니다.", choice);
			}

			if (choice == 3) {
				game -= 3;
				System.out.println("남은 숫자는" + game);

			} else if (choice == 2) {
				game -= 2;
				System.out.println("남은 숫자는" + game);

			} else if (choice == 1) {
				game -= 1;
				System.out.println("남은 숫자는" + game);

			}
			if (game == 1) {
				System.out.println("패배하셨습니다.");
				break;
			}
		}
	}

	public void view() {

		System.out.println("31개의 숫자가 생성되었습니다.");
	
	}
	public void info() {
		System.out.println("이번 게임은 베스킨라빈스 31 입니다.");
		System.out.println("인원은 최소 2명이상이 필요합니다.");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		C10_31Game games = new C10_31Game();

		games.player();
		games.view();
		games.start();
	}
}

