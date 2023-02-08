
public class D09_StringBuilder {
	/*
	  	# StringBuilder
	  	 - 문자열을 빠르게 조립할 때 사용하는 클래스(+= 보다 훨씬 빠르다)
	 	 - 문자열을 생성할 때 다양한 기능들이 들어있다.
	*/
	
	public static void main(String[] args) {
		
		String str = ""; // 계속 인스턴스를 생성하면서 더한다. 속도가 느림
		str += "a";
		str += "p";
		str += "p";
		str += "l";
		str += "e";
		System.out.println(str);
		
		StringBuilder sb1 = new StringBuilder(); // 하나의 인스턴스로 되어 있어 문자열 합치는 속도가 빠르다.
		
		// append() : +=과 같음
		sb1.append("a");
		sb1.append("p");
		sb1.append("p");
		sb1.append("l");
		sb1.append("e");
		 
		// insert(offset, anything) : 원하는 위치에 원하는 내용을 끼워넣는다.
		sb1.insert(2, "banana");
		System.out.println(sb1);
		
		// reverse : 모든 내용을 뒤집는다.
		sb1.reverse();
		System.out.println(sb1);
		
		// substring(start, end) : 원하는 만큼 자른 String 인스턴스를 반환한다.
		String substr1 = sb1.substring(0, 5);
		String substr2 = sb1.substring(5, 10);
		System.out.println(substr1);
		System.out.println(substr2);
		
		// setLength() : 만들던 문자열의 길이를 강제로 변경
		sb1.setLength(10);
		System.out.println(sb1);
		
		// setCharAt(index, ch) : 원하는 위치의 문자를 변경
		sb1.setCharAt(0, 'Z');
		System.out.println(sb1);
		
		// replace(start, end, String) : 원하는 만큼의 문자열을 다른 문자열로 교체한다. 
		sb1.replace(3, 5, "xx");
		System.out.println(sb1);
		
		// delete(start, end) : 원하는 만큼의 문자열을 삭제한다.
		sb1.delete(3, 10);
		System.out.println(sb1);
		
		sb1.insert(2, "banana");
		System.out.println(sb1);
		
		// deleteCharAt(index) : 원하는 위치의 문자를 하나 삭제
		sb1.deleteCharAt(6);
		System.out.println(sb1);
		
		// sb1에 있는 값을 String으로 만들어서 출력할 수 있다. 이것이 String Builder다.
		String BuildResult = sb1.toString();
		System.out.println(BuildResult);
		
		
		long startTime = System.currentTimeMillis();
		String test1 = "";
		for (int i = 0; i < 10000; ++i) {
			test1 += "a";
			
			if (i % 20 == 19) {
				test1 += "\n";
			}
			
		}
		System.out.println("실행시간 : " + (System.currentTimeMillis() - startTime) + "ms");	
		
		startTime = System.currentTimeMillis();
		
		StringBuilder test2 = new StringBuilder();
		for (int i = 0; i < 100000; ++i) {
			test2.append("a");
			// test2.append((char)((
			if (i % 20 == 19) {
				test2.append("\n");
			}
		}
		System.out.println("실행시간 : " + (System.currentTimeMillis() - startTime) + "ms");
		System.out.println(test2);
	}
}
