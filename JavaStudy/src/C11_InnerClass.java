
public class C11_InnerClass {
	/*
	  클래스 내부에도 클래스를 만들 수 있다.
	  - 인스턴스 클래스
	  - 스태틱 클래스
	  innerClass라는게 있다 라는 정도로 알아가기
	*/
	
	// 스태틱 클래스 = 각 인스턴스마다 다를 수 있는 설계도
	static class Banana {
		
		@Override
		public String toString() {
			return "내부 바나나 입니다."; //+name 인스턴스 변수는 사용 불가
		}
		
	}
	
	
	// 인스턴스 클래스 - 각 인스턴스마다 다를 수 있는 설계도
	class Apple {
		int price;
		
		// 바깥 인스턴스의 상황에 따라 달라질 수 있는 클래스를 만들 수 있다
		@Override
		public String toString() {
			return "내부 사과입니다.." + name;
		}
	}
	
	// 인스턴스 변수 - 각 인스턴스마다 다를 수 있는 변수
	int name;
	String age;

	// 인스턴스 메서드 - 각 인스턴스마다 다르게 동작할 수 있는 메서드
	boolean check() {
		return name > 10;
	}
	
	public static void main(String[] args) {
		// 인스턴스 변수라서 사용이 불가능 하다.
//		name = 10;
//		age = "안녕";
		// 내부 클래스는 바깥 클래스의 인스턴스가 먼저 생성된 후에 사용할 수 있다.
		C11_InnerClass instance = new C11_InnerClass();
		
		instance.name = 125;
		
		// 해당 인스턴스 내부의 클래스로 만든 인스턴스
		C11_InnerClass.Apple innerApple = instance.new Apple();
		
		instance.name = 13333;
		C11_InnerClass.Apple innerApple2 = instance.new Apple();
		
		C11_InnerClass.Apple innerApple3 = instance.new Apple();
		
		System.out.println(innerApple);
		System.out.println(innerApple2);
		System.out.println(innerApple3);
		// 인스턴스 클래스의 인스턴스 생성하기
		System.out.println(new C11_InnerClass().new Apple());
		
		// 스태틱 클래스의 인스턴스 생성하기
		System.out.println(new C11_InnerClass.Banana());
		
		// 스태틱 클래스의 인스턴스 생성하기 nested둥지를 트다
		C11_InnerClass.Banana nestedBanana = new C11_InnerClass.Banana();
		System.out.println(nestedBanana);
		System.out.println(innerApple3);
		
	}
}
