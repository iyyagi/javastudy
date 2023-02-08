package quiz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

public class E05_SaveToChar {

	/*
	  전적을 FileReader와 FileWiter를 사용해 저장해 보세요.

	 */
	
	static int comWin;
	static int userWin;
	static int comLose;
	static int userLose;
	static int draw;
	static int[] winCount = new int[3];


	public static void loadGame() {
		try {
			FileReader in = new FileReader("myFiles/game.txt");
				winCount[0] = in.read();
				winCount[1] = in.read();
				winCount[2] = in.read();


			in.close();
		} catch (IOException e) {
			System.out.println("Load도중 에러 발생");
		}
		System.out.println("불러오기 완료");
	}

	public static void saveGame() {

		try {
			FileWriter out = new FileWriter("myFiles/game.txt");

			out.write(winCount[0]);
			out.write(winCount[1]);
			out.write(winCount[2]);
		
			out.close();

		} catch (IOException e) {
			System.out.println("Write 중 에러 발생");
		}
		System.out.println("저장 완료");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		String[] rockPaperScissors = {"가위", "바위", "보"};
		int cnt = 0;

		while (true) {
			System.out.println("유저 전적 : " + "승 " + winCount[0] + " 무승부 " +  winCount[1] + " 패배 " +winCount[2]);
			String user = "";
			
			System.out.print("가위, 바위, 보 중 하나를 입력하세요.");
			user = sc.next();

			String result = "";
			for (int i = 0; i < rockPaperScissors.length; ++i) {
				result = rockPaperScissors[r.nextInt(rockPaperScissors.length)];
			}

			if (user.equals("SAVE")) {
				saveGame();
				break;
			}
			
			if (user.equals("LOAD")) {
				loadGame();
				continue;
			}
			
			System.out.println("컴퓨터 입력 : " + result);
		
			if (user.equals(result)) {
				System.out.println("무승부");
				winCount[1]++;
			} else if (!user.equals(result) && result.equals("가위") && user.equals("보")) {
				System.out.println("컴퓨터 승리");
				winCount[2]++;
				continue;
			} else if (!user.equals(result) && result.equals("보") && user.equals("가위")) {
				System.out.println("유저 승리");
				winCount[0]++;
				continue;
			} else if (!user.equals(result) && result.equals("바위") && user.equals("보")) {
				System.out.println("유저 승리");
				winCount[0]++;
				continue;
			} else if (!user.equals(result) && result.equals("가위") && user.equals("바위")) {
				System.out.println("유저 승리");
				winCount[0]++;
				continue;
			} else if (!user.equals(result) && result.equals("보") && user.equals("바위")) {
				System.out.println("컴퓨터 승리");
				winCount[2]++;
				continue;
			} else if (!user.equals(result) && result.equals("바위") && user.equals("가위")) {
				System.out.println("컴퓨터 승리");
				winCount[2]++;
				continue;
			}
		}
	}
}
