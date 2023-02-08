package myobj;

public class Apple {
	public int size;
	public int grade;
	public String color;
	
	// 인스턴스 생성시 다음 생성자들 중 하나를 반드시 호출해야 한다.

	// 생성자도 오버로딩이 가능하다.
	public Apple() {
		size = 50;
		grade = 3;
		color = "기본색상";
	}
	
	public Apple(int size) {
		
	}
	public Apple(int size, int grade) {
		// 이름이 똑같으면 같은 녀석을 바라본다.
//		size = size;
//		grade = grade;
		// this : 각 인스턴스 영역을 의미한다.
		this.size = size;
		this.grade = grade;
		this.color = "기본색";
	}
	public Apple(int s, int g, String c) {
		// 이름이 겹치지 않을때는 this가 생략 가능하다.
		size = s;
		grade = g;
		color = c;
	}
	
	public void info() {
		System.out.printf("크기 : %d\n등급 : %d\n색깔 : %s\n", this.size, this.grade, this.color);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return color + "색 사과 크기는 " + size;
	}
	

	
}
