package quiz;

public class B11_Gugudan01 {

	// 강사님 문제풀이
	public static void main(String[] args) {
		// 1번 문제
		int dan = 2, gop = 1;
		while (dan <= 9) {
			System.out.printf("%d단 : ",dan);
			gop = 1; // gop을 초기화 시켜준다.
			while (gop <= 9) {
				System.out.printf("%dx%d=%-2d ", dan, gop, dan * gop);
				++gop;
			}
			++dan;
			System.out.println();
		}
		System.out.println("=====================================================================");
		
		int line = 0;
		while (line < 10) {
			dan = 2;
			while (dan <= 9) {
				if (line == 0) {
					System.out.printf("%d단\t", dan);
				} else {
					System.out.printf("%dx%d=%d\t", dan, line, dan*line);
				}
				++dan;
			}
			++line;
			System.out.println();
		}
	}
}
