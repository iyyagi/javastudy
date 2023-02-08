package quiz;

import java.util.Scanner;

public class B12_DownloadTime {
	/*
	 사용자로부터 다운로드 시간을 초 단위로 입력 받으면
	 x일 x시간 x분 x초 남았는지 환산하여 출력해보세요.
	 (필요 없는 단위는 출력하지 않아야 함)
	 >> 600
	 -> 10분 0초  // 일과 시간은 나오지 않아야 함
	 
	 >> 86756
	 -> 1일 0시간 5분 30초
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요>>");
		int time = sc.nextInt();
		int second = time % 60;
		int minute = (time / 60) % 60; // 10분
		int hour = (time / 3600) % 24; // 1시간
		int day = time / 86400; // 1일
		if (time < 60) {
			System.out.printf("%d초", second);
		} else if (time >= 60 && time < 3600) {
			System.out.printf("%d분 %d초", minute, second);
		} else if (time >= 3600 && time < 86400) {
			System.out.printf("%d시 %d분 %d초", hour, minute, second);
		} else if (time >= 86400) {
			System.out.printf("%d일 %d시 %d분 %d초", day, hour, minute, second);
		}
		System.out.println();
	}
}
