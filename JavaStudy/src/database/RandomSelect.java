package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomSelect {


	public static String driver = "oracle.jdbc.driver.OracleDriver";
	public static String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	static Scanner sc = new Scanner(System.in);
	static int item_id = 0;
	static String item_name = "";
	static int item_price = 0;
	static String id;
	static String pw;

	public static void itemList() {
		try {
			Class.forName(driver);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String sql = "SELECT * FROM list INNER JOIN item USING(item_id) INNER JOIN users USING (user_id)"
				+ "WHERE user_id = ?";


		try(
				Connection conn = DriverManager.getConnection(url, "testuser", "1234");
				PreparedStatement pstmt = conn.prepareStatement(sql);

				)
		{
				pstmt.setString(1, id);
		
			try (ResultSet rs = pstmt.executeQuery()) {
			
				while(rs.next()) {
					
					System.out.printf("%8s\t%d\t%d\t%8s\t%8d\n",
							rs.getString("user_id"),
							rs.getInt("item_id"),
							rs.getInt("list_id"),
							 rs.getString("item_name"), 
							 rs.getInt("item_price")
							 );
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void itemInsert() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		String sql = "INSERT INTO list(list_id, item_id, user_id) VALUES(list_seq.nextval, ?, ?)";
		String sql2 = "UPDATE users SET user_money = user_money - ? WHERE user_id LIKE ?";
		try(
				Connection conn = DriverManager.getConnection(url, "testuser", "1234");
				PreparedStatement pstmt = conn.prepareStatement(sql);
				PreparedStatement pstmt2 = conn.prepareStatement(sql2);
				) {

			pstmt.setInt(1, item_id);
			pstmt.setString(2, id);
			pstmt2.setInt(1, item_price);
			pstmt2.setString(2, id);

			int row = pstmt.executeUpdate();
			System.out.println(row + "?????? ?????????????????????.");
			row = pstmt2.executeUpdate();
			System.out.printf(row + "?????? ???????????????" + item_price + "??? ?????????????????????.");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	
	
	public static void userList(String id, String pw) {
		try {
			Class.forName(driver);
			System.out.println();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String sql = "SELECT * FROM users";
		try(
				Connection conn = DriverManager.getConnection(url, "testuser", "1234");
				PreparedStatement pstmt = conn.prepareStatement(sql);
				)
		{
			try (ResultSet rs = pstmt.executeQuery()) {
					while (rs.next()) {
						if (rs.getString("user_id").equals(id) && rs.getString("user_pass").equals(pw)){
							System.out.println("ID??? PW??? ???????????????.");
							System.out.printf("?????? ????????? %d??? ????????? ???????????? ????????????.", rs.getInt("user_money"));
						} else {
							System.out.println("ID ?????? PW??? ???????????? ????????????.");
						}
						break;
					}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	public static void randomSelect () {
		try {
			Class.forName(driver);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String sql = "SELECT * FROM (SELECT * FROM item order by DBMS_RANDOM.RANDOM)";


		try(
				Connection conn = DriverManager.getConnection(url, "testuser", "1234");
				PreparedStatement pstmt = conn.prepareStatement(sql);

				)
		{


			try (ResultSet rs = pstmt.executeQuery()) {
				if(rs.next()) {
					item_id = rs.getInt("item_id");
					item_name = rs.getString("item_name");
					item_price = rs.getInt("item_price");
					System.out.printf("%d\t%8s\t%8d\n",
							item_id, item_name, item_price);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		RandomSelect rs = new RandomSelect();
		int result = 0;
		int select = 0;
		while(true) {
			System.out.println("?????? ???????????? ?????????????????????.");
			System.out.println("???????????????     ????????????        ??????");
			rs.randomSelect();;
			System.out.println("1. ??????, 2. ?????? ??????, 3. ??????");
			select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.println("??????!!");
				break;
			case 2:
				System.out.println("?????? ????????????.");
				continue;
			case 3:
				return;
			default :
				System.out.println("????????? ?????? ???????????????. ?????? ???????????????.");
				return;
			}
			break;
		}
		System.out.println("ID??? ??????????????? ???????????????.");
		System.out.print("ID >");
		id = sc.next();
		System.out.print("PW >");
		pw = sc.next();
		rs.userList(id, pw);;
		System.out.println();
		System.out.println("???????????????     ????????????        ??????");
		System.out.printf("%d\t%8s\t%8d\n", item_id, item_name, item_price);
		System.out.println("???????????? ????????????????????????? 1. ???, 2. ?????????");
		result = sc.nextInt();
		if (result == 1) {
			rs.itemInsert();
			System.out.println("?????? ??????");
			rs.itemList();
		} else {
		
			return;
		}
	}
}
