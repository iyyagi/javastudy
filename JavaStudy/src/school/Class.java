package school;

public class Class  {
	Subject subject;
	Student student;
	static String[] className = {"프로그램", "네트워크", "머신러닝"};

	public Class() {

	}

	static String className() {
		return className[(int)(Math.random() * className.length)];
	}

	public static void main(String[] args) {
		Class c = new Class();
		Student st = new Student();
		Subject sj = new Subject();

		
		for (int i = 0; i < 100; ++i) {
			System.out.print(c.className() + "반 ");
			System.out.print("이름 : " + st.randomName() + " ");
			System.out.print("학번 : " + st.id() + " ");
			System.out.print(sj.programingSubject() + " ");
			System.out.print("총점 : " + sj.program_sum() + " ");
			System.out.print("평균 : " + sj.program_avg() + " ");
			System.out.print("등급 : " + sj.program_grade() + " ");
			System.out.println();
			System.out.print(c.className() + "반 ");
			System.out.print("이름 : " + st.randomName() + " ");
			System.out.print("학번 : " + st.id() + " ");
			System.out.print(sj.networkSubject() + " ");
			System.out.print("총점 : " + sj.network_sum() + " ");
			System.out.print("평균 : " + sj.network_avg() + " ");
			System.out.print("등급 : " + sj.network_grade() + " ");
			System.out.println();
			System.out.print(c.className() + "반 ");
			System.out.print("이름 : " + st.randomName() + " ");
			System.out.print("학번 : " + st.id() + " ");
			System.out.print(sj.machineSubject() + " ");
			System.out.print("총점 : " + sj.machine_sum() + " ");
			System.out.print("평균 : " + sj.machine_avg() + " ");
			System.out.print("등급 : " + sj.machine_grade() + " ");
			System.out.println();
			
		}
	}
}
