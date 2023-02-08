
public class A04_VarTypes {

	/*
	   -- 기본형 (소문자로 시작한다) --
	   # 정수 타입
	    - byte (1byte, 8bit)
	      2^8(256)개의 값을 표현할 수 있다.
	      표현 가능한 정수의 범위는 -128 ~ +127 이다.
	      
	      0000 0000 : 0
	      0000 0001 : 1
	      0000 0010 : 2
	      ...
	      0111 1111 : 127
	      1000 0000 : -128 (첫 번째 비트가 1이면 음수를 나타낸다)
	      1000 0001 : -127 (첫 번째 비트가 1이면 음수를 나타낸다)
	      1000 0010 : -126 (첫 번째 비트가 1이면 음수를 나타낸다)
	      ...
	      1111 1111 : -1 // + 1을 더하면
	    1 0000 0000 : 0 // 이렇게 나타나는데 8비트이기 때문에 다시 0으로 나타낸다.
	      
	    - short (2byte, 16bit)
	      2^16(65536)개의 값을 표현할 수 있다.
	      표현 가능한 정수의 범위는 -(2^15) ~ +(2^15-1) 이다.
	      0000 0000 0000 0000 : 0
	      ....
	      0111 1111 1111 1111 : 32767
	      1000 0000 0000 0000 : -32768
	      ....
	      1111 1111 1111 1111 : -1
	    
	    - char (2byte, 16bit, 양수만)
	      2^16(65536)개의 값을 표현할 수 있다.
	      표현 가능한 정수의 범위는 0 ~ 65535(2^16-1) 이다.
	    
	    - int (4byte, 32bit)
	      2^32(약 43억개)의 값을 표현할 수 있음
	      표현 가능한 정수 범위는 -(2^31) ~ +(2^31-1)
	      0000 0000 0000 0000 0000 0000 0000 0000 0000
	      
	    - long (8byte, 64bit)
	      
	      0000 0000 0000 0000 0000 0000 0000 0000 0000
	      0000 0000 0000 0000 0000 0000 0000 0000 0000
	       
	   # 실수 타입 // 웹개발에서 많이 사용하지 않는다.
	    - float (4byte)
	    - double (8byte)
	   
	   # 참/거짓 타입
	    - boolean
	    
	  -- 참조형 (대문자로 시작한다) --
	  
	   # String
	   	- 문자열을 저장할 수 있는 타입
	   	
	   # 그 외 모든 클래스들
	*/
	
	public static void main(String[] args) {
		
		byte age=10; // byte로도 나이변수를 지정할 수 있지만 int와 같이 쓸 경우 시간이 오래걸린다.
		             // 기본적으로 int를 사용하는게 좋다
		
		byte _byte = 127;
		char _char = 0; // -는 불가 65535까지 가능
		short _short = -32768; // -32768 ~ 32797부터 불가능
		int _int = 2100000000; // 숫자는 _언더바로 자리수 표현이 가능하다 2_100_000_000
		// int의 범위를 벗어나는 정수 리터럴은 뒤에 L(대문자) 또는 l(소문자)을 붙여야 한다.
		long _long = 21000000000L;
			_long = 220000020000l;
		
		// 소수 리터럴은 기본적으로 Double 타입이기 때문에
		// float 타입 리터럴은 뒤에F를 붙여 표시해야 한다.
	    float _float = 123.123F;
	    double _double = 123.123456;
	    
	    // boolean 타입 변수에는 boolean 타입 리터럴인 true, false만 저장할 수 있다.
	    boolean rich = true;
		boolean wearble = false;
		
		System.out.println((byte)_byte+1);
		System.out.println("_byte에 들어있는 값 : " + _byte);
		System.out.println(rich);
		
		String message = "Hello, World";
		System.out.println(message);
		
		// 정수 타입에 문자 저장하기
		// - 다른 정수타입에도 문자를 저장할 수 있지만
		// 문자 리터럴은 char 타입에 저장하는것이 가장 올바르다.
		int ch1 = 'T';
		byte ch2 = '!';
		char ch4 = '가'; // 하나의 문자를 담기에 최적화 변수다.
		char ch5 = '한', ch6= '국';
		char ch7, ch8, ch9;
		ch7 = ' ';
		ch8 = '\n';
		ch9 = '\t';
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch7);
		System.out.println(ch8);
		System.out.println(ch9);
	}
}
