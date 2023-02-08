package school_class;

public class MachineRunningClass extends Subject {

	int kor;
	int eng;
	int math;
	int statistics;
	int programmingLanguage;
	int nosql;
	
	
	
	public MachineRunningClass() {
		// TODO Auto-generated constructor stub
	}
	
	public MachineRunningClass(int kor, int eng, int math, int statistics, int programmingLanguage, int nosql) {
		this.kor = (int)(Math.random() * 101);
		this.eng = (int)(Math.random() * 101);
		this.math = (int)(Math.random() * 101);
		this.statistics = (int)(Math.random() * 101);
		this.programmingLanguage = (int)(Math.random() * 101);
		this.nosql = (int)(Math.random() * 101);
		
	}
	
	@Override
	public int getTotal() {
		return kor + eng + math + statistics + programmingLanguage + nosql;
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
		return new String[] {"국어", "영어", "수학", "통계학"
				+ "프로그래밍 언어", "NO-SQL"};
	}
	
	@Override
	public String className() {
		return "머신러닝";
	}
	
	@Override
	public int[] getSubjectScores() {
		return new int[] {kor, eng, math, statistics, programmingLanguage, nosql};
		
	}
	
}
