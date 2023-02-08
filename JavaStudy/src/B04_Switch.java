
public class B04_Switch {
	/*
	  # Swtich-case 문
	  	- () 안에 연산 결과에 따라 실행할 코드를 결정하는 문법
	  	- () 안에 boolean타입 대신 다른 타입을 사용해야 한다.
	  	- if 문으로 완벽하게 대체가능하기 때문에 자주 사용하는 편은 아니다.
	  	- break를 적지 않으면 다음 break를 만날때까지 밑에 있는 모든 case를 실행한다.
	  	- default는 if문의 else같은 역할을 한다.
	  	  ()안의 해당하는 case가 없는 경우 default를 실행한다.
	*/
	
	public static void main(String[] args) {
		
		int a = 5;
		
		// 최신 JDK버전에서는 쉼표로 case를 사용할 수 있지만 옛날 JDK는 불가능
		switch (a) {
		case 0: //case 0,1,2,3:
			System.out.println("a가 0일때 실행되는 문장.");
		case 1:
			System.out.println("a가 1일때 실행되는 문장");
		case 2:
			System.out.println("a가 2일때 실행되는 문장");
			break;
		case 3:
			System.out.println("a가 3일때 실행되는 문장");
			break;
		case 4:
			System.out.println("a가 4일때 실행되는 문장");
			break;
		default:
			System.out.println("올바른 숫자가 아닙니다.");
			break;
		
		}
		
		String user_input = "continued";
		
		switch(user_input) {
			case "quit", "exit":
				System.out.println("프로그램을 종료 합니다.");
				break;
			case "next", "play":
				System.out.println("프로그램을 계속 진행합니다.");
				break;
			case "add":
				System.out.println("새로운 데이터를 추가합니다.");
				break;
			default:
				System.out.println("올바른 명령어가 아닙니다...");
				break;
		}
	}
}
