package yacht;

import java.util.ArrayList;
import java.util.Collections;

public class Dice {

	private final static boolean DEBUG = true; // 디버그라는 변수를 만들어서 roll메서드에 출력 여부를 결정한다.
	
	ArrayList<Integer> hand = new ArrayList<>(5); // 5개만 쓸거면 지정하는것이 좋음

	public Dice() {
		Collections.addAll(hand, 6, 6, 6, 6, 6);
		roll();
	}

	// 5개 다 던지기
	public void roll() {
		int size = hand.size();
		for (int i = 0; i < size; ++i) {
			roll(i);
		}
	}

	// 하나 정해서 던지기
	public void roll(int index) {
		if (DEBUG) {
			System.out.printf("hand[%d]번째 주사위 다시 던짐!\n", index);
		}
		hand.set(index, (int)(Math.random() * 6 + 1));
	}

	// "13" => 1, 3 다시 던지기, "123" -> 1, 2, 3번 다시 던지기
	public void roll(String indexs) {
		for (int i = 0; i < indexs.length(); ++i) {
			roll(indexs.charAt(i) - '0' - 1); // '0'을 빼는 이유는 만약 1이 들어오면 47이라 48을 빼주는것, 인덱스라 -1까지 해줘야 0부터 시작
		}
	}

	@Override
	public String toString() {

		return hand.toString();
	}
}
