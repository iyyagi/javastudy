package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test {

	
	public static void main(String[] args) {
	
		List<String> text = new ArrayList<>();
		text.add("안녕");
		text.add("하세요");
		text.add("반갑습니다.");
		
		System.out.println(text);

			Collections.shuffle(text);
	
		
		System.out.println(text);
		
		
	}

}

