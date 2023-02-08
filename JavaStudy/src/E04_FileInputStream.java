import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

public class E04_FileInputStream {

	// byte 단위로 저장되기 때문에 -127 ~ 128까지의 숫자만 저장된다. 
	public static void main(String[] args) {
		try {
			FileInputStream in = new FileInputStream("myFiles/test.txt");
			// read() : 데이터를 한 바이트씩 읽는다. 더 이상 읽을게 없는 경우 -1을 리턴(EOF)
			//          한 바이트씩 읽기 때문에 한글 등의 2바이트 문자를 읽기가 어렵다.
			// step2
//			int result = 0;
//			while (true) {
//				result = in.read();
//				
//				if (result == -1) {
//					break;
//				}
//				System.out.print((char)result);
//			}
			
			// step1
//			for (int i = 0; i < 1000; ++i) { 
//				System.out.print((char)in.read());
//			}
			
			// step3
			// 모든 내용을 한번에 byte[]로 읽기
			byte[] allData = in.readAllBytes();
			
			// byte[]을 요구하는 문자열 생성자로 재구성 하기
			// new String에서 문자를 합쳐준다. 기본적으로 UTF-8 
			System.out.println(new String(allData));
			
			// 더 이상 안쓸거면 close
			in.close();
		} catch (Exception e) {
			System.out.println("뭔가 문제가 생김");
		} 
		System.out.println();
		System.out.println("프로그램 끝");
	}
}
