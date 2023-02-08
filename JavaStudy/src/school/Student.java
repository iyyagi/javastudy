package school;

public class Student {

	static String name;
	int studentId; // 학번
	static int score = 100;
	
	// 이름 배열
	static String[] lastName = {"강", "김", "박", "곽", "이", "장", "권", "양", "고", "신", "허"};
	static String[] firstName = {"민영", "민지", "혜민", "원석", "왕건", "궁예", "길동", "시복", "규용", "예빈",
			"정우", "지수", "수민"};
	
	
	// 학번 배열
	static String[] yearArr = {"15", "16", "17", "18", "19", "20", "21", "22"}; // 년도
	static String[] idArr = {"-1256", "-2128", "-3624", "-4885", "-5998", "-6258", "-7785", "-8218", "-9112"}; // 학번
	
	
	public Student() {
		name = randomName();
	}
	
	static String id () {
		return yearArr[(int)(Math.random() * yearArr.length)] + 
				idArr[(int)(Math.random() * idArr.length)];
	}
	
	static String randomName () {
		return lastName[(int)(Math.random() * lastName.length)] + 
				firstName[(int)(Math.random() * firstName.length)];
	}
	
	static int randomScore () {
		return (int)(Math.random() * score +1);
	}
	
	public static void main(String[] args) {
		Student st = new Student();
		System.out.println(st.randomName());
		System.out.println(st.id());
		System.out.println(st.randomScore());
	}
}
