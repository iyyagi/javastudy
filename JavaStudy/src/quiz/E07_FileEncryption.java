package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E07_FileEncryption {

	/*
	  	frankenstein.txt를 시저 암호화 한 파일
	  	frankenstein.encrypted.enc를 생성해 보세요.
	 */
	private static String allText = read();
	private static String allText2 = encryptRead();
	private final static String UPPER_CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private final static String LOWER_CHARSET = "abcdefghijklmnopqrstuvwxyz";
	static int key;

	public E07_FileEncryption(int key) {
		this.key = key;
	}

	public static String encryptRead() {
		File book = new File("./write_test/frankenstein.encrypted.enc");
		StringBuilder sb = new StringBuilder();
		try {
			FileReader fin = new FileReader(book);
			BufferedReader in = new BufferedReader(fin);
			String line;
			while((line = in.readLine()) != null) {
				sb.append(line);
				sb.append('\n');
			}
			in.close();
			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}


	public static String read() {
		File book = new File("myFiles/frankenstein.txt");
		StringBuilder sb = new StringBuilder();

		try {
			FileReader fin = new FileReader(book);
			BufferedReader in = new BufferedReader(fin);
			String line;
			while((line = in.readLine()) != null) {
				sb.append(line);
				sb.append('\n');
			}
			in.close();
			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	public static void  encryptFile(int key) {
		StringBuilder sb = new StringBuilder(allText);
		int len = sb.length();
		for (int i = 0; i < len; ++i) {
			char ch = sb.charAt(i);
			int index = 0, len2 = 0;
			if (Character.isUpperCase(ch)) {
				len2 = UPPER_CHARSET.length();
				index = ch - 'A' + key % len2;
				index = index > len2 -1 ? index - len2 : index;
				ch = UPPER_CHARSET.charAt(index);
			} else if (Character.isLowerCase(ch)) {
				len2 = LOWER_CHARSET.length();
				index = ch - 'a' + key % len2;
				index = index > len2 -1 ? index - len2 : index;
				ch = LOWER_CHARSET.charAt(index);
			}
			sb.setCharAt(i, ch);
		}
		try (
				FileWriter fout = new FileWriter("./write_test/frankenstein.encrypted.enc");
				BufferedWriter out = new BufferedWriter(fout);
				) {
			out.write(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void decryptFile (int key) {
		StringBuilder sb = new StringBuilder(allText2);
		int len = sb.length();
		int index, len2;
		for (int i = 0; i < len; ++i) {
			char ch = sb.charAt(i);
			if (Character.isUpperCase(ch)) {
				len2 = UPPER_CHARSET.length();
				index = ch - 'A' - key % len2;
				index = index < 0 ? index + len2 : index;
				ch = UPPER_CHARSET.charAt(index);
			} else if (Character.isLowerCase(ch)) {
				len2 = LOWER_CHARSET.length();
				index = ch - 'a' - key % len2;
				index = index < 0 ? index + len2 : index;
				ch = LOWER_CHARSET.charAt(index);
			}
			sb.setCharAt(i, ch);
		}
		try (
				FileWriter fout = new FileWriter("./write_test/frankenstein.decrypted.enc");
				BufferedWriter out = new BufferedWriter(fout);
				) {
			out.write(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		encryptFile(5);
		decryptFile(5);
	}
}
