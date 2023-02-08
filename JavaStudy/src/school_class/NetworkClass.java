package school_class;

public class NetworkClass extends Subject {

	int kor;
	int eng;
	int linux;
	int network;
	int ccna;
	
	public NetworkClass() {
		// TODO Auto-generated constructor stub
	}
	
	public NetworkClass(int kor, int eng, int linux, int network, int ccna) {
		this.kor = (int)(Math.random() * 101);
		this.eng = (int)(Math.random() * 101);
		this.linux = (int)(Math.random() * 101);
		this.network = (int)(Math.random() * 101);
		this.ccna = (int)(Math.random() * 101);
	}
	
	@Override
	public int getTotal() {
		return kor + eng + linux + network + ccna;
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
		return new String[] {"국어", "영어", "리눅스", "네트워크", "CCNA" };
	}
	
	@Override
	public String className() {
		return "네트워크";
	}
	
	@Override
	public int[] getSubjectScores() {
		return new int[] {kor, eng, linux, network, ccna};
	}
}
