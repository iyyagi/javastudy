
import myobj.CoffeeBean;
import myobj.Nation;
import myobj.PlayCard;

public class C05_Static {

	/*
	 	# static (정적 영역, 클래스 영역 <=> 인스턴스 영역)
	 	- 같은 클래스의 모든 인스턴스들이 함께 사용하는 공동 영역을
	 	  정적 영역(클래스 영역)이라고 한다.
	 	- 앞에 static이 붙은 자원들은 모든 인스턴스가 함께 사용하는
	 	  공동자원이 된다.
	 	- static 영역의 자원은 아무리 많은 인스턴스가 있어도 클래스 당 하나이기 때문에
	 	  클래스 이름에 .을 찍고 사용할 수 있다.
	 	  ex (Math.pow(), Math.radom();)
	 
	*/
	
	public static void main(String[] args) {
//		PlayCard h1 = new PlayCard('♥', 1);
//		PlayCard c10 = new PlayCard('♣', 10);
//		PlayCard c5 = new PlayCard('♣', 5);
//		PlayCard c7 = new PlayCard('♣', 7);
//		
//		//h1.width = 500;
//		PlayCard.width = 500; 
//		PlayCard.height = 1200;
//		
//		h1.info();
//		c10.info();
//		c5.info();
//		c7.info();
		// 인스턴스가 하나도 없는 상황에서도 static은 존재할 수 있다,
		System.out.println(PlayCard.width);
		System.out.println(PlayCard.height);
		PlayCard.changeCardSize(200, 300);
		System.out.println();
		
		Nation a = new Nation("철수", 19);
		Nation b = new Nation("영희", 18);
		a.info();
		System.out.println();
		b.info();
		System.out.println();
		Nation c = new Nation("Justin jason", 20);
		c.nationChange("미국");
		c.info();
		System.out.println();
		
		// 미리 만들어 놓은 CoffeeBean 인스턴스를 호출해서 결과를 볼 수 있다.
		// 다양한 방식으로 인스턴스를 생성할 수 있다.
		CoffeeBean.BRAZILIAN_ARABICA.info();
		CoffeeBean.COLOMBIAN_ROBUSTA.info();
		// 기존의 방식으로 myBean을 생성하여 인자에 값을 입력하면 String 배열에 있는 값을 찾는다.
		CoffeeBean myBean = new CoffeeBean(2, 3);
		// myBean으로 생성하여 사용하기 때문에 다시 사용할 수 있다.
		myBean.info();
		myBean.info();
		// 익명 방식(이름이 없어서 다시 사용할 수 없다.)
		// 해당 방식으로 하면 출력 할 수 있지만 다시 사용이 불가능 하다. 다시 선언해야한다.
		new CoffeeBean(2, 6).info();
	
		
	}
}
