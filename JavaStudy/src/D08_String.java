import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D08_String {

	
	
	
	public static void main(String[] args) {
		
		String fruits = "apple/banana/orange/melon/watermelon/grape";
		
		// split(delim) : 문자열을 원하는 기준으로 잘라 문자열 배열로 반환한다.
		String[] splited = fruits.split("/");
		System.out.println(Arrays.toString(splited));
		
		// join(delim, iterable) : 해당 iterable 객체에 들어있는 모든 요소를 delim로 이어 붙힌다.
		// # iterable - 배열, 리스트 등 하나씩 꺼낼 수 있는 성질을 의미하는 인터페이스
		String join = String.join("--", splited);
		System.out.println(join);
		
		// join(delim, Charsequence..)
		join = String.join("#", "사자", "호랑이", "얼룩말", "고양이", "강아지");
		System.out.println(join);
		
		// contains(sq) : 해당 문자열이 포함 여부를 반환한다.
		String email = "abc123@naver.com";
		System.out.println("naver ?" + email.contains("naver"));
		System.out.println("hoogle?" + email.contains("google"));
		
		// startWith(charsequence) : 해당 문자열로 시작하는지 검사
		String url = "https://www,naver.com";
		System.out.println("http://" + url.startsWith("http://"));
		System.out.println("https://" + url.startsWith("https://"));
		// endWith(charsequence) : 해당 문자열로 끝나는지 검사
		System.out.println(".com?" + url.endsWith(".com"));
		
		// replace(old, new) 문자열을 교체한 새로운 문자열을 반환한다.
		String replaced = fruits.replace("melon", "redapple");
		System.out.println("원본 : " + fruits);
		System.out.println("교체 : " + replaced);
		
		// substring(start, end) : 문자열의 일부분을 자른 인스턴스를 반환한다. start 이상 end 미만
		String substr = fruits.substring(10, 17);
		System.out.println("substr : 반환" + substr);
		
		// substring(index) : 해당 위치부터 맨 마지막까지 자른 인스턴스를 반환
		substr = fruits.substring(17);
		System.out.println("substr2 : " + substr);
		
		// trim() : 외곽의 공백을 제거한 인스턴스를 반환한다. (내부의 공백은 제거하지 않는다..)
		String input = "      123   123abc";
		String trimstr = input.trim();
		System.out.println("입력 : " + trimstr);
		
		// toUpperCase() : 해당 문자열을 모두 대문자로 변환
		System.out.println(input.toUpperCase().trim().replace(' ', '#'));
		// toUppercase() : 해당 문자열을 모두 소문자로 변환
		System.out.println(input.toLowerCase().trim().replace(' ', '$'));
		
	
		// indexOf(charsequence) : 원하는 문자열을 찾아 인덱스를 반환한다.
		fruits = "apple/banana/kiwi/peach/orange/apple/grape";
		
		for (int i = 0; i < 10; ++i) {
			fruits += fruits;
		}
		System.out.println(fruits.indexOf("banana"));
		System.out.println(fruits.indexOf("apple")); // 가장 처음에 있는 apple만 찾는다.
		// indexOf(charsequence, start) : 원하는 위치부터 찾을 수 있다.
		System.out.println(fruits.indexOf("apple", 1));
		System.out.println(fruits);
		// 문자열 fruits에서 모든apple의 인덱스를 찾아 리스트에 저장해보세요
		List<Integer> ap = new ArrayList<>();
		List<Integer> indexs = new ArrayList<>();
		String word = "apple";
		int len = word.length();
		int found = 0;
		for (int i = 0; true; i = found + len) {
			// indexOf는 원하는 문자열을 찾지 못했을 때 -1을 리턴한다.
			found = fruits.indexOf(word, i);
			if (found == -1) {
				break;
			} else {
				System.out.printf("%d에서 \"apple\" 발견!\n", found);
				indexs.add(found);
			}
			
		}
		System.out.println();
		
//		for (int i = 0 ; i < fruits.length(); ++i) {
//			
//			if (fruits.indexOf("apple", i) != fruits.indexOf("apple", i+1) ) {
//				ap.add(fruits.indexOf("apple",i));
//				
//			} 
//		}
//		System.out.println(ap);
	}	
}
