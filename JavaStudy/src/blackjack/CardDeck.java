package blackjack;

import java.util.Arrays;

public class CardDeck {

	public static int NUM_OF_PATTERN = 4;
	public static int NUM_OF_NUMBER = 13;
	public static int CARD_SIZE = NUM_OF_PATTERN * NUM_OF_NUMBER;
	

	Card[] deck;
	
	
	// 카드를 생성한다.
	public CardDeck() {
		deck = new Card[CARD_SIZE];
		for (int i = 0; i < NUM_OF_PATTERN; ++i) {
			for (int j = 0; j < NUM_OF_NUMBER; ++j) {
				deck[i * NUM_OF_NUMBER + j] = new Card(i,j);
			}
		}
		CardShuffle();
	}
	
	// 카드를 섞는다.
	public void CardShuffle() {
		for (int i = 0; i < 500; ++i) {
			int i1 = (int)(Math.random() * NUM_OF_PATTERN);
			int i2 = (int)(Math.random() * NUM_OF_NUMBER);
			Card tmp = deck[i1];
			deck[i1] = deck[i2];
			deck[i2] = tmp;
		}
	}
	

	public static void main(String[] args) {
		
	CardDeck a = new CardDeck();
	System.out.print(a);
		
	}
}
