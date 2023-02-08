package gui.quiz.membership.database;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import database.quiz.datamodel.GameUser;

public class LoginDao {
	private static String driver = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private static String id = "testuser";
	private static String password = "1234";
	private static boolean idCheck = false;
	private static MemberUser user;
	JTextField idInput;
	JPasswordField pwInput;
	static {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(url, id, password);
		} catch (SQLException e) {
			System.out.println("ojdbc getConnection() error");
			return null;
		}
	}
	public void insert() {
		String sql = "INSERT INTO member VALUES (member_seq.nextval, ?, ?, ?,"
				+ "?, ?, ?, ?, ?, ?, sysdate)";
		try(
				Connection conn = DriverManager.getConnection(url, "testuser", "1234");
				PreparedStatement pstmt = conn.prepareStatement(sql);
				
				) {
				
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public boolean login(JTextField idInput,  JPasswordField pwInput) throws SQLException {
		String sql = "SELECT member_id, member_pw FROM member";
		try (
				Connection conn = getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();

				) {

			while (rs.next()) {
				if (rs.getString("member_id").equals(idInput)) {
					if (rs.getString("member_pw").equals(pwInput)) {
						idCheck = true;
					}
				}
			}
			System.out.println(rs);
		}
		return idCheck;
	}

}
