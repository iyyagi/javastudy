package myobj;

public class PlayCard {
	// 각 인스턴스가 자기만의 공간을 가지고 사용한다 (인스턴스 영역)
	public char suit; // 문양
	public int num;
	
	// static 변수
	// width : 너비, height : 높이
	// static을 붙이면 모든 카드들이 static 값을 사용한다, 메모리절약에 좋다
	// 같은 클래스로 만들어진 모든 인스턴스가 함께 사용하는 공간이다(static 영역)
	public static int width = 100; 
	public static int height = 200;
	
	public PlayCard(char suit, int num) {
		this.suit = suit;
		this.num = num;
	}
	
	// static 메서드에서는 인스턴스 영역의 자원을 사용할 수 없다.
	// -> static 메서드는 static 자원만 활용할 수 있다.
//	public static void test() {
//		suit = '♠';
//		
//	}
	// this도 현재 인스턴스를 뜻하기 때문에 사용할 수 없다.
	public static void changeCardSize(int width, int height) {
		// this.width 는 인스턴스와 관련되어 있기 때문에 사용할 수 없다.
		PlayCard.width = width;
		PlayCard.height = height;
	}
	
	public void info() {
		System.out.printf("[%c%d] w:%d, h:%d\n", this.suit, this.num, width, height);
	}
}
