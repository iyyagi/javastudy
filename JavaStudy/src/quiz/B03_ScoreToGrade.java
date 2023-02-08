package quiz;

import java.util.Scanner;

public class B03_ScoreToGrade {

	/*
	 	국어, 영어, 수학 점수를 차례대로 입력받아 평균점수를 구한 후에
	 	각 과목 점수, 평균 점수, 등급을 출력해 주는 프로그램을 만들어보세요.
	 	
		90점 이상 A
		80점 이상 B
		70점 이상 C
		60점 이상 D
		그 외 F
		
		2. 유효한 점수는 0 ~ 100점이다. (유효하지 않은 점수가 하나라도 있다면 F)
		
		3. 평균 점수는 출력 시 소수 둘째 자리에서 반올림하여 저장
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		double avg = 0;
		int sum = 0;
		String grade = "";
		
		System.out.println("국어 점수를 입력해 주세요 >> ");
		kor = sc.nextInt();
		System.out.println("영어 점수를 입력해 주세요 >> ");
		eng = sc.nextInt();
		System.out.println("수학 점수를 입력해 주세요 >> ");
		math = sc.nextInt();
		
		sum = kor + eng + math;
		avg =  Math.round((double)sum / 3 * 10) / 10.0;
		
		if(kor <= 0 || eng <= 0 || math <= 0 || kor >= 100 || eng >= 100 || math >= 100 ) {
			System.out.print("유효하지 않는 점수가 있습니다."); 
		  grade = "F";

		}else if(avg >= 90) {
			grade = "A";
			
		}else if(avg >= 80) {
			grade = "B";

		}else if(avg >= 70) {
			grade = "C";
			
		}else if(avg >= 60) {
			grade = "D";
						
		}else {
			grade = "F";
			
		}
		System.out.printf("국어 점수 %d, 영어 점수 %d, 수학 점수 %d, 합계 점수 %d, 평균 점수 %.1f 등급은 %s", kor, eng, math, sum, avg, grade);
	}

}
