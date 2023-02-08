package quiz;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

public class E05_SaveToChar_T {




	public static void main(String[] args) {
		int[] record = new int[3];

		try {
			FileReader in = new FileReader("myFiles/record2.sav");
			//			record[0] = in.read();
			//			record[1] = in.read();
			//			record[2] = in.read();
			char[] buffer = new char[20];
			int len = in.read(buffer);
			String recordData = new String(buffer, 0, len);
			String[] split = recordData.split(",");
			for (int i = 0; i < split.length; ++i) {
				record[i] = Integer.parseInt(split[i]);
			}

			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("세이브 파일을 찾을 수 없습니다. 새로 시작합니다.");
		} catch (IOException e) {
			System.out.println("읽기 도중 문제 발생.");
		}


		System.out.println("시작할 때 전적 : " + Arrays.toString(record));


		for (int i = 0; i < 20000; ++i) {
			int result = E04_Save_T.game();
			//System.out.println("결과 : " + result);
			record[result] += 1;
		}
		System.out.println("종료 전적 : " + Arrays.toString(record));
		try {
			FileWriter out = new FileWriter("myFiles/record2.sav");
			// 문자열로 변환하면 65535개 이상으로 저장이 가능함
			out.write(String.format("%d,%d,%d", record[0], record[1], record[2]));
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("저장 완료");

	}
}