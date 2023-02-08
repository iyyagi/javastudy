package quiz;

import javax.lang.model.SourceVersion;

public class D04_IsJavaVar {

	/*
	  문자열을 매개변수를 전달하면 해당 문자열이 자바 변수로써 사용할 수 있는지
	  검사해주는 메서드를 만들어 보세요
	 */

	public static boolean isJavaVar(String word) {
		// https://stackoverflow.com/questions/24265110/get-a-list-of-all-java-reserved-keywords
		// word가 SourceVersion에 있는 keyword가 맞으면 걸러주는 로직
		if (SourceVersion.isKeyword(word)) {
			System.out.println("예약어는 변수로 사용할 수 없습니다.");
			return false;
		}

		if(!Character.isJavaIdentifierStart(word.charAt(0))) {
			System.out.printf("[%s]의 첫 번째 글자가 자바 변수에 사용할 수 없는 문자입니다.", word);
			return false;
		}

		for (int i = 1; i < word.length(); ++i) {
			if (!Character.isJavaIdentifierPart(word.charAt(i))) {
				System.out.printf("[%s]의 %d 번째 글자가 자바 변수에 사용할 수 없는 문자입니다.", word, i + 1);
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println(isJavaVar("7evenEleven"));
		System.out.println(isJavaVar("s!enEleven"));
		System.out.println(isJavaVar("se#en"));
		System.out.println(isJavaVar("int"));
		System.out.println(isJavaVar("void"));
		System.out.println(SourceVersion.isIdentifier("123"));
		System.out.println(SourceVersion.isIdentifier("$oen"));
	}
}

