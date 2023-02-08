import java.util.Scanner;

public class B03_If {

	/*
		# if문
		- () 안의 값이 true이면 {} 안의 내용을 실행하는 문법
		- () 안의 값이 false면 {} 안의 내용을 무시한다.
		
		# else if문
		- 위의 if문이 실행되지 않았다면 if문처럼 동작한다.
		- else if는 여러번 사용할 수 있다.
		- else if는 단독으로 사용할 수 없다.
		
		# else
		- 위의 조건(if, else if)이 모두 아니면 {}안의 내용을 무조건 실행한다.
		- if문 바로 다음에 사용할 수 있다.
		- 단독으로 사용할 수 없다.
		- else가 붙어있는 if절은 최소한 한번은 실행이 보장된다.
		
	*/
	
	public static void main(String[] args) {
	
		System.out.println("Program start");
		
		int a = 114;
		
		if (a == 10) {	
			System.out.println("hi");
		} else if(a == 11) {
			System.out.println("hello");
		} else if(a == 12) {
			System.out.println("nice to meet you");
		} else if(a == 13) {
			System.out.println("welcome");
		} else {
			System.out.println("nothing");
 		}

		int apple;
		
		// else 를 사용하지 않으면 변수 apple이 초기화 되지 않을 가능성이 존재하므로
		// 초기화 된 것으로 볼 수 없다.
		if(a > 100) {
			apple = 123;
		} else if(a <= 100) {
			apple = -1;	
		} else { // else가 있어야만 if절에서 초기화가 한번은 실행된다.
			apple = -10;
		}
		System.out.println("사과 : " + apple); // else를 사용하지 않으면 변수 apple이 초기화가 안됨
			
		System.out.println("Program end");

	}
}
