package quiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class E04_Save {

	/*
	  1. 컴퓨터와 진행하는 간단한 가위바위보를 만든 후
	  2. 프로그램 종료시 전적을 파일에 저장하고 
	  3. 프로그램 실행시에는 파일에 저장된 전적 데이터를 읽어 예전 전적이 그대로 이어지도록 만들어보세요.

	 */
	static int comWin;
	static int userWin;
	static int comLose;
	static int userLose;
	static int draw;

	static int[] record = new int[3];

	public static void loadGame() {
		try {
			FileInputStream in = new FileInputStream("myFiles/game.txt");

			while(true) {
				comWin = in.read();
				comLose = in.read();
				userWin = in.read();
				userLose = in.read();
				draw = in.read();
				in.close();
				break;
			}
		} catch (IOException e) {
			System.out.println("Load도중 에러 발생");
		}
		System.out.println("불러오기 완료");
	}

	public static void saveGame() {

		try {
			FileOutputStream out = new FileOutputStream("myFiles/game.txt");
			out.write(comWin);
			out.write(comLose);
			out.write(userWin);
			out.write(userLose);
			out.write(draw);
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

		int record = 0;
		while (true) {
			System.out.println("유저 : " + "승리 : " +  userWin + " 패배 : " + userLose);
			System.out.println("컴퓨터 : " + "승리 : " + comWin + " 패배 : " + comLose);
			System.out.println("무승부 : " + draw);
			System.out.print("가위, 바위, 보 중 하나를 입력하세요.");
			String user = sc.next();
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
			int[] winCount = new int[2];
			if (user.equals(result)) {
				System.out.println("무승부");
				draw++;
			} else if (!user.equals(result) && result.equals("가위") && user.equals("보")) {
				System.out.println("컴퓨터 승리");
				comWin++;
				userLose++;
				continue;
			} else if (!user.equals(result) && result.equals("보") && user.equals("가위")) {
				System.out.println("유저 승리");
				userWin++;
				comLose++;
				continue;
			} else if (!user.equals(result) && result.equals("바위") && user.equals("보")) {
				System.out.println("유저 승리");
				userWin++;
				comLose++;
				continue;
			} else if (!user.equals(result) && result.equals("가위") && user.equals("바위")) {
				System.out.println("유저 승리");
				userWin++;
				comLose++;
				continue;
			} else if (!user.equals(result) && result.equals("보") && user.equals("바위")) {
				System.out.println("컴퓨터 승리");
				comWin++;
				userLose++;
				continue;
			} else if (!user.equals(result) && result.equals("바위") && user.equals("가위")) {
				System.out.println("컴퓨터 승리");
				comWin++;
				userLose++;
				continue;
			} 
		}
	}
}
