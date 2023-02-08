package quiz;

import java.util.ArrayList;

public class D01_ArrayListPractice2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 100; ++i) {
			list.add((int)(Math.random() * 1001 + 4000));
		}
		
		// 얕은 복사(shallow copy) - 주소를 복사한다.
		// ArrayList<Integer> oddList = list;
		
		// 깊은 복사(deep copy) - 값을 복사해 똑같은 인스턴스를 하나 더 만든다.
		//ArrayList<Integer> oddList = new ArrayList<>();
		//oddList.addAll(list);
		// clone으로 사용이 가능하며 object이기 때문에 앞에 ArrayList<Integer>를 붙혀준다.
		ArrayList<Integer> oddList = (ArrayList<Integer>)list.clone();
		
		
		for (int i = 0; i < oddList.size(); ++i) {
			if (oddList.get(i) % 2 == 0) {
				oddList.remove(i--);
			}
		}
		System.out.println("원본 리스트 : " + list);
		System.out.println("홀수 리스트 : " + oddList);
	}
	
}
