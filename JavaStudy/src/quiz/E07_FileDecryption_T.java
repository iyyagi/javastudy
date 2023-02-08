package quiz;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class E07_FileDecryption_T {

	public static void printSample(File crypto) {
		try (
//				FileReader fin = new FileReader(crypto);
//				BufferedReader in = new BufferedReader(fin);	
				
				BufferedReader in = new BufferedReader(new FileReader(crypto));
				){
			StringBuilder sampleSrc = new StringBuilder();
			for (int i = 0; i < 10; ++i) {
				sampleSrc.append(in.readLine());
				sampleSrc.append('\n');
			}
			D09_CaesarCipher cryptoTool = new D09_CaesarCipher(0);
			for (int key = 1; key <= 25; ++key) {
				cryptoTool.setKey(key);
				System.out.printf("### key %d ### \n", key);
				System.out.println(cryptoTool.decrypt(sampleSrc.toString()));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void decryptFile(File target, int key) throws IOException {
		File decryptFile = new File(target.getParent(), target.getName().replaceAll("[_].+", "_decrypted.txt"));

		try (//FileReader fin = new FileReader(target);
				BufferedReader in = new BufferedReader(new FileReader(target));
				// FileWriter fout = new FileWriter(decryptFile);
				BufferedWriter out = new BufferedWriter(new FileWriter(decryptFile));) {
			D09_CaesarCipher cryptoTool = new D09_CaesarCipher(key);

			String line;

			while ((line = in.readLine()) != null) {
				out.append(cryptoTool.decrypt(line));
				out.append('\n');
			}
		} 
	}

	public static void main(String[] args)  {
		// Scanner보다 실행속도가 훨씬 빠르다.
		//BufferedInputStream bin = new BufferedInputStream(System.in);

		// InputStream을 Reader로 업그레이드 하는 클래스
		InputStreamReader isn = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isn);

		File target = new File("myFiles/frankenstein_encrypted.enc");
		printSample(target);

		while (true) {
			try {
				System.out.println("원하는 key를 입력 >>");
				String line = in.readLine();
				
				// 공백이 들어오면 공백을 없애고 숫자로 만들어 준다.
				int key = Integer.parseInt(line.trim());
				decryptFile(target, key);
				break;
			} catch (IOException e) {
				e.printStackTrace();
			} catch (NumberFormatException e) {
				System.out.println("숫자로만 입력해 주세요..");
			}

		}

		/*
		  # Stream에 대한 close를 반드시 해야하는 이유
		   - 사실 모든 참조형 변수는 close가 필요하다.
		   - 하지만 일반적으로 참조형 변수의 닫는 타이밍은 뻔하기 때문에 자동으로 닫아주는 프로그램(Garbage Collector)이 존재한다.
		   - 하지만 Stream등 닫는 타이밍이 뻔하지 않은 클래스들은 자동으로 닫아주지 않는다.
		   - 만약 계속 닫지 않으면 결국 메모리가 가득 차서 프로그램이 운영체제에 의해 강제 종료된다.
		 
		 */
		try {
			if (in != null) in.close();
			if (isn != null) isn.close();
		} catch (IOException e) {
			System.out.println("close 도중 에러");
		}
		System.out.println("복호화 파일이 생성되었습니다.");
	}
}
