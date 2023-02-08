package myobj;

public class Grade {

	public int math;
	public int eng;
	public int kor;
	
	public Grade(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	@Override
	public boolean equals(Object obj) {
	
		return this.kor == ((Grade)obj).kor && this.eng == ((Grade)obj).eng &&  this.math == ((Grade)obj).math;
	}
	
}
