package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class E07_FileEncryption_T {


	public static File encryptedFile(File f, int key) throws Exception {

		if (!f.isFile()) {
			throw new Exception("파일이 아닙니다.");
		} else if (!f.getName().endsWith(".txt")) {
			throw new Exception(".txt 파일만 암호화할 수 있습니다.");
		}

		//		System.out.println(f);
		//		System.out.println(f.isFile());
		//		System.out.println(f.getName());
		//		System.out.println(f.getParent());
		//		System.out.println(f.getParentFile());
		// replace(old, new) : 문자 치환
		// replaceAll(regex, new) : 정규표현식을 이용한 치환
		System.out.println(f.getName().replaceAll("[.].+", "_encrypted.enc"));
		File encryptedFile = new File(f.getParentFile(), f.getName().replaceAll("[.].+", "_encrypted.enc"));
		try (
				FileReader fin = new FileReader(f);
				BufferedReader in = new BufferedReader(fin);
				FileWriter fout = new FileWriter(encryptedFile);
				BufferedWriter out = new BufferedWriter(fout);
				) {
			D09_CaesarCipher cryptoTool = new D09_CaesarCipher(key);

			String line;

			while ((line = in.readLine()) != null) {
				out.append(cryptoTool.encrypt(line));
				out.append('\n');
			}
		}
		return encryptedFile;
	}
	
	public static File decryptedFile(File f, int key) throws Exception {
		
		if (!f.isFile()) {
			throw new Exception("파일이 아닙니다.");
		} else if (!f.getName().endsWith(".enc")) {
			throw new Exception(".enc 파일만 암호화할 수 있습니다.");
		}
		File decryptedFile = new File(f.getParent(), f.getName().replaceAll("[.].+", "_decrypted.enc"));
		
		try (FileReader fin = new FileReader(f);
				BufferedReader in = new BufferedReader(fin);
				FileWriter fout = new FileWriter(decryptedFile);
				BufferedWriter out = new BufferedWriter(fout);) {
			D09_CaesarCipher cryptoTool = new D09_CaesarCipher(key);

			// in.readLine()이 null 값이 아닐 때 까지 읽는다.
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
			encryptedFile(new File("myFiles/frankenstein.txt"), 10);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
		
		
		try {
			decryptedFile(new File("myFiles/frankenstein_encrypted.enc"), 10);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("복호화 완료");
	}
}
