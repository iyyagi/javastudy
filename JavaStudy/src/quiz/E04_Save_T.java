package quiz;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class E04_Save_T {

	/**

	 * @return 0 - 플레이어 승리, 1 - 무승부, 2 플레이어 패배
	 */

	public static int game() {
		return (int)(Math.random() * 3);
	}


	public static void main(String[] args) {
		int[] record = new int[3];

		// 전적을 불러와야 한다(Load)
		FileReader in = null;
		try {
			in = new FileReader("myFiles/save.game");

			record[0] = in.read();
			record[1] = in.read();
			record[2] = in.read();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in !=null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("불러온전적" + Arrays.toString(record));
		System.out.println("게임시작");
		for (int i = 0; i < 1000; ++i) {
			int result = game();
			System.out.println("결과 : " + result);

			record[result] += 1;
		}
		System.out.println("전적 : " + Arrays.toString(record));

		// 전적을 저장하고 마무리(Save)
		FileWriter out = null;
		try {
			out = new FileWriter("myFiles/save.game");
			// 여기서 전적을 숫자로 저장해도 파일을 보려할 때 문자로 해석한다.
			out.write(record[0]);
			out.write(record[1]);
			out.write(record[2]);
		} catch (Exception e) {
			System.out.println("스트림 생성 또는 쓰기 도중 에러 발생");
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					System.out.println("닫기 도중 에러 발생");
				}
			}
		}
	}
}
