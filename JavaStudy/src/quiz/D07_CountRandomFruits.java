package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;



public class D07_CountRandomFruits {

	/*
	  리스트에 String 타입 랜덤 과일 이름을 300개 추가하고
	  각 과일이 몇번 등장했는지 세어보세요

	  (apple, banan, kiwi, orange, grape, peach, pineaaple)

	 */

	public static void main(String[] args) {
			
		String[] fruitName = {"apple", "banana", "kiwi", "orange", "grape", "peach", "pineaaple"};
		List<String> fruits = new ArrayList<>();
		Random r = new Random();
		for (int i = 0; i < 300; ++i) {
			fruits.add(fruitName[r.nextInt(fruitName.length)]);
		}
	
		// 비효율적 fruits에 들어있는 300개를 7번 반복하는것과 같다.
//		for (int i = 0; i < fruitName.length; ++i) {
//			System.out.printf("%s's count : %d\n", fruitName[i], Collections.frequency(fruits, fruitName[i]));
//		}
		
		int size = fruits.size();
		int[] count = new int[fruitName.length];
		for (int i = 0; i < size; ++ i) {
			String fruit = fruits.get(i);
			if (fruit.equals("apple")) {
				count[0] += 1;
			} else if (fruit.equals("banana")) {
				count[1] += 1;
			} else if (fruit.equals("kiwi")) {
				count[2] += 1;
			} else if (fruit.equals("orange")) {
				count[3] += 1;
			} else if (fruit.equals("grape")) {
				count[4] += 1;
			} else if (fruit.equals("peach")) {
				count[5] += 1;
			} else {
				count[6] += 1;
			}
		}
		System.out.println(Arrays.toString(count));
		
		HashMap<String, Integer> fruitsCount = new HashMap<>();
		for (String fruit : fruits) {
			// 새로운 과일이 등장했을 때는 1을 넣고 null을 리턴한다.
			// 이미 값이 들어가 있을때는 값을 꺼낸다.
			Integer count_ = fruitsCount.putIfAbsent(fruit, 1);
			
			
			
			
			// 이미 count를 세기 시작했던 과일이라면 1증가
			if (count_ != null) {
				fruitsCount.put(fruit, count_ + 1);
			}
		}
		
		System.out.println(fruitsCount);
		
	}
}
