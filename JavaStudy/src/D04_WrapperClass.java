
public class D04_WrapperClass {
	/*
	  # Wrapper Class
	   - 각 기본형 타입에 대응하는 참조형 타입
	   - 각 타입에 유용한 기능들이 해당 클래스에 정의되어 있다.
	   
	  # 기본형
	   - int, char, byte, short, long, float, double, boolean
	  
	  # 참조형
	   - Integer, Character, Byte, Short, Long, Float, Double, Boolean

	*/
	public static void main(String[] args) {
		
		/*
		  # Parsing
		   - 문자열을 해당 타입으로 변환하는 것
		   - 각 타입 클래스마다 해당 메서드가 있음
		*/
		// 문자열을 숫자 값으로 변환
		int value = Integer.parseInt("12345", 8);
		System.out.printf("%d\n", value);
		
		// 원하는 진법으로 숫자 값을 추출하는 오버로딩
		value = Integer.parseInt("AF1234", 16);
		System.out.printf("%d\n", value);
		
		// 문자열의 원하는 부분을 숫자로 추출하는 오버로딩
		value = Integer.parseInt("Hello!! 12345 Good!", 9, 12, 10);
		System.out.println("이거요"+value);
		
		float fvalue = Float.parseFloat("123.1234");
		System.out.println(fvalue);
		
		boolean boolValue = Boolean.parseBoolean("TruE");
		System.out.println(boolValue);
		
		/*
		  # toString
		   - 각 타입 값을 문자열로 변환하는 기능
		   - 원하는 진법의 문자열로 쉽게 변환할 수 있다.
		*/
		
		String strValue = Integer.toString(12345, 2);
		System.out.println("이거" + strValue);
	
		strValue = Boolean.toString(false);
		System.out.println(strValue);
		
		// 각 타입에 대한 상수들
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Character.MAX_CODE_POINT);
		System.out.println(Character.SIZE);
		
		// Character 타입의 유용한 기능들
		System.out.println("is 유효한 문자?" + Character.isAlphabetic('A'));
		System.out.println("is 유효한 문자?" + Character.isAlphabetic('한'));
		System.out.println("is 유효한 문자?" + Character.isAlphabetic(11234));
		System.out.println("is 유효한 문자?" + Character.isAlphabetic('_'));
		
		// 대소문자
		System.out.println("대문자니?" + Character.isUpperCase('a'));
		System.out.println("소문자니?" + Character.isLowerCase('c'));
		
		// 공백
		System.out.println("해당 문자의 타입" + Character.getType(23));
		System.out.println("공백이니 ?" + Character.isWhitespace(' '));
		System.out.println("공백이니 ?" + Character.isWhitespace('\t'));
		System.out.println("공백이니 ?" + Character.isWhitespace('\n'));
		
		// 숫자 구분
		System.out.println("숫자니?" + Character.isDigit('0'));
		System.out.println("숫자니?" + Character.isDigit('가'));
		
		// 자바의 변수명 첫번째 글자로 사용할 수 있는가?
		System.out.println(Character.isJavaIdentifierStart('#'));
		System.out.println(Character.isJavaIdentifierStart('$'));
		System.out.println(Character.isJavaIdentifierStart('_'));
		System.out.println(Character.isJavaIdentifierStart('7'));
		System.out.println(strValue);
	}
}



