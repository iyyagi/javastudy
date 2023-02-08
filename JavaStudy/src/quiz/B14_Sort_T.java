package quiz;

import java.util.Arrays;

public class B14_Sort_T {

	public static void main(String[] args) {

		int[] nums = new int[30];

		// Arrays.fill(arr, value) : 해당 배열을 원하는 값으로 채울 때 사용한다.
		//Arrays.fill(nums, 100);

		for (int i = 0; i < nums.length; ++i) {
			nums[i] = (int)(Math.random() * 1000 - 500); // -500 ~ 499
		}
		int[] ascending = new int[30];
		// 배열의 시작 주소 전달 -> 두 배열 변수가 같은 배열을 가르키게 된다.
		//ascending = nums; << nums배열의 참조가 ascending으로 가게 되면서 둘은 같아 진다.
		// 배열 내부의 값 복사는 for문으로
		for (int i = 0; i < nums.length; ++i) {
			ascending[i] = nums[i];
		}

		// 최대 값을 구한다. {55, 1, 3, 9, 88, 8, 17}
		// i : 내가 제일 큰 값을 찾아서 넣어야 하는 위치
		for (int i = 29; i >= 0; --i) {
			// 제일 큰 값 찾기
			int max_index = 0;
			for (int j = 1; j <= i; ++j) {
				if (ascending[max_index] < ascending[j]) {
					max_index = j;
				}
			}
			// 찾은 가장 큰 값과 마지막 위치의 값을 교환
			int temp = ascending[i];
			ascending[i] = ascending[max_index];
			ascending[max_index] = temp;
		}
		// 
		int[] descending = new int[30];
		//descending = nums;
		for (int i = 0; i < nums.length; ++i) {
			descending[i] = nums[i];
		}

		for (int i = 29; i >= 0; --i) {
			// 제일 작은 값 찾기
			int min_index = 0;
			for (int j = 1; j <= i; ++j) {
				if(descending[min_index] > descending[j]) {
					min_index = j;
				}
			}
			int temp = descending[i];
			descending[i] = descending[min_index];
			descending[min_index] = temp;
		}
		System.out.println("정렬 전 배열 : " + Arrays.toString(nums));
		System.out.println("오름차순 : " + Arrays.toString(ascending));
		System.out.println("내림차순 : " + Arrays.toString(descending));
	}
}
