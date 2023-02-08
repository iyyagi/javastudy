import java.awt.Font;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D11_RegexLookahead {

	/*
	  # 정규표현식 Lookahead
	  
	  	- 특정 정규표현식 앞에 있는 패턴을 잡아낼 수 있는 방식
	  	- 잘 응용하면 반드시 포함시키는 위치를 만들어낼 수 있다.
	  	
	  	apple(?=regex)  : regex 앞에 있는 apple을 찾아라 
	  	apple(?!=regex) : regex 앞에 오지않는 apple을 찾아라
	  	apple(?<=regex) : regex 뒤에 오는 apple을 찾아라
	  	apple(?<!regex) : regex 뒤에 오지 않는 apple을 찾아라
	 
	*/
	public static void main(String[] args) {
		 
		// step1
		String text = "apple@ @apple apple@ @apple apple@ @apple";
		Pattern frontApple = Pattern.compile("apple(?!@)");
		//Pattern frontApple = Pattern.compile("apple@");
		Matcher frontMatcher = frontApple.matcher(text);
		
		while (frontMatcher.find()) {
			System.out.println(frontMatcher.group());
			System.out.println(frontMatcher.start());
			System.out.println(frontMatcher.end());
		}
		
		// step2
		String text2 = "apple";
		String frontRegex2 ="app(?=l)e"; // 안됨
		String frontRegex2_1 ="app(?=l)le"; // 됨
		System.out.println(Pattern.matches(frontRegex2, text2)); // false
		
		// step3
		String text3 = "Hello, abcd1234!!! 3 4 5 6 78910 12 123 1234 13333";
		String fronRegex3 = "(?=\\d)[1-3]{2,}"; // 숫자앞에 아무것도 없으니 .은 나(숫자)다
		
		Pattern pattern3 = Pattern.compile(fronRegex3);
		Matcher matcher3 = pattern3.matcher(text3);
		
		System.out.println("===========test3==============");
		while (matcher3.find()) {
			System.out.println("found : " + matcher3.group());
			System.out.println("start : " + matcher3.start());
			System.out.println("end : " + matcher3.end());
		}
		
		// step4
		String text4 = "a12";
		String frontRegex4 = "(?=a\\d)[a1-4]{3,}"; // 글자를 소모하지 않아 맨 앞부터 검사하므로 true;
		String frontRegex4_1 = "a(?=\\d)[1-4]{3,}"; // a뒤부터 3글자여야 하므로 false;
		System.out.println(Pattern.matches(frontRegex4, text4));
		System.out.println(Pattern.matches(frontRegex4_1, text4));
		Pattern pattern4 = Pattern.compile(frontRegex4);
		Matcher matcher4 = pattern4.matcher(text4);
		
		// step5
		String text5 = "AaAA4@4한글";
		// .*<모든 문자 앞에 없으면 맨앞으로 되감기하고 숫자를 찾고 .*<모든 문자 앞에 없으면 맨앞에 A-Z까지 찾고...
		String frontRegex5 = "(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%])[\\da-zA-z!@#$%]{6,}";
		System.out.println("#### text5 ####");
		System.out.println(Pattern.matches(frontRegex5, text5));
	
	}
}
