package quiz;

import java.util.Arrays;

public class C02_Range {

	/*
	  1. 최대값을 매개변수로 전달하면 0부터 최대값 미만의 int[]을 생성하여 반환하는
	  	 range 매서드를 만들어 보세요.
	  	 ex> range(8)의 결과 -> [0, 1, 2, 3, 4, 5, 6, 7]

	  2. 최소값과 최대값을 인자로 전달하면 최소값 부터 최대값 미만의 int[]을 생성하여 반환하는 
	  	 range 매서드를 만들어 보세요

	  	 ex> range(10, 15)의 결과 -> [10, 11, 12, 13, 14]
	  	     range(15, 10)의 결과 -> [15, 14, 13, 12, 11]
	  3. 최소값 최대값 증가값을 인자로 전달하면
	     최소값부터 최대값 미만까지 증가값만큼 증가하는 int[]을 반환하는
	     range 매서드를 만들어 보세요.
	     ex> range(30, 40, 2) -> [30, 32, 34, 36, 38]
	         range(50, 40, -3) -> [50, 47, 44, 41]
	 */
	public static int[] range(int a, int b, int c) {
		int cnt = 0;
		// a값과 b값의 length를 구하기
		if (a > b) {
			for (int i = b; i < a; ++i) {
				++cnt;
			}
		}else {
			for (int i = a; i < b; ++i) {
				++cnt;
			}
		}
		int[] num = new int[cnt];
		cnt = 0;

		if (a < b) {
			for (int i = a; i < b; i+=c) {
				num[cnt++] += i;
			}
		}else if (a > b) {
			for (int i = a; i > b; i=-c) {
				num[cnt++] += i;
			}
		}


		return num;
	}


	public static int[] range(int a, int b) {
		int cnt = 0;

		// a값과 b값의 length를 구하기
		if (a > b) {
			for (int i = b; i < a; ++i) {
				++cnt;
			}
		}else {
			for (int i = a; i < b; ++i) {
				++cnt;
			}
		}

		// cnt는 a, b의 length
		int[] num = new int[cnt];
		cnt = 0;

		if (a < b) {
			for (int i = a; i < b; ++i) {
				num[cnt++] += i;
			}
		} else {
			for (int i = a; i > b; --i) {
				num[cnt++] += i;
			}
		}
		return num;

	}
	public static int[] range(int num) {
		int cnt = 0;
		for (int i = 0; i < num; ++i) {
			++cnt;
		}
		int[] max = new int[cnt];
		for (int i = 0; i < max.length; ++i) {
			max[i] = i;
		}
		return max;
	}

	public static void main(String[] args) {
		// 1번.
		System.out.println(Arrays.toString(range(9)));

		// 2번.
		System.out.println(Arrays.toString(range(2, 10)));
		System.out.println(Arrays.toString(range(10, 2)));

		// 3번
		System.out.println(Arrays.toString(range(2, 10, 2)));
		System.out.println(Arrays.toString(range(10, 2, -2)));



	}
}
