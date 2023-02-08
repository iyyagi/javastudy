package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Car {

	String company;
	String model;
	String color;
	int maxSpeed;
	
	HashMap<String, HashMap<String, Car>> list = new HashMap<>();
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(String model, String color, int maxSpeed) {
		
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	

	public boolean addCompany(String company) {
		if (company.contains(company)) {
			System.out.println("이미 존재하는 회사입니다.");
			return false;
		} else {
			System.out.println("새로운 회사를 추가합니다.");
			list.put(company, new HashMap<>());
			return true;
		}
	}
	
	
	

	public void setColor(String color) {
		this.color = color;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getColor() {
		return color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}
	public String getModel() {
		return model;
	}
	

	
	@Override
	public String toString() {
		return String.format("%s/%s/%d", model, color, maxSpeed);
	}
	
}
