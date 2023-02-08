import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import blackjack.Card;

public class D05_Collections {

	/*
	  # java.util.Arrays
	  - 배열을 편하게 다를 수 있는 기능들이 모여있는 클래스


	  # java.util.Collections
	  - 컬렉션을 편하게 다룰 수 있는 메서드들이 모여있는 클래스

	 */
	public static void main(String[] args) {

		List<Double> list = new ArrayList<>();
		Set<Double> set = new HashSet<>();

		// 원래는 하나씩 아래처럼 추가했다.
		// list.add();

		// Collections.addAll(...) 해당 컬렉션에 여러 데이터를 한번에 추가할 수 있다.
		Collections.addAll(list, 1.1, 2.2, 3.3, 4.4, 5.5);
		Collections.addAll(set, 1.11, 2.22, 3.33, 4.44, 5.55);

		System.out.println(list);
		System.out.println(set);

		// Collections.copy(dest(목적지), src(원본)) : (복사되는 컬렉션이 더 작은 경우 에러)
		List<Double> copied = new ArrayList<>();
		Collections.addAll(copied, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1);
		Collections.copy(copied, list);
		System.out.println("원본 : " + list);
		System.out.println("복사본 : " + copied);
		copied.set(0, 9.9);
		System.out.println("원본 : " + list);
		System.out.println("복사본 : " + copied);

		// Collections.fill(list, item) : 해당 리스트의 모든 값을 원하는 값으로 초기화.
		Collections.fill(copied, 7.777);
		System.out.println(copied);

		// Collections.frequency(list, item) : 해당 값이 리스트에 몇개 들어있는지?
		List<String> fruits = new ArrayList<>();
		Collections.addAll(fruits, "Apple", "Banana", "Apple", "Kiwi", "Apple", "Apple");
		Collections.frequency(fruits, "Apple");
		int a = Collections.frequency(fruits, "Apple");
		System.out.printf("Apple은 %d번 등장 했다.\n", a);

		// Collections.max : 해당 컬렉션에서 가장 큰 값을 하나 꺼낸다,
		// Collections.min : 해당 컬렉션에서 가장 작은 값을 꺼낸다.
		System.out.println("제일 큰 과일?" + Collections.max(fruits));
		System.out.println("제일 큰 값 " + Collections.max(set));

		List<Card> cardList = new ArrayList<>();
		for (int i = 0; i < 13; ++i) {
			cardList.add(new Card(2, i));
		}
		
		// Collections.shuffle(list) : 요소를 랜덤으로 섞는 기능
		Collections.shuffle(cardList);
		System.out.println(cardList);
		
		// Collections.rotate(list, distance) : 해당 리스트를 원하는 만큼 순환시킨다.
		for (int i = 0; i < 10; ++i) {
			Collections.rotate(cardList, 1);
			//Collections.rotate(cardList, -2);
			System.out.printf("rotate %d: %s\n", i, cardList);
		}
		
		
		// Collections.swap(list, i ,j)
		System.out.println("교체 전 : " + cardList);
		Collections.swap(cardList, 0, 5);
		System.out.println("교체 후 : " + cardList);
		
		// Collections.replaceAll(list, old, new) : 해당 리스트의 모든 값을 교체 
		Collections.replaceAll(fruits, "Apple", "pineapple");
		System.out.println(fruits);
		
		
		// Collections.reverse(list) : 해당 리스트를 거꾸로 뒤집는다.
		System.out.println("뒤집기 전 : " + cardList);
		Collections.reverse(cardList);
		System.out.println("뒤집은 후 : " + cardList);
		
		// Collections.sort() : 해당 리스트를 정렬한다.
		// 문자열은 정리가 되어있기 때문에 sort가 사용 가능하다.
		Collections.sort(fruits);
		System.out.println(fruits);
		Collections.reverse(fruits);
		System.out.println(fruits);
		// cardList는 정렬의 기준을 정하지 않아서 sort를 사용할 수 없다.
		//Collections.sort(cardList);
		
		
		
		
	}
}
