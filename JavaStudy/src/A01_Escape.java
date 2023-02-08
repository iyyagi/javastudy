
public class A01_Escape {

	/*
	  # Escape 문자
	   - 특수한 기능을 가진 문자
       - 그냥 출력하기에는 문제가 있는 문자들을 표현하기 위한 방식
       - \ 와 하나의 문자가 합쳐져서 특수한 기능을 한다.
       - \ + 문자인 두 문자가 하나의 문자로 인식된다.
	*/
	public static void main(String[] args) {
		// Tab : 보이지 않는 칸을 만들어주는 키
		// \n : 줄 바꿈의 기능을 가진 특수 문자다.
		System.out.println("안녕하세요 반갑습니다.");
		System.out.println("안녕하세요 반갑\n습니다.");
		// \t : Tab키의 기능을 가진 특수 문자다.
		System.out.println("안녕하세요 반갑\t습니다.");
		System.out.println("안녕하세요 반갑	습니다."); // 직접 Tab으로 해도 된다.
		// \\ : Escape 문자의 기능을 사용하지 않고 그냥 \를 출력하고 싶을 때 사용한다.
		System.out.println("안녕하세요 반갑\\습니다.");
		System.out.println("C:\\JavaFullStack\\eclipse\\note"); // 경로 출력 
		// \" : 그냥 큰 따옴표를 출력하고 싶을 때 사용하는 특수 문자.
		System.out.println("오늘 저녁은 \"피자\"를 먹는다.");
		// \' : 그냥 작은 따옴표를 출력하고 싶을 때 사용하는 특수 문자.
		System.out.println("오늘 저녁은 \'피자\'를 먹는다.");
		System.out.println("오늘 저녁은 '피자'를 먹는다.");
		System.out.println('\''); // ' 작은 따옴표 표현
		System.out.println('\t'); // tab키
		System.out.println('\\'); // \를 표현
		System.out.println(' '); // 스페이스바도 문자다(공백 문자)
	}
	
}
