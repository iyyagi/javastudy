package blackjack2;

public class Card {
	static int[] patterns = {'◆', '♠', '♥', '♣'}; // 문양을 패턴이라 하고 해당 값은 차례대로 0 1 2 3 4라고 칭한다.
	static String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	static int[] values = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
	boolean hidden; // 기본값 false
	
	int pattern;
	int rank;
	
	// 카드를 계산하기 위함.
	public Card(int pattern, int rank) {
		this.pattern = pattern;
		this.rank = rank;
	}
	
	// 카드를 숨길 떄
	public void hide() {
		hidden = true;
	}
	
	// 카드를 오픈할 때
	public void open() {
		hidden = false;
	}
	
	public static int getValue(Card[] card) {
		int value = 0;
		int aCount = 0;
		for (int i = 0; i < card.length && card[i] != null; ++i) {
			value += values[card[i].rank];
			if (card[i].rank == 0) {
				++aCount;
			}
		}
		while (value > 21 && aCount > 0) {
			value -= 10;
			--aCount;
		}
		return value;
	}
	
	@Override
	public String toString() {
		return patterns[pattern] + ranks[rank];
	}
}
