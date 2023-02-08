package song;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Singable {

	static Random ran = new Random();
	
	
	static String[] minute = {"3분", "2분20초", "1분 50초"};
	String title;
	String min;
	public Singable() {
		
	}
	
	public void printSing() {
		System.out.println(title + "부릅니다.");
		System.out.println(min + "입니다.");
		
	}
	public static void main(String[] args) {
		List<String> singName = new ArrayList<>();
		singName.add("안녕하세요");
		System.out.println(singName);
	}

}
