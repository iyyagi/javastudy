package quiz;

public class B10_Gugudan {

	/*
	  1. 구구단을 다음과 같이 가로로 출력해보세요.
	  
	  2단 : 2x2=2 2x2=4...
	  3단 : 3x1=3 3x2=6...
	  
	  2. 구구단을 다음과 같이 세로로 출력해 보세요.
	  
	  2단     3단
	  2x1=2   3x1=3
	  
	*/
	public static void main(String[] args) {
		
		for (int dan = 2; dan <= 9; ++dan) {
			System.out.printf("%d단 ", dan);
			for (int gop = 1; gop <= 9; ++gop) {
				System.out.printf("%d x %d = %2d ", dan, gop, dan * gop);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("--------------------------");
		
		System.out.println();
		for (int k = 2; k <= 9; ++k) {
			System.out.printf("%2d단\t", k);
		}
		System.out.println();
		for (int i = 0; i <= 9; ++i) {
			for (int j = 2; j <= 9; ++j) {
				
				System.out.printf("%dx%d=%-2d \t", j , i, j*i);
			}
			System.out.println();		
		}	
		
		for (int line = 0; line <= 9; ++line) {
			for (int dan = 2; dan <= 9; ++dan) {
				if (line == 0) {
					System.out.printf("%d단\t", dan);
				} else {
					System.out.printf("%dx%d=%d\t", dan, line, dan * line);
				}
			}
			System.out.println();
		}
	}
}
