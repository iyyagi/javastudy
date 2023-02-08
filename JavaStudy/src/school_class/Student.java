package school_class;

public class Student {

	String stuId;
	String name;
	Subject subject;
	
	private static int studentCount = 0;
	
	public Student() {
		stuId = String.format("STU%06d", studentCount++);
		name = RandomNameGenerator.getName();
		switch(subject.ran.nextInt(3)) {
		case 0:
			subject = new ProgrammingClass();
			break;
		case 1:
			subject = new NetworkClass();
			break; 
		case 2: 
			subject = new MachineRunningClass();
			break;
		}
	}
	
	public void printScore() {
		String[] subjectNames = subject.getSubjectNames();
		int[] subjectScores = subject.getSubjectScores();
		System.out.println("---------------------------------");
		System.out.println("학번 : " + this.stuId);
		System.out.println("이름 : " + this.name);
		System.out.println("반 : " + subject.className());
		System.out.println("---------------------------------");
		for (int i = 0; i < subjectNames.length; ++i) {
			System.out.println(subjectNames[i] + ":" + subjectScores[i]);
		}
		System.out.println("등급 : " + subject.getGrade());
		System.out.printf("평균 : %.2f\n", subject.getAvg());
		System.out.println("총점 : " + subject.getTotal());
	}
	public static void main(String[] args) {
		
	}
	
}
