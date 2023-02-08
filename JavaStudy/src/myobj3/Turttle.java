package myobj3;

//public class Turttle extends Running, Swimming  자바는 다중 상속이 안된다.

public class Turttle implements Running, Swimming {

	@Override
	public void swim() {
		System.out.println("거북이는 수영중입니다.");
		
	}

	@Override
	public void run() {
		System.out.println("거북이는 달린다.");
		
	}

	
}
