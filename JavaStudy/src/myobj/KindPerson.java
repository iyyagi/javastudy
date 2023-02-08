package myobj;

public class KindPerson extends Person {

	String name = "동용";
	
	// 상속받은 클래스는 부모의 생성자를 가장 먼저 호출해야 한다.
	public KindPerson(String name, int age) {
		super(name, age); // super class의 생성자
		
	}
	
	// 부모 클래스에서 이미 존재하던 기능을 자식클래스에서 수정하여 사용할 수 있다.
	// (오버라이드)
	@Override
	public void sayHi() {
		String name = "인재";
		System.out.printf("안녕하십니까. 제 이름은 %s입니다. 나이는 %d살 입니다. 잘 부탁드립니다.\n", this.name, age);
	}
	
	// 부모 클래스에는 없던 새로운 기능
	public void sayMyName() {
		System.out.println("그냥 name : " + name);
		System.out.println("this.name : " + this.name);
		System.out.println("super.name : " + super.name); // super에 name과 age를 전달했기 때문에 해당 값만 나온다.
	}
	
	// 부모 클래스에는 없던 새로운 기능
	public void sayThanks(String target) {
		System.out.printf("%s씨 감사합니다.", target);
	}
}
