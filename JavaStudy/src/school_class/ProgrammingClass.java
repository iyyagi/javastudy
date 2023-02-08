package school_class;

public class ProgrammingClass extends Subject {

	int kor;
	int eng;
	int math;
	int programmingLanguage;
	int operatingSystem;
	int dataStructure;
	
	
	public ProgrammingClass() {
		kor = (int)(Math.random() * 101);
		eng = (int)(Math.random() * 101);
		math = (int)(Math.random() * 101);
		programmingLanguage = (int)(Math.random() * 101);
		operatingSystem = (int)(Math.random() * 101);
		dataStructure = (int)(Math.random() * 101);
	}
	
	
	public ProgrammingClass(int kor, int eng, int math, int programmingLanguage, int operatingSystem, int dataStructure) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.programmingLanguage = programmingLanguage;
		this.operatingSystem = operatingSystem;
		this.dataStructure = dataStructure;
	}
	
	@Override
	public int getTotal() {
		return kor + eng + math + programmingLanguage + operatingSystem + dataStructure;
		
	}
	
	@Override
	public double getAvg() {
		return getTotal() / 6.0;
	}
	
	@Override
	public char getGrade() {
		double avg = getAvg();
		if (avg >= 90) {
			return 'A';
		} else if (avg >= 80) {
			return 'B';
		} else if (avg >= 70) {
			return 'C';
		} else if (avg >= 60) {
			return 'D';
		} else {
			return 'F';
		}
	}
	
	@Override
	public String[] getSubjectNames() {
		return new String[] {"국어", "영어", "수학", "프로그래밍 언어", "운영체제", "자료구조"};
	}
	
	@Override
	public String className() {
		return "프로그래밍";
	}
	
	@Override
	public int[] getSubjectScores() {
		return new int[] {kor, eng, math, programmingLanguage, operatingSystem, dataStructure};
		
	}
}
