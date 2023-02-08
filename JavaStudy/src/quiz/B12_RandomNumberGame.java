package quiz;

import java.util.Random;
import java.util.Scanner;

public class B12_RandomNumberGame {

	/*
		1. 프로그램이 시작되면 1 ~ 200사이의 랜덤 숫자를 정답으로 선택한다.

		2. 사용자가 숫자를 입력하면 Up인지 Down인지 알려준다.
			(잘못된 숫자가 입력되면 다시 입력)
		3. 사용자가 정답을 맞추면 몇번만에 맞췄는지 출력해주고 프로그램을 종료한다.

		4. 5번 안에 못맞추면 정답이 뭐였는지 출력해주고 프로그램을 종료한다.

	 */


	public static void main(String[] args) {
		Random ran = new Random();
		int fact = ran.nextInt(200)+1;

		System.out.print("숫자를 입력하세요 >>");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 1;
		System.out.println(fact);
		for (int i = 0; i < 5; ++i) {
			if (num < 0) {
				System.out.print("숫자를 다시 입력하세요");
				num = sc.nextInt();
			}else if (num < fact) {
				if (count == 5) {
					break;
				} else {
					System.out.println("Up");
					System.out.print("숫자를 입력하세요");
					num = sc.nextInt();
					count++;
				}
			} else if (num > fact) {
			
				if (count == 5) {
					break;
				} else {
					System.out.println("Down");
					System.out.print("숫자를 입력하세요");
					num = sc.nextInt();
					count++;
				}
			} else {
				System.out.printf("총 %d회만에 정답 %d를 맞췄습니다.!!! ", count, fact);
			} 
		}
		System.out.printf("총 %d회 사용했으며 못맞췄습니다. 정답은 %d입니다.", count,  fact);


	}
}
