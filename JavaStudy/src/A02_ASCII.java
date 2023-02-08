
public class A02_ASCII {
	
	/*
	  # ASCII 코드
	  - 문자는 실제로 각 문자에 대응하는 번호를 지니고 있다.
	    Ex) 'A'는 65번 문자,'B'는 66번 문자  
	  - 0 ~ 127번 까지의 문자들을 ASCII 코드라고 한다.
	
	*/
	public static void main(String[] args) {
		
		/*
		  모든 데이터는 실제로 0과 1로 변환되어 저장된다.
		  문자는 바로 0과 1로 변환할 수 없기 때문에 문자에 해당하는 코드값이 존재한다.
		  
		  * 문자를 숫자화 하는 것 (인코딩, encoding)
		  
		  A -> 65(ASCII) ---- 0100 0001(컴퓨터에 저장)
		  ! -> 33(ASCII) ---- 0010 0001
		  
		  * 코드를 해석 하는 것 (디코딩, decoding)
		    0100 0001 ----> 65 ----> A
		    0010 0001 ----> 33 ----> !
		*/
		
		// 문자 '0'과 숫자 0은 다르다
		System.out.println('0'); // 문자 0 - 실제로는 48이라는 코드값을 가지고 있음
		System.out.println(0); // 숫자 0 - 실제로도 0
		
		// 문자 타입 리터럴의 실제 값(코드 값)을 보고 싶다면 앞에 (int)를 붙힌다.
		System.out.println((int)' ');
		System.out.println((int)'!');
		System.out.println((int)'?');
		System.out.println((int)'A');
		System.out.println((int)'한');
		System.out.println((int)'가');
		
		// 숫자 타입 리터럴의 문자 형태를 보고 싶다면 앞에 char를 붙히면 된다.
		System.out.println((char)33);
		System.out.println((char)90);
		System.out.println((char)48);
		System.out.println((char)50);
		System.out.println((char)32000);
		
		// 문자 타입 리터럴도 실제로는 숫자값을 갖고 있기 때문에 계산이 가능하다.
		System.out.println('A'+5);
		
		// 해당하는 문자의 다음 문자를 찾아낼 수 있다.
		System.out.println((char)('A'+1));
		System.out.println((char)('A'+5));
		
		System.out.println((char)('가'+1));
		System.out.println((char)('가'+2));
		System.out.println((char)('나'+1));
		
		// 문자끼리 계산해서 거리 재기
		System.out.println('z'-'a'); // A는 Z로 부터 몇 번째 문자인가?
		System.out.println('k'-'a'); // a는 k로 부터 몇 번째 문자인가?
		System.out.println('a'-'A'); // 대문자를 소문자를 변환하기 위한 거리
		
		// 대문자와 소문자의 거리를 이용해 대소문자 변환을 할 수 있다.
		System.out.println((char)('Y' + 32)); // 대문자 Y를 소문자로 변환
		System.out.println((char)('Y' + ('a'-'A'))); // 대문자 Y를 소문자로 변환
		
		
		// 같은 값이 들어있더라도 char 타입은 기본적으로 문자로 활용하고
		// 그 외의 정수타입은 숫자로 활용한다.
		char c1=65;
		int c2=65;
		
		System.out.println("c1: "+ c1 + ", c2:"+c2);
		
	}
}
