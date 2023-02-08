package myobj2;

//default package -> C08
public class VacumCleaner extends Electronics {

	public VacumCleaner() {
		super("진공 청소기", 250000);
	}
	
	
	public void replaceFilter() {
		System.out.println("진공청소기의 필터를 새것으로 교환했습니다.");
	}
	
	
	@Override
	public void start() {
		System.out.println("원하는 곳을 잘 청소하기 시작했습니다..");
	}
	
	
}
