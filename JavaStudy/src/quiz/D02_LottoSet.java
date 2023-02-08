package quiz;

import java.util.HashSet;

public class D02_LottoSet {

	/*
	 HashSet을 이용해 1~45 사이의 중복없는 7개의 랜덤 숫자를 생성해보세요. 

	 */
	public static void main(String[] args) {
		
		HashSet<Integer> lotto = new HashSet<>();
		
//		for (;lotto.size() < 7;) {
//			lotto.add((int)(Math.random() * 45 + 1));
//		}
		
		while (lotto.size() != 7) {
			lotto.add((int)(Math.random() * 45 + 1));
		}
		
		System.out.println("로또 번호 : "  + lotto);
		
		

	}
}
