package quiz;

public class B06_ForQuiz3 {
	/*
		# for문을 사용해 다음과 같이 숫자를 출력해보세요.
		1. 0 3 6 9 12 ... 93 96 99
		
		2. -35 -28 - 21 ... 0 7 21 ... 35
		
		3. 100 200 300 ... 800 900 1000
		
		4. 100 99 98 ... 5 4 3 2 1 0
		
		5. 0 1 2 3 ... 6 7 8 9 0 1 2 3... 7 8 9 ... (30번)
		
		6. 10 9 8 7 ... 3 2 1 10 9 8 ... 3 2 1 10 9...(30번)
		
		7. 7 77 777 7777 .... 777777
	 
	*/
	
	public static void main(String[] args) {
		// 1번 0 3 6 9 12 ... 93 96 99
		for(int i = 0; i < 100; i+=3) {
			System.out.printf("%d ", i);
		}
		System.out.println();
		
		// 2번 -35 -28 - 21 ... 0 7 21 ... 35
		for(int i = -35; i <= 35 ; i+=7) {
			System.out.printf("%d ", i);
		}
		System.out.println();
		// 3번 100 200 300 ... 800 900 1000
		for(int i = 100; i <= 1000; i+=100) {
			System.out.printf("%d ", i);
		}
		System.out.println();
		// 4번 100 99 98 ... 5 4 3 2 1 0
		for(int i = 100, count = 1; i >= 0; --i) {
			System.out.printf("%d ", i);
			
		}
		System.out.println();
		// 5번 0 1 2 3 ... 6 7 8 9 0 1 2 3... 7 8 9 ... (30번)
		for(int j = 30; j > 0; --j) {
				for(int i = 0, count = 1; i < 10; ++i) {
					System.out.printf("%5d[%2d번째] ", i, j);
					if (count % 10 == 0) {
						System.out.println();
					}
					++count;
				}
		}
		System.out.println();
		
		// 6번 10 9 8 7 ... 3 2 1 10 9 8 ... 3 2 1 10 9...(30번)
		for(int j = 30; j > 0; --j) {
			for (int i = 10, count = 1; i>0; --i) {
				System.out.printf("%5d[%2d번째] ", i, j);
				if (count % 10 == 0) {
					System.out.println();
				}
				++count;
			}
		}
		System.out.println();
		
		// 7번 7 77 777 7777 .... 777777
		int sum = 0;
		for (int i = 7; i < 777777; i*=10) {
			if(i % 7 == 0) {
				sum = sum + i;
				System.out.printf("%d ", sum);
			}
		}
	}
}
	

