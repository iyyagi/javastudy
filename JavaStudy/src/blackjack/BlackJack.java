package blackjack;

public class BlackJack {

	static int[] values = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
	// 1. 카드 배열을 전달 받으면 총합을 구하는 메서드
	public static int getValue(Card[] card) {
		int value = 0;
		int aCount = 0; // A가 나오는 개수를 위한 변수
		
		for (int i = 0; i < card.length && card[i] != null; ++i) {
			//System.out.println(card[i]);
			value += values[card[i].rank];
			
			// 나중에 21이 넘는 경우 A개수만큼 10을 빼기 위해 A의 개수를 count한다.
			// rank 0에는 A가 들어있다.
			if (card[i].rank == 0) {
				++aCount;
			}
		}
		// A의 개수가 0보다 크고 값이 21보다 크면 A(11)를 1로 만들어 주는 로직
		// 카드 가치 합이 21이 넘고, A를 보유하고 있다면 가치를 10 감소.
		while(value > 21 && aCount > 0) {
			value -= 10;
			--aCount;
		}
		
		return value;
	}
}
