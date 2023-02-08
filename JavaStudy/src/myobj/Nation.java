package myobj;

public class Nation {

	public static String nation = "한국";
	
	public String name;
	public int age;
	
	public Nation(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void nationChange(String nation) {
		Nation.nation = nation;
	}
	
	public void info() {
		System.out.printf("이름 : %s, 나이 : %d, 국적 : %s", this.name, this.age, nation);
	}
}

