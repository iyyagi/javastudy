package blackjack2;

public class Deck {
	Card[] cards;
	int turn;
	
	public Deck() {
		int slen = Card.patterns.length;
		int rlen = Card.ranks.length;
		cards = new Card[slen * rlen];
		
		for (int i = 0; i < cards.length; ++i) {
			for (int shape = 0; shape < slen; ++shape) {
				for (int rank = 0; rank < rlen; ++rank) {
					cards[shape * rlen + rank] = new Card(shape, rank);
				}
			}
		}
		shuffle();
	}
	public void shuffle() {
		for (int i = 0; i < cards.length * 2; ++i) {
			int ran = (int)(Math.random() * cards.length);
			Card tmp = cards[0];
			cards[0] = cards[ran];
			cards[ran] = tmp;
		}
	}
	
	public Card draw() {
		if (turn == cards.length) {
			turn = 0;
			shuffle();
		}
		return cards[turn++];
	}
	
	
}
