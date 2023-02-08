import java.util.Arrays;

import blackjack.Card;
import myobj.Apple;

public class C16_Null {

	static int ab;
	static boolean abc;
	static Apple apple;
	static Card[] cards = new Card[52];
	
	public static void main(String[] args) {
		
		// 기본형 타입 초기화 - 0, false
		int a = 0;
		System.out.println(a);
		System.out.println(ab);
		System.out.println(abc);
		
		// 참조형 타입 초기화 - null // 내가 만든 모든 클래스는 참조형 타입 String, Scanner 등..
		String str = null;
		System.out.println(str);
		
		System.out.println(apple);
		System.out.println(Arrays.toString(cards));
		
		cards[0] = new Card(0, 0);
		cards[1] = new Card(0, 1);
		cards[2] = new Card(0, 2);
		for (int i = 0; i < cards.length && cards[i] !=null; ++i) {
			cards[i].hide();
			System.out.println(cards[i]);
		}
		
	}
}
