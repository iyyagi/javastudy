package database.quiz.dataaccess;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import database.quiz.datamodel.GameUser;

public class DatabaseAccess {
	// 0.
	private static String driver = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private static String id = "testuser";
	private static String password = "1234";

	
	// 7.
	private static List<Integer> boxItems = new ArrayList<>();
	
	// 1.
	// 드라이버 호출은 프로그램 실행 시 최초 1번이면 충분하다.(static 블록)
	static {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// 7. 첫 로그인이 시작되는 메서드
		// 아이템 뽑기 배열 생성
		// 최초의 DB Access 발생 시 아이템 뽑기 배열 생성
		try (
				Connection conn = myConnection();
				PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM items");
				ResultSet rs = pstmt.executeQuery();
				) {
			while (rs.next()) {
				// 확률만큼 뽑기 배열에 추가하여 확률 생성
				// 8.
				int prob = Math.round(rs.getFloat("probability") * 100);

				for (int i = 0; i < prob; ++i) {
					boxItems.add(rs.getInt("items_id"));
				}
			}
			Collections.shuffle(boxItems);
			System.out.println(boxItems);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static Connection myConnection() throws SQLException {
		return DriverManager.getConnection(url, id, password);	
	}
	
	// 11. 리스트 출력
	public static void printView(GameUser user) {
		String view = "SELECT * FROM ownitem INNER JOIN gameuser USING (user_id) INNER JOIN items USING(items_id)"
				+ "WHERE user_id = ?"; 

		try (
				// 객체지향적으로 만들어 보기
				Connection conn = myConnection();
				PreparedStatement pstmt = conn.prepareStatement(view);
				){
			pstmt.setString(1, user.getUser_id());
			try(ResultSet rs = pstmt.executeQuery()) {
				while(rs.next()) {
					System.out.printf("%d\t%s\t%d\t%s\t%d\t%s\t%f\n",
							rs.getInt("items_id"),
							rs.getString("user_id"),
							rs.getInt("own_id"),
							rs.getDate("own_date"), 
							rs.getInt("gold"),
							rs.getString("items_name"),
							rs.getDouble("probability")
							);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 6.
	public static void openBox(GameUser user) {
		int gold = user.getGold();

		if (gold < 1000) {
			System.out.println("소지금이 부족합니다......");
			return;
		}
		// 9.
		// 1. DB의 소지금을 감소
		// 2. 아이템 목록에 추가하기
		// 3. 뽑은아이템 출력

		String reduceGold = "UPDATE gameuser SET gold = gold-1000 WHERE user_num = ?";
		String addOwnItem = "INSERT INTO ownitem VALUES (ownitem_seq.nextval, ?, ?, sysdate)";
		String getItem = "SELECT * FROM items WHERE items_id = ?";

		try (
				// 객체지향적으로 만들어 보기
				Connection conn = myConnection();
				PreparedStatement pstmt1 = conn.prepareStatement(reduceGold);
				PreparedStatement pstmt2 = conn.prepareStatement(addOwnItem);
				PreparedStatement pstmt3 = conn.prepareStatement(getItem);

				){
			// 확률대로 뽑은 아이템의 번호
			int item_id = boxItems.get((int)(Math.random() * boxItems.size()));

			// ? 채우기
			pstmt1.setInt(1, user.getUser_num());
			pstmt2.setString(1, user.getUser_id());
			pstmt2.setInt(2, item_id);
			pstmt3.setInt(1, item_id);

			// 다 만든 쿼리문 실행하여 DB에 반영하기
			pstmt1.executeUpdate();
			pstmt2.executeUpdate();

			// 뽑은 아이템 가져와서 출력해주기
			ResultSet rs = pstmt3.executeQuery();
			rs.next();
			System.out.printf("%s님이 %s를 뽑으셨습니다.\n", user.getUser_id(), rs.getString("items_name"));
			user.setGold(gold - 1000);

			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 2.
	public static GameUser login(String userId, String userPassword) {
		String sql = "SELECT * FROM gameuser WHERE user_id = ?";
		try (
				Connection conn = myConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				)
		{

			pstmt.setString(1, userId);

			// 3. -> datamodel GameUser
			try (ResultSet rs = pstmt.executeQuery()) {
				GameUser user = null;
				if (rs.next()) {
					// GameUser 클래스로 전달한다.
					user = new GameUser(
							rs.getInt(1),
							rs.getString(2),
							rs.getString(3),
							rs.getInt(4)
							);
				}
				// 4.
				// userId의 사용자가 없어서 조회가 안된 경우
				if (user == null) {
					return null;
				} else {
					// userId가 조회되면 password를 조회
					if (user.getUser_password().equals(userPassword)) {
						// 비밀번호에 맞춰서 로그인에 성공하는 경우 정보를 리턴
						return user;

					} else {
						// 비밀번호 틀려서 로그인 실패하는 경우
						return null;
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
