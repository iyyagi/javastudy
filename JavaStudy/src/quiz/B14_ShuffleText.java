package quiz;

import java.util.Random;
import java.util.Scanner;

public class B14_ShuffleText {

	/*
	  사용자로부터 문장을 입력 받으면
	  해당 문장을 랜덤으로 뒤섞어 출력하는 프로그램을 만들어 보세요.

	*/
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("문장을 입력하세요. ");
		String word = " ";
		word = sc.nextLine();
		
		// word에 입력된 값을 arrayWord에 char로넣는다.
		char[] arrayWord = word.toCharArray();
		int[] mix = new int[word.length()];
		
	
		// char형태로 된 mix에 arrayWord를 넣고 섞어서 출력한다.
		for (int i = 0; i < arrayWord.length; ++i) {
			
			mix[i] = ran.nextInt(word.length());
			for (int j = 0; j < i; ++j) {
				if (mix[i] == mix[j]) {
					mix[i] = ran.nextInt(word.length());
					j = -1;
				}
			}
			System.out.print(arrayWord[mix[i]]);
		}
	}
}
