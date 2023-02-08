package quiz;

import java.util.Arrays;

public class B14_Sort {

	/*
	  랜덤 숫자 30개가 들어있는 배열을 생성한 후 

	  (1) 해당 배열의 내용을 작은값 부터 차례대로(오름차순) 저장한
	      새로운 배열을 생성하여 출력 하세요. asc

	  (2) 해당 배열의 내용을 큰 값 부터 차례대로(내림차순) 저장한
	      새로운 배열을 생성하여 출력 하세요. desc
	 */
	public static void main(String[] args) {
		int[] nums = new int[30];
		int[] desc = new int[30];
		int[] asc = new int[30];
		for (int i = 0; i < nums.length; ++i) {
			nums[i] = (int)(Math.random() * 100);
		}
		System.out.print("원본 값 : " + Arrays.toString(nums));
		System.out.println();
		
		// asc[] 배열에 num[]배열에 있는 값을 복사
		for (int i = 0; i < nums.length; ++i) {
			asc[i] = nums[i];
		}
		for (int i = 0; i < asc.length; ++i) {
			for (int j = 0; j < i; ++j) {
				if (asc[i] < asc[j]) {
					int temp = asc[i];
					asc[i] = asc[j];
					asc[j] = temp;
				}
			}
		}
		// desc[] 배열에 num[]배열에 있는 값을 복사
		for (int i = 0; i < nums.length; ++i) {
			desc[i] = nums[i];
		}
		// 내림차순 조건 계산.
		for (int i = 0; i < desc.length; ++i) {
			for (int j = 0; j < i; ++j) {
				if (desc[i] > desc[j]) {
					int temp = desc[j];
					desc[j] = desc[i];
					desc[i] = temp;
				}
			}
		}
		// 오름차순을 출력
		System.out.print("오름차순 : ");
		System.out.print(Arrays.toString(asc)); // asc를 문자열로 변환.

		System.out.println();

		// 내림차순을 출력
		System.out.print("내림차순 : ");
		System.out.print(Arrays.toString(desc)); // desc를 문자열로 변환
	}
}
