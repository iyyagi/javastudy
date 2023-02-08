
package quiz;

public class B13_RandomScore {
	/*
	 
	  1.학생 100명의 점수(0 ~ 100)를 랜덤으로 생성하여 배열에 저장
	  
	  2. 배열에 저장된 값을 한 줄에 10개씩 출력하세요.
	  
	  3. 모든 학생들의 평균 점수를 출력(소수 둘째 자리까지 출력)
	  
	  4. 배열에 저장된 값들 중 가장 낮은 점수와 가장 높은 점수를 출력
	*/
	public static void main (String[] args) {

		int[] student = new int[100]; // 0 ~ 99
		int sum = 0;
		int MAX = student[0];
		int MIN = student[0];
		double avg = 0;
		for (int i = 0; i < 100; ++i) {
			student[i] = (int)(Math.random() * 101);
			// 줄바꿈
			if (i % 10 == 9) {
				System.out.printf("%3d", student[i]);
				System.out.println();
			} else {
				System.out.printf("%3d ", student[i]);
			}
			

			sum += student[i];	
		}
		System.out.println();
		avg = sum / 100.0;
		System.out.println("평균 점수 : " + Math.round(avg *100) / 100.0);
		System.out.println("최대값 : " + MAX);
		System.out.println("최소값 : " + MIN);
	}
}
