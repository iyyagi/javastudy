import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E03_JavaIO {

	/*
	  # Java IO (Input/Output)
	   - 자바는 스트림이라는 개념을 이용해 프로그램의 입/출력을 다룬다.
	   - 프로그램으로 들어오는 모든 데이터들을 입력이라고 한다.
	   - 프로그램에서 계산되어 나가는 모든 데이터들을 출력(Output)이라고 한다.
	   
	  # Stream
	   - 데이터들이 오고 가는 통로
	   - 데이터들이 프로그램으로 들어오는 통로를 InputStream이라고 한다.
	   - 데이터들이 프로그램에서 계산되어 나가는 통로를 OutputStream이라고 한다.
	   - 데이터가 Stream을 지나가기 위해서는 해당 데이터를 byte타입으로 변환시켜야 한다.
	     (byte타입이 0과 1로 변환하기 가장 쉽다)
	*/
	
	public static void main(String[] args) {
	
		try {
			// FileOutputStream의 두 번째 메개변수를 true로 하면 append모드가 된다.
			FileOutputStream out = new FileOutputStream("myFiles/test.txt", true);
			out.write(65);
			out.write(66);
			out.write(67);
			
			out.write('\n');
			// String.getBytes  : 해당 문자열을 byte[]로 변환한 값을 리턴
			out.write("Hello, File!\n".getBytes());
			// 사용한 스트림은 반드시 닫아줘야함
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("해당 경로를 못찾음");
			return;
		} catch (IOException e) {
			System.out.println("Write 도중 에러 발생...");
			return;
		}
		System.out.println("쓰기 완료");
	}
}
