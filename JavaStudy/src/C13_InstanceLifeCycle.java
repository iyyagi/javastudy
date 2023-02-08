
public class C13_InstanceLifeCycle {

	/* 
	  # 인스턴스 생명주기
	  1. 해당 클래스 첫 실행시 스태틱 관련 자원들 메모리 할당
	  2. 인스턴스 관련 자원들 메모리 할당
	  3. 생성자 실행

	 */
	static class TestClass{
		static String b = "abc";
		int a = 10;

		// 스태틱 블록
		static {
			System.out.println("스태틱 블록이 실행되었습니다" + b);
		}



		// 인스턴스 블록
		{
			System.out.println("인스턴스 블록이 생성되었습니다. " + a);
		}


		public TestClass() {
			System.out.println("생성자가 생성되었습니다.");
		}


		void doSomthing() {
			System.out.println("Hello world");
		}
	}

	public static void main(String[] args) {
		// 스태틱 블록은 첫 인스턴스 생성시에만 실행된다.
		TestClass instance = new TestClass();
		TestClass instance2 = new TestClass();
		
		for (int i = 0; i < 5; ++i) {
			new TestClass();
		}
		
	}

}
