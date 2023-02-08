package yacht;

import java.util.Collections;
import java.util.List;

public class YachtDiceRules {


	// 역의 이름과 점수를 함께 리턴하기 위해 클래스를 사용한다.(DTO) : Data Transfer Object
	public static YachtDiceInfo check(Dice dice) {
		List<Integer> hand = dice.hand;

		for (int i = 1; i <= 6; ++i) {
			int i_count = Collections.frequency(hand, i);
			if (i_count == 5) {
				return YachtDiceInfo.YACHT; // YachtDiceInfo에서 미리 생성한 인스턴스 활용
			} else if (i_count == 4) {
				return YachtDiceInfo.FOUR_OF_A_KIND;
			} else if(i_count == 2 || i_count == 3)  { // i가 2또는 3이면
				for (int j = 1; j <= 6; ++j) { // j = 1 ~ 6까지 돌린다.
					if (j == i) { // j가 i 2또는 3과 같다면 계속 돌린다.
						continue;
					}
					// 6 == 5 - 2 3 
					if (Collections.frequency(hand, j) == (5 - i_count)) {
						return YachtDiceInfo.FULL_HOUSE;
					}
				}
			}
			
			if (i == 1 || i == 2) {
				if (hand.contains(i) && hand.contains(i + 1) && hand.contains(i + 2) && hand.contains(i + 3)
						&& hand.contains(i + 4)) {
					return YachtDiceInfo.LARGE_STRAIGHT;
				}
			}
			
			if (i == 1 || i == 2 || i == 3) { 
				if (hand.contains(i) && hand.contains(i + 1) && hand.contains(i + 2) && hand.contains(i + 3)) {
					return YachtDiceInfo.SMALL_STRAIGHT;
				}
			}
		}
		return YachtDiceInfo.NOTHING;
	}
}
