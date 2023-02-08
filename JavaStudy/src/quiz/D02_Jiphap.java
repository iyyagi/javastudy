package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_Jiphap {

	/*
	  1. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 합집합을 Set으로 변환하는 메서드
	  		[1, 2, 3] + [2, 3, 4, 5] = > [1, 2, 3, 4, 5]
	  2. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 교집합을 Set으로 변환하는 메서드
	  		[1, 2, 3] + [2, 3, 4, 5] => [2, 3]
	  3. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 차집합을 Set으로 변환하는 메서드
			[1, 2, 3] - [2, 3, 4, 5] => [1]
			[2, 3, 4, 5] - [1, 2, 3] => [4, 5]
	 */

	// 1.
	public static Set union(Collection a, Collection b) {
		Set hap = new HashSet<>(); // set은 사용불가 인터페이스는 인스턴스가 안됨
		hap.addAll(a);
		hap.addAll(b);
		
		return hap;
	}

	// 2. 교집합
	public static Set inter(Collection a, Collection b) {
		Set inter = new HashSet<>();
		
		
		inter.addAll(a);
		inter.retainAll(b); // 교집합
//		for (Object o : a) {
//			for (Object o2 : b) {
//				if (o.equals(o2)) { // 
//					inter.add(o2);
//				}
//			}
//		}
		
		return inter;
	}
	
	//3. 차집합
	public static Set difference(Collection a, Collection b) {
		Set diff = new HashSet<>();
		
		diff.addAll(a);
		diff.removeAll(b);
		
		return diff;
	}
	
	public static void main(String[] args) {
		List<Integer> c = new ArrayList<>();
		Set<Integer> d = new HashSet<>();
		
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		
		d.add(3);
		d.add(4);
		d.add(5);
		d.add(6);
		System.out.println("intersection C, D : " + inter(c, d));
		
		List<String> a = new ArrayList<>();
		Set<String> b = new HashSet<>();
		a.add("Apple");
		a.add("Banana");
		a.add("Banana");
		a.add("orange");
		
		b.add("Banana");
		b.add("Banana");
		b.add("kiwi");
		b.add("Mango");
		System.out.println("A : " + a);
		System.out.println("B : " + b);
		System.out.println("C : " + c);
		System.out.println("D : " + d);
		System.out.println("uniob A + B " + union(a, b));
		System.out.println("intersection A, B : " + inter(a, b));
		System.out.println("intersection A, C : " + inter(a, c));
		System.out.println("diff A, B " + difference(a, b));
		System.out.println("diff B, A " + difference(b, a));
	}
}
