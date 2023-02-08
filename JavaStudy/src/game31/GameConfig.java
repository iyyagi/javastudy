package game31;

// 환경설정 메서드를 만든다.
public class GameConfig {

	int lastNum;
	int players;
	int bound;
	
	// 1
	public GameConfig(int lastNum, int players, int bound) {
		this.lastNum = lastNum;
		this.players = players;
		this.bound = bound;
	}
	
	// 3-1
	// Game31에 viewConfig()를 보기위해 만듦
	@Override
	public String toString() {
		return "[마지막 번호 = " + lastNum + ",플레이어" + players + "명, 숫자 범위 1 ~ 3 : " + bound + "]";
	}
	
}
