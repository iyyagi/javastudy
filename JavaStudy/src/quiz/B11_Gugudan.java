package quiz;

public class B11_Gugudan {
	/*
	  B10의 구구단 두개를 while문으로 출력해 보세요.. 
	 
	 */
	public static void main(String[] args) {
		
		int dan = 2, gop = 1;
		while (dan <= 9) {
			System.out.printf("%d단 ", dan);
			while (gop <= 9) {
				System.out.printf("%dx%d=%2d ", dan, gop, dan*gop);
				++gop;
			}
			System.out.println();
			gop = 1;
			++dan;
		}
		System.out.println();
		
		int gop2 = 0 , dan2 = 2;
		while (gop2 <= 9) {
			while (dan2 <= 9) {
				if (gop2 == 0) {
					System.out.printf("%5d단 ", dan2);
					
				} else {
					System.out.printf("%dx%d = %2d ", dan2, gop2, dan2*gop2);
					
				}
				++dan2;
			}
			System.out.println();
			++gop2;
			dan2 = 2;
		}
	}
}
