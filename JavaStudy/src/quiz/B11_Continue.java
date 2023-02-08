package quiz;

public class B11_Continue {
	/*
	  * while 문을 사용해야 함
	  * while 문 내부에도 break와 continue를 사용할 수 있다.
	*/
	public static void main(String[] args) {
		// 1. 1부터 30까지 한 줄에 숫자를 5개씩 출력
		int i = 1, count = 0;;
		while (i <= 30) {
			if (count % 5 == 0) {
				System.out.println();
			}
			System.out.printf("%2d ", i);
			++i;
			++count;
		}
		System.out.println();
		int num = 1;
		while (num <= 30) {
			
			if(num % 5 == 1) {
				System.out.println();
			}
			System.out.printf("%2d ", num);
			++num;
		}
		
		
		
		System.out.println();
		// 2. 1부터 200까지의 숫자 중 2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합
		int j = 0;
		int sum = 0;
		
		while (j <= 200) {
			++j;
			if (j % 2 == 0 || j % 3 ==0) {
				continue;
			} 
			sum += j;
		}
		System.out.print(sum);
	}
}
