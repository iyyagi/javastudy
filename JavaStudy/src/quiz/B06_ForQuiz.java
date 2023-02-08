package quiz;

public class B06_ForQuiz {
	/*
	  1. 1부터 2000미만의 9의 배수를 모두 출력해 보세요.(양수만)
	  
	  2. 100부터 300까지의 총합을 구해보세요 (100과 300 포함)
	  
	  3. 1000부터 1500까지의 10의 배수를 한 줄에 7개씩 출력해 보세요.
	*/
	public static void main(String[] args) {
		// 1부터 2000미만의 9의 배수를 모두 출력해 보세요.(양수만)
		
		/*for(int i = 0; i < 2000; i+=9) {
			System.out.println(i);
		}
		*/

		for (int i = 0; i < 2000; ++i) {
			if(i % 9 == 0) {
				System.out.printf("9의 배수는 %d 입니다.\n", i);
			}	
		}
		
		// 2. 100부터 300까지의 총합을 구해보세요 (100과 300 포함)
		// 총합을 구할 때는 변수를 하나 만들어 값을 계속 누적시킨다.
		int sum=0;
		for (int j = 100; j <= 300; ++j) {
			sum += j;
		}
		System.out.printf("2번 문제 답:%d\n",sum);
		
		// 3. 1000부터 1500까지의 10의 배수를 한 줄에 7개씩 출력해 보세요.
		// 7번에 한번씩 \n을 출력해주면 된다.

		for (int i=1000, count=1; i<=1500; ++i) {
			if(i % 10 == 0) {
				System.out.printf("%5d(%d번째) ", i, count);
				  if(count % 7 == 0) { 
					  System.out.println();  
				  } 
				  ++count;
			}
		}
	}
}
