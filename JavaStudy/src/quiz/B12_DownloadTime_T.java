package quiz;

import java.util.Scanner;

public class B12_DownloadTime_T {
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

		System.out.print("몇 초? ");
		int downloadTime = sc.nextInt();
		// final이 붙어 있으면 나중에 수정을 할 수 없다. 
		// 영원히 변하지 않을 값은 변수를 모두 대문자로 지정한다.
		final int MINUTE = 60;
		final int HOUR = MINUTE * 60;
		final int DAY = HOUR * 24;

		if (downloadTime >= DAY) {
			System.out.printf("%d일 %d시 %d분 %d초",
					downloadTime / DAY, 
					downloadTime % DAY / HOUR, 
					downloadTime % HOUR / MINUTE, 
					downloadTime % MINUTE );
		} else if (downloadTime > 3600) {
			System.out.printf("%d시간 %d분 %d초\n", 
					downloadTime / 3600, 
					downloadTime % 3600 / 60,
					downloadTime % 60);

		} else if (downloadTime >= MINUTE) {
			System.out.printf("%d분 %d초\n", 
					downloadTime / 60, 
					downloadTime % 60 );
		} else {
			System.out.printf("%d초\n", downloadTime);
		}
	}
}
