package School_T;

public class RandomNameGenerator {

	private static String[] lastName = {
		"김", "이", "박", "최", "성", "제갈", "남궁", "왕", "조", "구", "정", "양"	
	};
	
	private static String[] firstName = {
		"민석", "민지", "원석", "민희", "혜민", "수지", "지수", "길동"	
	};
			

			
	public static String getName() {

		return lastName[(int)(Math.random() * lastName.length)] + 
				firstName[(int)(Math.random() * firstName.length)];
	}
}
