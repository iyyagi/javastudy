package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class E07_FileDecryption {
	/*

	  	암호화 된 파일의 맨 위부터 50줄을
	  	key 1 ~ 25으로 복호화한 샘플을 보여준 후
	  	어떤 key로 복호화할지 선택하면
	  	해당 키값으로 복호화한 frankenstein_decrypted.txt가 생성되도록 만들어보세요

	 */
	static Scanner sc = new Scanner(System.in);
	static int keyValue = 0;

	public static File testToolFile(File f, int key) throws Exception {
	 
		if (!f.isFile()) {
			throw new Exception("파일이 아닙니다.");
		} else if (!f.getName().endsWith(".enc")) {
			throw new Exception(".enc 파일만 암호화할 수 있습니다.");
		}
		File testToolFile = new File(f.getParent(), f.getName().replaceAll("[_].+", "_decrypted.txt"));

		try (FileReader fin = new FileReader(f);
				BufferedReader in = new BufferedReader(fin);
				) {
			D09_CaesarCipher testTool = new D09_CaesarCipher(key);
			StringBuilder sb = new StringBuilder();
			String line;
			for (int i = 0; i < 50; ++i) {
				line = in.readLine();
				sb.append(testTool.decrypt(line));
				sb.append('\n');
			}
			System.out.println(sb.toString());	
		} 
		return testToolFile;
	}

	public static File decryptedFile(File f, int keyValue) throws Exception {
		if (!f.isFile()) {
			throw new Exception("파일이 아닙니다.");
		} else if (!f.getName().endsWith(".enc")) {
			throw new Exception(".enc 파일만 암호화할 수 있습니다.");
		}
		
		File decryptedFile = new File(f.getParent(), f.getName().replaceAll("[_].+", "_decrypted.txt"));

		try (FileReader fin = new FileReader(f);
				BufferedReader in = new BufferedReader(fin);
				FileWriter fout = new FileWriter(decryptedFile);
				BufferedWriter out = new BufferedWriter(fout);) {
			D09_CaesarCipher cryptoTool = new D09_CaesarCipher(keyValue);

			String line;

			while ((line = in.readLine()) != null) {
				out.append(cryptoTool.decrypt(line));
				out.append('\n');
			}
		} 
		return decryptedFile;
	}

	public static void main(String[] args) {

		try {
			for (int i = 0; i <= 25; ++i) {
				System.out.println("====================");
				System.out.println(i + "번째 키값");
				System.out.println("====================");
				testToolFile(new File("myFiles/frankenstein_encrypted.enc"), i);
			}

			System.out.println("몇번째 키값으로 복구하시겠습니까?");
			keyValue = sc.nextInt();
			decryptedFile(new File("myFiles/frankenstein_encrypted.enc"), keyValue);


		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("복호화 완료");
	}
}
