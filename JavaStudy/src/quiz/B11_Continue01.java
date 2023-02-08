package quiz;

public class B11_Continue01 {

	public static void main(String[] args) {
		
		int sum = 0;
		int num = 1;
		while (num <= 200) {
			
			if (num % 2 !=0 && num % 3 != 0) {
				sum += num;
			}
		
			num++;
		}
		System.out.print("sum :" + sum);
		System.out.println();
		// while 문에서 가장 중요한 것은 증감값의 위치에 따라
		// 숫자가 몇 부터 몇 까지 반복될 지 정확하게 아는것
		int i = 0;
		
		while (i++ < 10) {
			
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		
	}
}
