package blackjack;

public class Deck {
	Card[] cards; // Card 배열에 있는 cards라는 변수를 만든다 
	
	int cursor = 0; // 다음 단계로 넘어가라
	

	// 아래 Deck 생성자에 있는걸 쓸 필요가 없다. 밑에 여러벌 사용하고 싶은것과 중복
	public Deck() {
		this(1); // this(); 내 클래스의 다른 생성자
				 // Deck(int size)가 1이라는 것과 같다.
	}
	
//	public Deck() {         // 4               13
//		int slen = Card.shapes.length;
//		int rlen = Card.ranks.length;
//		
//		
//		cards = new Card[slen * rlen];
//		
//		for (int shape = 0; shape < slen; ++shape) {
//			for (int rank = 0; rank < rlen; ++rank) {
//				cards[shape * rlen + rank] = new Card(shape, rank); // 0 * 13 = 0이기 때문에 rank의 1을 더해서 1을 만든다.
//			}
//		}
//	}
	// 카드를 여러 벌 사용하고 싶은 경우
	public Deck(int size) {
	
		int slen = Card.shapes.length;
		int rlen = Card.ranks.length;
		
		cards = new Card[slen * rlen * size];
		for (int i = 0; i < size; ++i) {
			int index = i * slen * rlen;
			for (int shape = 0; shape < slen; ++shape) {
				for (int rank = 0; rank < rlen; ++rank) {
					cards[index + shape * rlen + rank] = new Card(shape, rank); // 0 * 13 = 0이기 때문에 rank의 1을 더해서 1을 만든다.
				}
			}
		}
		shuffle();
	}
	// 카드를 섞어주는 기능
	public void shuffle() {
		for (int i = 0; i < cards.length * 2; ++i) {
			int ran = (int)(Math.random() * cards.length);
			Card tmp = cards[0]; // 카드를 임시로 섞기 위해 Card 라는 생성자에 tmp변수를 선언
			cards[0] = cards[ran];
			cards[ran] = tmp;
		}
	}
	
	// 카드를 뽑을 때 cards.length 끝이나면 다시 0으로 초기화 후 섞어준다.
	public Card draw() {
		if (cursor == cards.length) {
			cursor = 0;
			shuffle();
		}
		return cards[cursor++];
	}
}
