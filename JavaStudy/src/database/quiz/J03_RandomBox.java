package database.quiz;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import database.quiz.dataaccess.DatabaseAccess;

import database.quiz.datamodel.GameUser;

public class J03_RandomBox {

	/*
	  사용자가 실행할때마다 무언가를 랜덤으로 뽑는 프로그램을 만들어 주세요.

	   (1) 랜덤으로 뽑는 물건은 자유(축구선수, 농구선수.. 가전제품)

	   (2) 사용자에게는 재화가 있어서 재화를 다 쓰면 뽑기가 취소되어야 한다.(돈, 다이아몬드, 루비...)

	   (3) 모든 상품은 각자의 확률대로 뽑혀야 한다.

	   (4) 사용자 구분은 별도의 인증 없이 ID와 비밀번호로 인증하면 뽑기를 진행할 수 있다.	 

	   회원 (아이디PK, 비밀번호, 소지금)
	   소유아이템 (소유 아이디 PK, 회원 아이디FK, 아이템 아이디FK, 획득시간)
	   아이템 (아이템 번호, 이름, 이미지 파일, 확률)


	 */
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("아이디를 입력해 주세요.");
		String userId = in.readLine();
		System.out.println("비밀번호를 입력해 주세요.");
		String userPassword = in.readLine();
		// 5.
		GameUser userInfo = DatabaseAccess.login(userId, userPassword);
		
		while (true) {
			System.out.println(userInfo.getUser_id() + "님이 가지고 있는 골드 "
					+ userInfo.getGold());
			int select = -1;
			try {
				System.out.print("1. 뽑기  2. 목록보기  3. 그만하기\n >>");
				// String 타입의 숫자를 int로 변환하기 위해 Integer.parseInt를 사용한다.
				select = Integer.parseInt(in.readLine().trim());
				if (select < 1 || select > 3) {
					continue;
				}
			} catch (NumberFormatException e) {
				continue;
			}
			// 10. 뽑기 선택 시 아이템 출력
			if (select == 1) {
				DatabaseAccess.openBox(userInfo);
			} else if (select == 2) {
				DatabaseAccess.printView(userInfo);
			} else if (select == 3) {
				System.out.println("그만하기를 선택하셨습니다.");
				break;
			}
		}
	}
}
