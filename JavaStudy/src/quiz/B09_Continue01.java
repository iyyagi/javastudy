package quiz;

public class B09_Continue01 {

	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 30; ++i) {
			System.out.print(i + "\t");
			if (i % 5 != 0) {
				continue;
			}
			System.out.println();
		}
		
		
		int sum = 0;
		for (int i = 1; i <= 200; ++i) {
			if (i % 2 == 0 || i % 3 == 0) {
				continue;
			}
			sum += i;
			
		}
		System.out.print(sum);
	}
}
