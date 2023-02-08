package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class E06_Copy {

	/*
	  프로그램을 실행하면 images 폴더를 그대로 복사한 새로운 폴더를 생성하는 프로그램을 만드세요


	 */


	public static void copyDirectory(File src, File dst) throws Exception {

		if (!src.isDirectory()) {
			throw new Exception("디렉토리만 전달 하세요");
		}

		if (!src.exists()) {
			throw new Exception("복사할 파일 경로 틀림");
		}

		if (!dst.exists()) {
			throw new Exception("목적지 경로 틀림");
		}

		// src : images
		// dst : myFiles
		// to_copy : myFiles/images/
		File to_copy = new File(dst, src.getName());
		// myFiles/images/
		to_copy.mkdir();

		// 원본 폴더인 images/ 내부의 파일들
		for (File f : src.listFiles()) {
			if (f.isDirectory()) {
				copyDirectory(f, to_copy); // f = images/apple.jpg, to_copy = myFiles/apple.jpg
			} else if (f.isFile()) {
				copyFile(f, new File(to_copy, f.getName()));
			}
		}
	}
	public static void copyFile(File srcFile, File dstFile) {

		//FileReader in = null;
		//FileWriter out = null;
		
		// 이미지, 영상 등 자료를 복사할 때에는 byte로 복사해야 한다.
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream(srcFile);
			out = new FileOutputStream(dstFile);
			out.write(in.readAllBytes());
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) in.close();
				if (out != null) out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void copy(File src, File dst) {
		File to_copy = new File(dst, src.getName());
		System.out.println("========================================");
		System.out.println("원본의 위치 : " + src);
		System.out.println("복사해야 하는 위치" + to_copy);
		if (src.isDirectory()) {
			//디렉토리면 디렉토리 생성
			to_copy.mkdir();
		} else if (src.isFile()) {
			copyFile(src, to_copy);
		} else {
			System.out.println("?? 복사 종료");
		}
	}

	public static void main(String[] args) {

		try {
			copyDirectory(new File("images/"), new File("images_copy"));
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
