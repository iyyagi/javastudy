import myobj2.Animal;
import myobj2.Lion;
import myobj2.Shark;

public class C14_AbstractClass {

	/*
	  # 추상 클래스 (abstract class)
	  - 클래스의 형태만 만들어 놓고 자세한 구현은 자식 클래스에게 미루는 클래스
	  - 추상 클래스를 상속받은 자식 클래스는 반드시 내부의 추상 메서드를 오버라이드 해 구현을 마무리 지어야 한다.
	  - 추상 클래스는 인스턴스화가 불가능하다 (아직 미완성이므로)
	  
	  # 추상 메서드(abstract method)
	  - 선언만 해놓고 구현 내용은 없는 메서드
	  - 자식 클래스에게 오버라이드를 강제 시킬 수 있다.
	*/
	// myobj2 -> Animal -> Shark
	
	public static void main(String[] args) {
		// 인스턴스를 생성할 수 없다. 추상 클래스는 만들어진 메서드가 없어서 사용이 불가하다.
		//Animal a1 = new Animal(); 
		
		Animal a1 = new Shark();
		Animal a2 = new Lion();
		
		a1.bite();
		a2.bite();
		
		
		
	
		
	}
}
