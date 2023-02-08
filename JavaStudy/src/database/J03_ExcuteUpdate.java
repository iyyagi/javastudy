package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

public class J03_ExcuteUpdate {

	/*
	  	executeQuery() : 리턴 ResultSet, Select문에 사용한다.
	  	executeUpdate() : 리턴값 update된 행, INSERT, UPDATE, DELETE
	*/
	
	public static void main(String[] args) {
		String driver = J02_PrepareStatement.driver;
		String url = J02_PrepareStatement.url;
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
	
			e.printStackTrace();
		}
		
		String sql = "INSERT INTO fruits VALUES (?, ?, ?, ?, ?)";
		String sql2 = "UPDATE fruits SET price = price + 100 WHERE name LIKE ?";
		try(
				Connection conn = DriverManager.getConnection(url, "hr", "1234");
				PreparedStatement pstmt = conn.prepareStatement(sql);
				PreparedStatement pstmt2 = conn.prepareStatement(sql2);
		) {
			// Connection 인스턴스는 처음에 자동 커밋이 활성화 되어 있다.
			conn.setAutoCommit(false);
			
			pstmt.setString(1, "Red Orange");
			pstmt.setDouble(2, 4.44);
			pstmt.setInt(3, 1500);
			pstmt.setString(4, "JP");
			pstmt.setString(5, "AA");
			
			pstmt2.setString(1, "%kiwi");
			// Insert, Update, Delete는 executeUpdate() 메서드를 사용한다.
			int row = pstmt.executeUpdate();
			System.out.println(row + "행이 추가되었습니다.");
			Savepoint point1 = conn.setSavepoint("point1");
			row = pstmt2.executeUpdate();
			System.out.println(row + "행이 성공적으로 100원 올랐습니다.");
			
			// Connection 객체에 커밋과 롤백이 있다.
			conn.rollback(point1); // point1로 돌아가 UPDATE는 취소하고 INSERT는 커밋해보기
			System.out.println("SavePoint1로 돌아가 UPDATE가 취소되었습니다.");
			conn.commit();
			System.out.println("commit을 통해 변경사항을 확정 지었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
