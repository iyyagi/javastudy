package myobj;

public class Subway {

	public String[] stations;
	public int line;
	public int current_station;
	
	// 현재 방향을 나타내는 값
	public boolean direction;
	
	// 해당 열차가 순환선인지를 나타내는 값
	public boolean rotate;
	
	// 다음역이 무엇인지 계산하여 반환하는 메서드
	public void next() {
		// 열차가 순환인지 ? true면 nextRotateStatioin을 출력, false면 nextStation을 출력한다.
		current_station = rotate? nextRotateStation() : nextStation();
	}
	
	// 1호선 라인
	public int nextStation() {
		if (current_station == stations.length -1) {
			direction = false;
		} else if (current_station == 0) {
			direction = true;
		}
		return current_station = current_station + (direction? 1 : -1);
	}
	
	// 순환선 코드
	public int nextRotateStation() {
		if (direction && current_station == stations.length -1) {
			return 0; // 0번째로 돌아간다.
		} else if(!direction && current_station == 0) {
			return stations.length -1;
		} 
		return current_station = current_station + (direction? 1 : -1);
	}
	
	public void infomation() {
		System.out.println("----------------------------------------------------");
		System.out.printf("이 열차는 %d호선 열차입니다.\n", line);
		System.out.printf("현재 역은 %s역 입니다.\n", stations[current_station]);
		System.out.printf("다음 역은 %s역 입니다.\n", stations[rotate? nextRotateStation() : nextStation()]);
		//System.out.printf("순환 역은 %s역 입니다.\n", stations[rotate ? nextRotateStation() : nextStation()]);
		System.out.println("----------------------------------------------------");
	}

	
}
