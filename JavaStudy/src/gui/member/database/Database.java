package gui.member.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

	private static String driver = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private static String id = "testuser";
	private static String password = "1234";
	
	
	static {
		try {
			Class.forName(driver);
			System.out.println("드라이버 로드 완료");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		try {
			System.out.println("oracle 접속 완료");
			return DriverManager.getConnection(url, id, password);
			
		} catch (SQLException e) {
			System.out.println("ojdbc getConnection() error");
			return null;
		}
	}
}
