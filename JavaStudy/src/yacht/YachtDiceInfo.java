package yacht;

public class YachtDiceInfo {
	// 미리 생성해놓은 인스턴스만 생성할 수 있다.(접근제어자를 통한 디자인 패턴)
	final public static YachtDiceInfo YACHT = new YachtDiceInfo("Yacht!!!", 50);
	final public static YachtDiceInfo FULL_HOUSE = new YachtDiceInfo("풀하우스", 40);
	final public static YachtDiceInfo FOUR_OF_A_KIND = new YachtDiceInfo("4Dice!!!", 30);
	final public static YachtDiceInfo LARGE_STRAIGHT = new YachtDiceInfo("Large Straight", 35);
	final public static YachtDiceInfo SMALL_STRAIGHT = new YachtDiceInfo("Small Straight", 25);
	final public static YachtDiceInfo NOTHING = new YachtDiceInfo("Nothing", 0);
	
	
	
	private String name;
	private int value;
	
	private YachtDiceInfo(String name, int value) {
		this.name = name;
		this.value = value;
		
	}
	
	@Override
	public String toString() {
		return String.format("%s(%d점)", name, value);
	}
}
