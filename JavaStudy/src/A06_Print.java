
public class A06_Print {

	/*
	 	# 콘솔에 출력하는 함수들
	 	1. println()
	 	- ()안에 전달한 데이터는 콘솔에 출력하면서 줄을 자동으로 바꿔준다.
	 	- print() + \n
	 	
	 	2. print()
	 	- ()안에 전달한 데이터를 콘솔에 출력한다.
	 	
	 	3. printf()
	 	- print format
	 	- 서식을 이용해 원하는 출력 형태를 미리 만들어 놓는 출력 방식
	 	- 서식 문자 자리에 값을 순서대로 채워서 사용한다.
	 	- \n이 자동으로 추가되지 않으므로 주의해야 한다.
	 	
	 	* 서식 문자의 종류
	 	  %d : 해당 자리에 전달한 정수값을 10진수로 출력 (decimal)
	 	  %x : 해당 자리에 전달한 정수값을 16진수로 출력 (a ~ f 소문자)
	 	  %X : 해당 자리에 전달한 정수값을 16진수로 출력 (A ~ F 대문자)
	 	  %o : 해당 자리에 전달한 정수값을 8진수로 출력
	 	  %s : 문자열
	 	  %c : 문자
	 	  %f : 실수(float, double)
	 	  %% : %를 출력하고 싶을 때 사용
	 	  
	 	 * 서식 문자 옵션 - 서식 문자의 %와 문자 사이에 넣어서 사용한다.
	 	 1. %숫자d
	 	  - 숫자만큼 자릿수를 확보하면서 출력한다.
	 	 2. %-숫자d
	 	  - 숫자만큼 자릿수를 확보한 후 왼쪽 정렬하여 출력한다.
	 	 3. %0숫자d
	 	  - 숫자만큼 자릿수를 확보하고 빈자리에 0을 채우면서 출력한다.
	*/
	
	public static void main(String[] args) {
		int number = 10;
		System.out.printf("%10d:\n",number);
		System.out.printf("%-10d:\n",number);
		System.out.printf("%020d:\n",number);
		
		String fruitname = "Apple";
		int fruitPrice = 1500;
		System.out.printf("%-8s:%6d\n",fruitname, fruitPrice);
		double weight = 75.8753;
		
		System.out.printf("몸무게 : %.1f\n", weight); // 소수점 첫번쩨 자리만 나오게 하려면 %뒤에 .1
		System.out.printf("이자율 : %.2f%%\n", weight); // 소수점 두번째 자리까지 나오게 하려면 %뒤에.2
		
		
		
		int ch = 88;
		System.out.printf("문자 '%c'의 코드 값은 [%d] 입니다. \n", ch, ch);
		
		String name = "민수";
		String message = "Nice to meet you!";
		System.out.printf("%s 님이 남기신 메시지 입니다. %s \n", name, message);
		
		int a = 15;
		String sky = "하늘";
		char _char = '한';
		float _float = 35.711f;
		double _double = 35.721;
		System.out.printf("a에 들어있는 값은 10진수로 %d이고, 16진수로 %x 대문자 16진수로 %X %o입니다. \n",
				+ a, a, a, a);
		System.out.printf("문자열은 %s이고, 문자는 %c, 실수는 %f 입니다. %f%% \n", sky, _char, _float, _double);
		int year = 2022;
		int month = 10;
		int date = 6;
		int hour = 9;
		int minute = 26;
		int second = 1;
		
		
		System.out.println("오늘은 " + year + "년 " + month + "월 " + date + 
				"일이고, 현재 시간은 " + hour + "시 " + minute + "분 " + second 
				+ "초 입니다.");
		System.out.printf("오늘은 %d년 %d월 %d일 이고," + 
				"현재 시간은 %d시 %d분 %d초 입니다.\n", 
				year, month, date, hour, minute, second);
		
		System.out.print("Hello World\n");
		System.out.print("Hello World");
		System.out.print("Hello World\n");
		
		// for문으로 진법 계산
		/*
		 * for (int num = 1; num<=1000; ++num) {
		 * 
		 * System.out.printf("10진수 %d는 8진수로 %o, 16진수로 %x\n", num, num, num);
		 * 
		 * }
		 */
		
		
	}
	
}
