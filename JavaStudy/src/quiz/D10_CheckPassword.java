package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;





public class D10_CheckPassword {
	/*
	  사용자가 사용하고 싶은  비밀번호를 입력하면 사용할 수 있는 비밀번호 인지 체크한 후
	  한번 더 동일하게 입력하도록 만들어보세요.
	 */

	
	private static String passwordRegex = "(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*()_\\-\\=\\+|])[\\da-zA-z!@#$%^&*()_\\-\\=\\+|]{8,12}";
	
	// step4
	public static boolean isValidPassword2(String userPass) {
		return Pattern.matches(passwordRegex, userPass);
	}
	
	// step3
	public static boolean isValidPassword(String userPass) {
		// if  else로 비밀번호 검사를 구현하면 무엇 때문에 안됬는지 자세히 표현이 가능하다.
		int len = userPass.length();
		if (len < 8 || len > 16) {
			System.out.println("비밀번호의 길이가 잘못되었습니다.");
			return false;
		}
		if (!Pattern.matches("[a-zA-z\\d!@#$%]{8,16}", userPass)) {
			System.out.println("사용하면 안되는 문자를 사용하셨습니다."
					+ "(소문자, 대문자, 숫자, 특수문자만 사용 가능");
			return false;
		}
		//String mustHave = "!@#$%";
		List<Character> mustHave = new ArrayList();
		Collections.addAll(mustHave, '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '-', '=', '+', '|');
		boolean digit = false, lower = false, upper = false, special = false;
		for (int i = 0; i < len; ++i) {
			char ch = userPass.charAt(i);
			if (Character.isLowerCase(ch)) {
				lower = true;
			} else if (Character.isUpperCase(ch)) {
				upper = true;
			} else if (Character.isDigit(ch)) {
				digit = true;
			} else if (mustHave.contains(ch)) {
				special = true;
			}
		}
		
		if (!digit) {
			System.out.println("숫자가 포함되지 않았습니다.");
			return false;
		} else if (!upper) {
			System.out.println("대문자가 포함되지 않았습니다.");
			return false;
		} else if (!lower) {
			System.out.println("소문자가 포함되지 않았습니다.");
			return false;
		} else if (!special) {
			System.out.println("특수문자가 포함되지 않았습니다");
			return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		// step1
		Scanner sc = new Scanner(System.in);
		String userPass;
		while (true) {
			
			// step2
			while (true) {
				System.out.print("사용하고 싶은 비밀번호 입력 >>");
				userPass = sc.nextLine();
				if (isValidPassword(userPass)) {
					break;
				}
			}
			
			System.out.println("다시 한번 입력 >> ");
			if (userPass.equals(sc.nextLine())) {
				System.out.println("일치합니다!");
				break;
			} else {
				System.out.println("확인한 비밀번호가 일치하지 않습니다. 처음부터 다시 시작합니다.");
			}
		}
	}
}
