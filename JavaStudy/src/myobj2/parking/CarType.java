package myobj2.parking;

// step5
public class CarType {

	final public static CarType NOAML = new CarType(0);
	final public static CarType DISABLED = new CarType(1);
	final public static CarType KID = new CarType(2);
	final public static CarType LIGHTCAR = new CarType(3);
	
	private static String[] displayNames = {"일반", "장애인", "유아동승", "경차"};
	
	int value;
	
	private CarType(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayNames[value];
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.value == ((CarType)obj).value;
	}
	
}
