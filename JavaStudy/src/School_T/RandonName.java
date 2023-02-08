package School_T;

public class RandonName {

	private static String[] lastName = {"강", "김", "최", "신", "허", "정", "양"};
	private static String[] firstName = {"철", "지수", "지은", "윤철", "상윤", "진영", "혜민"};
	
	public static String getName() {
		
		return lastName[(int)(Math.random() * lastName.length)] + 
				firstName[(int)(Math.random() * firstName.length)];
	}
	
}
