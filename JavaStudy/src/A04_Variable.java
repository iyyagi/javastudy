
public class A04_Variable {

	public static void main(String[] args) {
		
		byte age = 10; // byte로도 나이 변수를 지정할 수 있지만 int와 같이 쓸 경우 변환 시간이
					   // 오래걸린다. 기본적으로 int를 붙혀서 사용하는게 좋다.
		
		byte _byte = 127; // byte는 -128 ~ 127 표현 범	위
		char _char = 0; // char는 - 불가 0 ~ 65535 표현 범위
		short _short = -32768; // -32768 ~ 32797 표현 범위 
		int _int = 210000000; // 숫자는 _언더바로 자리수 표현이 가능
		int _int1 = 21_000_000;
		long _long = 210000000L; // int 의 범위를 벗어나는 정수 리터럴 뒤에는 L(대문자)나 l(소문자)를 붙여야 한다.
		
		// 소수 리터럴은 기본적으로 Double 타입이기 때문에
		// float 타입 리터럴 뒤 F 또는 f를 붙여 표시해야 한다.
		
		float _float = 123.123F;
		double _double = 123.333344;
		
		System.out.println(_byte + 1);
		System.out.println("_byte에 들어있는 값 :" + _byte);
		
	}
}
