package quiz;

import java.util.Arrays;

public class C02_MethodQuiz2 {

	/*
	  1. 사과의 개수와 바구니의 크기를 전달하면 필요한 바구니의 개수를 리턴하는 메서드
	  
	  2. 문자열을 전달하면 해당 문자열을 랜덤으로 뒤섞은 결과를 반환하는 메서드
	  
	  3. 문자열을 전달하면 해당 문자열을 거꾸로 한 문자열을 반환하는 메서드
	  
	  4. 메서드 호출하면 1 ~ 45 사이의 중복없는 숫자 7개로 이루어진 배열을 반환하는 매서드
	 */
	
	// 1. 사과의 개수와 바구니의 크기를 전달하면 필요한 바구니의 개수를 리턴하는 메서드
	public static int howManyBasket(int apple, int size) {
		
		if (apple % size == 0) {
			return apple / size;
		} else {
			return apple / size +1;
		}
	}
	// 2. 문자열을 전달하면 해당 문자열을 랜덤으로 뒤섞은 결과를 반환하는 메서드
//	public static String palidrome (String str) {
//		String mix = "";
//		int len = str.length();
//		int[] index = new int[str.length()];
//		for (int i = 0; i < len; ++i) {
//			index[i] = (int)(Math.random() * len);
//			for (int j = 0; j < i; ++j) {
//				if (index[i] == index[j]) {
//					index[i] = (int)(Math.random() * len);
//					j = -1;
//				}
// 			}
//			mix += str.charAt(index[i]);
//		}
//		return mix;
//	}
	// 2. 문자열을 전달하면 해당 문자열을 랜덤으로 뒤섞은 결과를 반환하는 메서드
	public static String shuffleText(String text) {
		// text를 분해
		char[] arr = text.toCharArray();
		
		// arr[]에 있는 값을 섞는 로직
		for (int i = 0; i < 1000; ++i) {
			int index = (int)(Math.random() * arr.length);
			char tmp = arr[0];
			arr[0] = arr[index];
			arr[index] = tmp;
		}
		// String 타입으로 다시 보낸다.
		return new String(arr);
	}
	//  3. 문자열을 전달하면 해당 문자열을 거꾸로 한 문자열을 반환하는 메서드
//	public static String reverseText (String text) {
//		
//		int len = text.length();
//		for (int i = 0; i < text.length(); ++i) {
//			System.out.print(text.charAt(len -i -1));
//		}
//		return text;
//	}
	public static String reverseText (String text) {
		char [] ori = text.toCharArray();
		char [] reversed = new char[ori.length];
		
		for (int i = 0; i < ori.length; ++i) {
			reversed[reversed.length -1 -i] = ori[i];
		}
		return new String(reversed);
		
	}
	// 4. 메서드 호출하면 1 ~ 45 사이의 중복없는 숫자 7개로 이루어진 배열을 반환하는 매서드
	public static int[] isnum () {
		int[] ran = new int[7];
		for (int i = 0; i < ran.length; ++i) {
			ran[i] = (int)(Math.random() * 45 +1);
			for (int j = 0; j < i; ++j) {
				if (ran[i] == ran[j]) {
					ran[i] = (int)(Math.random() *45 +1);
					j = -1;
				}
			}
		}
		return ran;
	}
	// 랜덤 번호 함수를 만들어서 lotto함수에 사용한다.
	public static int getRandomNumber() {
		return (int)(Math.random() * 45 + 1);
	}
	
	public static int[] getLottoNumber() {
		int[] lotto = new int[7];
		for (int i = 0; i < lotto.length; ++i) {
			lotto[i] = getRandomNumber();
			for (int j = 0; i < j; ++j) {
				if (lotto[i] == lotto[j]) {
					lotto[i] = getRandomNumber();
					j = -1;
				}
			}
		}
		return lotto;
	}
	public static void main(String[] args) {
		int basket = howManyBasket(15, 10);
		System.out.printf("필요한 바구니는 모두 %d개 입니다.\n",basket);
		System.out.println(shuffleText("Korea Team Fighting"));
		System.out.println(reverseText(("안녕하셔요")));
		System.out.println(Arrays.toString(isnum()));
		System.out.println(Arrays.toString(getLottoNumber()));
		
		
	}
}
