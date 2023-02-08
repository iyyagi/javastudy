package school_class;

import java.util.Random;

public class Subject {

	protected static Random ran = new Random();
	
	// 성적표를 생성할 때 편하겠다.
	public int[] getSubjectScores() {
		System.out.println("과목별 점수를 배열로 만들어 리턴");
		return null;
	}
	
	public double getAvg() {
		System.out.println("과목의 평균을 구해줄 예정");
		return 0;
	}
	
	public int getTotal() {
		System.out.println("과목의 총점을 구해줄 예정");
		return 0;
	}
	
	public char getGrade() {
		System.out.println("과목의 등급을 구해줄 예정");
		return 'F';
	}
	
	public String className() {
		return "";
	}
	
	public String[] getSubjectNames() {
		System.out.println("각 과목의 이름을 구해줄 예정");
		return null;
	}
}
