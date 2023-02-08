import myobj.Banana;
import myobj3.Running;
import myobj3.Shark;
import myobj3.Swimming;
import myobj3.Turttle;

public class C15_Interface {

	/*
	 # 인터페이스(Interface)
	 
	 - 여러개 상속 받을 수 있는 추상 클래스
	 - 인터페이스 내부에는 구현이 불가능하다.
	 - 인터페이스 내부에 선언하는 메서드는 모두 자동으로 abstract public이 된다.
	 - 인터페이스 내부에 선언하는 모든 변수들은 final static이 된다.
	 - 자바는 클래스 상속을 여러개 받을 수 없기 때문에 한 클래스가 
	   더욱 다양한 형태를 지니기 위해서는 인터페이스를 사용해야 한다.
	 
	 # 인터페이스의 특징
	 - 인스턴스화가 불가능 하다
	 - 클래스처럼 타입 역할이 가능하다.
	 - 해당 인터페이스 타입으로 업캐스팅 가능
	   
	   myobj3 -> Swimming -> Running
	*/
	
	public static void main(String[] args) {
		Swimming s1 = new Shark();
		Swimming s2 = new Turttle();
		
		Running r1 = new Turttle();
		Running r2 = (Turttle)s2; // 거북이는 Swimming과 Running을 인터페이스화 했기 때문에 다운캐스팅이 가능하다.
		
		r1.run();
		s2.swim();
		Banana b = new Banana(10, "초록색");
		System.out.println(b);
	
	}	
}
