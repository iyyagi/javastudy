package blackjack;

import java.util.Scanner;
import java.util.concurrent.Delayed;

import quiz.B08_CountAlaphabat2;

public class Game {

	// 유저, 딜러 정보를 전달해 주면 gameInfo를 출력
	public static void gameInfo(Card[] user, Card[] dealer) {
		System.out.println("유저에게 두장");
		System.out.println(" - User");
		for (int i = 0; i < user.length && user[i] != null; ++i) {
			Card c = user[i];
			System.out.printf("[%c%s]", Card.shapes[c.shape], Card.ranks[c.rank]);
		}

		System.out.printf("(%d)", BlackJack.getValue(user));
		System.out.println();
		System.out.println();

		System.out.println("딜러에게 두장");
		System.out.println(" - Dealer");
		for (int i = 0; i < dealer.length && dealer[i] != null; ++i) {
			Card c = dealer[i];
			// hidden => true면 출력
			if (!c.hidden) {
				System.out.printf("[%c%s]", Card.shapes[c.shape], Card.ranks[c.rank]);
			} else { 
				System.out.print("[XX]");
			}
		}
		System.out.println();
	}


	public static void main(String[] args) {
		//		Card h1 = new Card();
		//		h1.shape = 1; // 각 배열의 번호로 찾는다. ♥
		//		h1.rank = 0; // 각 배열의 번호로 찾는다. A
		//
		//		// 이렇게 출력하면 주소값이 나오기 때문에 toString을 오버라이드해서 String.format을 설정해준다.
		//		System.out.println(h1);
		//System.out.println(Card.shapes[0]); // static을 붙히면 Card인스턴스가 없이도 만들 수 있다.

		// for (int shape = 0; shape < 4; ++shape) // 기존 방식
		// Card 클래스에 shapes, ranks에 static을 붙히고 사용한 방식 
		//		for (int shape = 0; shape < Card.shapes.length; ++shape) {
		//			for (int rank = 0; rank < Card.ranks.length; ++rank) {
		//				Card c = new Card(shape, rank); // Card에서 생성자 생성 후 만듦.
		////				c.shape = shape; // 0, 1 ...
		////				c.rank = rank; // 0 ~ 13, 0 ~ 13... 이런식으로 반복
		//				System.out.println(c);
		//			}
		//		}

		Deck d = new Deck(1);
		//		System.out.println("카드 개수 : " + d.cards.length);
		//		
		//		for (int i = 0; i < d.cards.length; ++i) {
		//			System.out.println(d.cards[i]);
		//		}
		//		System.out.println("유저 첫번째 카드 : \n" + d.draw());
		//		System.out.println("유저 두번째 카드 : \n" + d.draw());
		//		
		//		System.out.println("딜러 첫번째 카드 : \n" + d.draw());
		//		System.out.println("딜러 두번째 카드 : \n" + d.draw());
		// 유저의 카드가 최대 21개, 딜러의 카드가 최대 21개다.
		// 이유는 여러개의 카드 중 A를 21개 뽑으면 21점이기 때문이다.
		Card[] user = new Card[21];
		Card[] dealer = new Card[21];

		
		user[0] = d.draw();
		user[1] = d.draw();

	
		dealer[0] = d.draw();

		Card c = d.draw();
		c.hide();
		dealer[1] = c;

		Scanner sc = new Scanner(System.in);
		int userIndex = 2;
		int dealerIndex = 2;
		while(true) {
			gameInfo(user, dealer); // 유저, 딜러 정보를 전달해 주면 gameInfo를 출력

			System.out.println("1. hit\t2. stand");
			int hit = sc.nextInt();

			// 1번 선택 시 로직
			if (hit == 1) { // 1번이면
				user[userIndex++] = d.draw(); // user 카드를 한장 더 뽑는다.
				if (BlackJack.getValue(user) > 21) { // 유저 카드가21보다 크면 패배
					System.out.println("플레이어 패배");
					return; // 프로그램 종료
				} else if(BlackJack.getValue(user) == 21) { // 유저 카드가 21점이면
					while(BlackJack.getValue(dealer) < 16) { // 딜러 카드 점수가 16점 미만이면
						dealer[1].open(); // 숨겨놓은 딜러 카드를 오픈하고
 						dealer[dealerIndex++] = d.draw(); // 딜러카드를 뽑느다.
					}
					break;
				}
			} else if (hit == 2) { // 2번이면
				while(BlackJack.getValue(dealer) < 16) { // 딜러카드 점수가 16미만이면
					dealer[1].open(); // 숨겨놓은 딜러카드를 오픈하고
					dealer[dealerIndex++] = d.draw(); // 딜러카드를 뽑는다.
				}
				break;
			} else {
				continue;
			}

			//			if (BlackJack.getValue(user) == BlackJack.getValue(dealer)) {
			//				System.out.println();
			//			}
			//			System.out.println("유저 카드의 가치 : "+ BlackJack.getValue(user));
			//			System.out.println("딜러 카드의 가치 : " + BlackJack.getValue(dealer));
		}

		int userValue = BlackJack.getValue(user);
		int dealerValue = BlackJack.getValue(dealer);
		gameInfo(user, dealer);

		if (dealerValue > 21) {
			System.out.printf("%d(user) vs %d(dealer) 딜러의 버스트로 유저 승!", userValue, dealerValue);
		}else if (userValue == dealerValue) {
			System.out.printf("%d(user) vs %d(dealer)로 비김\n", userValue, dealerValue);
		} else if (userValue > dealerValue) {
			System.out.printf("%d(user) vs %d(dealer)로 유저 승\n", userValue, dealerValue);
		} else {
			System.out.printf("%d(user) vs %d(dealer)로 딜러 승", userValue, dealerValue);
		}
	}
}
