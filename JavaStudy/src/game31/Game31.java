package game31;

import java.util.Scanner;

// 본게임 메서드
public class Game31 {
	static Scanner sc = new Scanner(System.in);

	GameConfig config;
	int gameNum;
	int turn;
	int currentPlayer;

	// 1
	public Game31() {
		config = new GameConfig(31, 4, 3);
	}

	// 2
	public void setConfig(int lastNum, int players, int bound) {
		config.lastNum = lastNum;
		config.players = players;
		config.bound = bound;
	}

	// 3
	// GameConfig 의 설정을 보여줄 수 있는 내용.
	public void viewConfig() {
		System.out.println(config);
	}
	
	// 4
	// 게임이 끝나고 다시 초기화 하는 메서드
	// 해당 클래스에서만 사용할 기능이기 때문에  private를 넣는다.
	private void init() {
		gameNum = 0;
		turn = 0;
		currentPlayer = 1;
	}

	// 5
	public void start() {
		init();

		// 진행
		while (gameNum < config.lastNum) {
			System.out.printf("1 ~ %d 사이의 숫자 (현재: %d) > ", config.bound, gameNum);
			int select = sc.nextInt();

			if (select < 1 || select > config.bound) {
				System.out.println("숫자를 다시 선택해주세요.");
				continue;
			}

			// gameNum += select;
			for (int i = 0; i < select; ++i) {
				System.out.printf("%d! \n", ++gameNum);
				if (gameNum >= config.lastNum) {
					break;
				}
			}


		}
		System.out.println("패배하셨습니다...");

		// 전적 반영
	}

	public static void main(String[] args) {

		Game31 game = new Game31();

		while(true) {
			System.out.println("설정을 변경하시겠습니까? 1. 예, 2. 아니오");
			// 설정 변경에 대한 코드
			switch(sc.nextInt()) {
				case 1: // 1. 예를 선택 시 설정 변경
					int lastNum, players, bound;
					System.out.println("마지막 번호 >");
					lastNum = sc.nextInt();
					System.out.println("플레이어 수 >");
					players = sc.nextInt();
					System.out.println("선택 숫자 범위 >");
					bound = sc.nextInt();
					game.setConfig(lastNum, players, bound);
					break;
			default: // 2. 아니오 선택 시 public game31에 있는 기본 설정
				System.out.println("변경 없이 기본 설정으로 진행합니다.");
				break;
			}
			// GameConfig 클래스에 toString을 오버라이드 해서 사용함
			// System.out.println(config);로 해야하나 config의 값을 바꿀 수 있기 때문에 메서드를 만들어서 출력했다.
			// ↓
			// game.viewConfig();	
			game.start();
		}
	}
}
