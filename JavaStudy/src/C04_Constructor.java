import myobj.Apple;
import myobj.Banana;

public class C04_Constructor {
	/*
	  # 클래스의 생성자(Constructor)
	  
	  - 새로운 인스턴스를 생성할 때 new와 함께 호출하는 것
	  - 클래스 이름과 동일한 이름을 가진 메서드
	  - 생성자를 정의하지 않은 클래스는 아무것도 없는 기본 생성자를 자동으로 생성해준다.
	  - 생성자는 새로운 인스턴스 생성시 가장 먼저 호출할 수 밖에 없는 메서드이기 때문에
	  	주로 해당 인스턴스의 초기화에 많이 사용된다.
	*/
	
	public static void main(String[] args) {
		// 기본적으로 값을 넣어줘야 info 출력 시 값이 나타난다.
		
//		a.grade = 10;
//		a.size = 123;
//		a.color = "빨간색";
		Apple a = new Apple();
		Apple a2 = new Apple(9, 8, "red");
		Apple a3 = new Apple(77, 5);
		a.info();
		System.out.println("========================");
		a2.info();
		System.out.println("========================");
		a3.info();
		
		// 기본 생성자의 사용을 막아놓은 클래스
		// - 이상한 바나나의 생성을 막는다(개수만 있거나 색깔만 있는 것을 방지)
		Banana b1 = new Banana(8, "푸르딩딩");
		
	}
}
