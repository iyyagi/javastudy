package quiz;

import java.util.Arrays;

public class B15_Array2Quiz {

	/*



	 */
	public static void main(String[] args) {

		int[][] numArr = {
				{1, 1, 1, 1,},
				{1, 1, 1,},
				{1, 1, 1, 1, 1, 1, 1, 1},
				{1, 1},
				{1, 1, 1, 1},
		};
		// 2. 랜덤으로 바뀐 모든 값의 총합과 평균(소수점 둘째자리)을 구하기
		int sum = 0;
		double avg = 0;
		int count = 0;
		for (int i = 0; i < numArr.length; ++i) {
			for(int j = 0; j < numArr[i].length; ++j) {
				// 1. numArr의 모든 값을 100 ~ 200 사이의 랜덤 정수로 바꾸기
				numArr[i][j] = (int)(Math.random() * 101 + 100);
				++count;
				sum += numArr[i][j];
			}
			System.out.println(Arrays.toString(numArr[i]));
		}
		// 3. numArr의 각 행(row)의 합을 구해서 출력하기
		// numArr[i].length : 내부에 있는 i번째 배열의 길이를 의미한다.
		int rowSum[] = new int[numArr.length];
		// numArr.length : 배열이 몇 개 있는지를 의미함
		for (int i = 0; i < numArr.length; ++i) {
			// numArr[i].length : 내부에 있는 i번째 배열의 길이를 의미한다,
			for (int j = 0; j < numArr[i].length; ++j) {
				if (j == numArr[i][j]) {
					break;
				}
				rowSum[i] += numArr[i][j];
				
			}
			System.out.printf("i[%d]번째 행의 합 : %d\n", i, rowSum[i]);
		}
		System.out.println("=======================================");
//		// 4. numArr의 각 열(column)의 합을 구해서 출력하기
//		int columnSum[] = new int[numArr.length];
//		// numArr.length : 배열이 몇 개 있는지를 의미함
//		// numArr[i].length : 내부에 있는 i번째 배열의 길이를 의미한다,
//		for (int i = 0; i < numArr[i].length; ++i) {
//			for (int j = 0; j <= numArr.length; ++j) {
//				if (j == numArr.length) {
//					++i;
//					break;
//				}
//				columnSum[i] += numArr[i][j];	
//			}
//			System.out.printf("i[%d]번째 열의 합 : %d\n", i, columnSum[i]);
//		}
		


		System.out.println("배열 안의 총 개수" + count);
		System.out.println("합계 : " + sum);
		System.out.printf("평균: %.2f\n" , sum / 21.0);


	}
}
