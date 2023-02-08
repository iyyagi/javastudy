package quiz;

import java.util.Scanner;

public class B01_CeltoFahr {

	/*
	  사용자로부터 섭씨(℃) 온도를 화씨(℉)로 몇도인지
	  알려주는 프로그램을 만들어 보세요
	  (온도 변환 공식은 구글링 할 것)
	*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double f = 0;
		System.out.print("섭씨(℃)를 입력하세요 : >> ");
		double c = sc.nextDouble();
		f = (c * 9/5) + 32; 
		System.out.printf("화씨(℉)는 : %.2f", f );
		
		/* 강사님 문제풀이
		public static void main(String[] args) {
			// Celcius 
			//(0°C × 9/5) + 32 = 32°F 공식
			 
			Scanner sc = new Scanner(System.in);
			
			double celcius, fahrenheit;
			
			System.out.print("섭씨 온도를 입력 >> ");
			celcius = sc.nextDouble();
			
			fahrenheit = 32 + celcius * 9/5;
			
			System.out.printf("섭씨 %.1f℃는 화씨 %.1f℉입니다.\n, celcius, fahrenheit);
			
		}  
		 
		*/
		
	}
	
}
