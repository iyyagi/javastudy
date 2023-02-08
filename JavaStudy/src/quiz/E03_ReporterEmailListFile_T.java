package quiz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E03_ReporterEmailListFile_T {

	public static void main(String[] args) {

		Pattern emailPattern = Pattern.compile("\\S+@\\S+");
		Matcher matcher = emailPattern.matcher(D10_ReporterEmailList.text);
		int i = 0; 

		try {
			FileOutputStream out = new FileOutputStream("myFiles/email_list.txt");
			while (matcher.find()) {
				out.write(matcher.group(0).getBytes());
				out.write('\n');
			}
			out.close();
		} catch (Exception e) {
			System.out.println("파일을 찾을 수 없거나 쓰기 도중 에러 발생...");
		}
		System.out.println("프로그램 종료");
	}
}
