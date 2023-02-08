package database.model;

public class Fruit {
	private String name;
	private double sweet; // DB에서 가져온 데이터에는 null이 포함될 수 있기 때문에 참조형 클래스 타입을 사용한다.
	private Integer price;
	private String country_id;
	private String fruit_grade;
	
	// 기본 생성자가 존재하는 것이 좋다.
	public Fruit() {
		
	}
	
	public Fruit(String name, Double sweet, Integer price, String country_id, String fruit_grade) {
		this.name = name;
		this.sweet = sweet;
		this.price = price;
		this.country_id = country_id;
		this.fruit_grade = fruit_grade;
	}

	// 우클릭 -> Source -> Generate Getters and Setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSweet() {
		return sweet;
	}
	
	public void setSweet(double sweet) {
		this.sweet = sweet;
	}
	
	public Integer getPrice() {
		return price;
	}
	
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public String getCountry_id() {
		return country_id;
	}
	
	public void setCountry_id(String county_id) {
		this.country_id = county_id;
	}
	
	public String getFruit_grade() {
		return fruit_grade;
	}
	
	public void setFruit_grade(String fruit_grade) {
		this.fruit_grade = fruit_grade;
	}
	
	@Override
	public String toString() {
		return String.format("%s/%.2f", name, sweet);
	}
}
