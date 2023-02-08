package blackjack2;

import java.util.Scanner;

public class Game {

	public static void gameInfo(Card[] user, Card[] dealer) {
		System.out.println("유저에게 두장을 지급합니다.");
		System.out.println("====User====");
		for (int i = 0; i < user.length && user[i] != null; ++i) {
			Card c = user[i];
			System.out.printf("[%c%s]", Card.patterns[c.pattern],
					Card.ranks[c.rank]);
		}
		System.out.printf("(%d)", Card.getValue(user));
		System.out.println();
		System.out.println();
		System.out.println("딜러에게 두장을 지급합니다.");
		System.out.println("====Dealer====");
		for (int i = 0; i < dealer.length && dealer[i] != null; ++i) {
			Card c = dealer[i];
			if (!c.hidden) {
				System.out.printf("[%c%s]", Card.patterns[c.pattern], 
						Card.ranks[c.rank]);
			} else {
				System.out.print("[XX]");
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Deck d = new Deck();
		Card[] user = new Card[5];
		Card[] dealer = new Card[5];
		
		user[0] = d.draw();
		user[1] = d.draw();
		
		dealer[0] = d.draw();
		Card c = d.draw();
		c.hide();
		dealer[1] = c;
		Scanner sc = new Scanner(System.in);
		int userIndex = 2;
		int dealerIndex = 2;
		while (true) {
			gameInfo(user, dealer);
			System.out.println("1.hit\t 2. stand");
			int hit = sc.nextInt();
			if (hit == 1) {
				user[userIndex++] = d.draw();
				if (Card.getValue(user) > 21) {
					System.out.println("패배");
					return;
				} else if(Card.getValue(user) == 21) {
					dealer[1].open();
					while (Card.getValue(dealer) < 16) {
						dealer[dealerIndex++] = d.draw();
					}
					break;
				}
			} else if (hit == 2) {
				dealer[1].open();
				while (Card.getValue(dealer) < 16) {
					dealer[dealerIndex++] = d.draw();
				}
				break;
			} else {
				continue;
			}
		}
		int userValue = Card.getValue(user);
		int dealerValue = Card.getValue(dealer);
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
