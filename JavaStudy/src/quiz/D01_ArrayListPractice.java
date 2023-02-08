package quiz;

import java.util.ArrayList;

public class D01_ArrayListPractice {
	/*
	  1. ArrayList에 4000 ~ 5000의 랜덤 정수를 100개 추가 한다.

	  2. 모든 숫자의 총합과 평균을 구한다.

	  3. 짝수를 모두 제거한 후 총합을 구한다.

	  4. 홀수를 모두 제거한 후 총합을 구한다.

	  5. 10번째 홀수를 구한다.
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();

		// 1. ArrayList에 4000 ~ 5000의 랜덤 정수를 100개 추가 한다.
		for (int i = 0; i < 100; ++i) {
			list.add((int)(Math.random() * 1001 + 4000));
		}
		System.out.println(list);

		int sum = 0;
		for (int i = 0; i < list.size(); ++i) {
			sum += list.get(i);
		}
		
		//2. 모든 숫자의 총합과 평균을 구한다.
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + sum / (double)list.size());

		ArrayList<Integer> evens = new ArrayList();
		ArrayList<Integer> odds = new ArrayList();

		
		// 3. 짝수를 모두 제거한 후 총합을 구한다.
		// 4. 홀수를 모두 제거한 후 총합을 구한다.
		// 해당 위치의 짝수를 제거하면 뒤에 있던 아이템이 앞으로 땡겨지는 문제
		for (int i = 0; i < list.size(); ++i) {
			int num = list.get(i);
			if (num % 2 == 0) {
				evens.add(list.get(i));
				//--i;
			} else {
				odds.add(list.get(i));
			}
		}
		// 짝수의 합
		int evenSum = 0;
		for (int i = 0; i < evens.size(); ++i) {
			evenSum += evens.get(i);
		}
		// 홀수의 합
		int oddSum = 0;
		for (int i = 0; i < odds.size(); ++i) {
			oddSum += odds.get(i);
		}
		System.out.println("짝수 : " + evens);
		System.out.println("짝수 합계 : " + evenSum);
		System.out.println("홀수 : " + odds);
		System.out.println("홀수 합계 : " + oddSum);
		
		System.out.println("10번째 홀수 : " + odds.get(9));
	}
}
