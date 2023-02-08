package blackjack;

public class Card {
	
	// 모양 : ♠ ♥ ♣ ◆
	// 숫자 : A 2 3 4 5 6 7 8 9 10 J Q K
	static char[] shapes = {'♠', '♥', '♣', '◆'}; // ♠ = 0, ♥ = 1, ♣ = 2, ◆ = 3 이라고 치자.
	static String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"}; // 0 = A, 1 2 3...이라고 치자
	
	boolean hidden; // 카드를 숨길 때 사용
	
	int shape;	// shape = 0 -> ♠로 한다.
	int rank; // rank = 0 -> "A"로 한다.
	
	// 1. 해당 shape 및 ranks 에 대한 값[0] ~ ...
	public Card(int shape, int rank) {
		this.shape = shape;
		this.rank = rank;
	}
	
	// 2. 카드를 숨기는 인스턴스 메서드
	public void hide() {
		hidden = true;
	}
	
	// 3. 카드를 오픈하는 인스턴스 메서드
	public void open() {
		hidden = false;
	}
	
	// 4.
	@Override // toString을 활용하여 shape와 ranks의 있는 값을 출력한다.
	public String toString() {
//		if (hidden) {
//			return "┌───┐\n" + "│   │\n" + "└───┘";
//		} else {
//			return String.format("┌───┐\n" +
//					 "│%c%s │\n" +
//		             "└───┘", shapes[shape], ranks[rank]);
//		}
		
		return String.format("%c%s", shapes[shape], ranks[rank]);
	}
	
	
}
