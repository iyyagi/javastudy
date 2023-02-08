import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import javax.swing.JFrame;

public class E08_PrintStream {

	/*
	  # PrintStram, PrintWriter
	   - 좀 더 편리하게 출력하기 위한 기능들을 스트림에 추가해주는 클래스
	   - println(), printf(), print()....
	   - BufferedWriter - > 기존 스트림에 성능을 추가
	   - PrintStream	- > 기존 스트림에 편리 기능 추가
	   - PrintWriter 	- > 기존 Writer에 편리 기능 추가
	*/
	
	public static void main(String[] args) {
		
		try (
		
				
			FileWriter fout = new FileWriter(
				new File("myFiles/print.txt"), true);
			 PrintWriter out = new PrintWriter(fout);
				
				FileOutputStream fout2 = new FileOutputStream(
						new File("myFiles/print2.txt"), true);
				// BufferedOutputStream을 사용해서 스트림을 감싸 PrintStream의 성능을 높일 수 있다.
				BufferedOutputStream bout2 = new BufferedOutputStream(fout2);
						PrintStream out2 = new PrintStream(fout2);
				
		) {
			
			// System -> System클래스에 static 메서드
			// out -> PrintStream
			out.printf("%d.%d.%d.%d\n", 123, 255, 101, 55);
			out.println("Hello, world");
			out2.println("  /)/)");
			out2.println(" (  ..)");
			out2.println(" (  >$)");
			out2.println("Have a nice day");
		} catch (IOException e) {
			e.printStackTrace();
		} 
		System.out.println("프로그램 종료");
	}
}
