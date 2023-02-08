package quiz;

import java.util.Arrays;

public class C02_Range_T {

//	1. 최대값을 매개변수로 전달하면 0부터 최대값 미만의 int[]을 생성하여 반환하는
// 	 range 매서드를 만들어 보세요.
// 	 ex> range(8)의 결과 -> [0, 1, 2, 3, 4, 5, 6, 7]
	public static int[] range(int num) {
		return range(0,num);
	}
	
	public static int[] range(int begin, int end) {
//		if (begin == end) {
//			return null;
//		} else {
//			if (begin > end) {
//				return range(begin, end, -1);
//			} else {
//				return range(begin, end, 1);
//			}
//		}
		
		
		return begin == end ? null:
			begin > end ? range(begin, end, -1) : range(begin, end, 1);
	}
	
	
	public static int[] range(int begin, int end, int inc) {
		
		// 두 값의 차이를 구한다.
		int diff = end - begin;
		//System.out.println("diff : " + diff);
		
		// inc가 0인 경우 증가값이 0이라 이상하므로 함수를 종료해버림
		if (inc == 0) {
			return null;
		}
		int len = diff / inc;
		// 길이 계산이 음수가 나오면 뭔가 이상하다는 뜻이므로 함수를 종료해버림
		if (len <= 0) {
			return null;
		}
		
		// 차이가 증가값과 나누어 떨어지지 않는 경우 숫자가 하나 더 나온다.
		len = diff % inc == 0 ? len : len+1;
		
		int[] arr = new int[len];
		for (int i = 0; i < len; ++i) {
			arr[i] = begin + i * inc;
		}
		
		return arr;
	}
	
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(range(8)));
		System.out.println(Arrays.toString(range(15, 20)));
		System.out.println(Arrays.toString(range(10, 14, 2)));
		System.out.println(Arrays.toString(range(10, 15, 2)));
		System.out.println(Arrays.toString(range(30, 10, -2)));
	}
}
