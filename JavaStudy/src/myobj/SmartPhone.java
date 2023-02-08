package myobj;

public class SmartPhone {

	
	public String osAbout;
	public double osVersion;
	public int price;
	public String product;
	
	public SmartPhone() {
		osAbout = "Android";
		osVersion = 4.2;
		price = 300000;
		product = "갤럭시";
	}
	
	public SmartPhone(String product) {
		this.product = product;
	}
	
	public SmartPhone(String product, double osVersion) {
		this.product = product;
		this.osVersion = osVersion;
	}
	
	public SmartPhone(String osAbout, double osVersion, int price, String product)  {
		this.osAbout = osAbout;
		this.osVersion = osVersion;
		this.price = price;
		this.product = product;
	}
	
	public void downPrice() {
		price -= 100000;
	}
	
	public void nextVersion() {
		osVersion += 0.1;
	}
	
	public void downVersion() {
		osVersion -= 0.1;
	}
	
	public void info() {
		System.out.printf("OS : %s, Version : %.2f, 품명 : %s, 가격 %d", this.osAbout, this.osVersion, this.product, this.price);
	}
}
