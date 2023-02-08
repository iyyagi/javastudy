package gui.register.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import gui.register.model.Member;

// 회원가입 관련 작업으로 인한 DB접근에 대한 코드를 모아놓은 곳
public class RegisterDAO {
	
	public boolean checkDuplicatedEmail(String email) {
		
		
		return true;
	}
	
	
	public boolean checkDuplicatedID(String id) {
		String sql = "SELECT count(*) FROM member WHERE mem_id = ?";
		
		int count = 1;
		
		if (count > 0) {
			System.out.println("중복 아이디 입니다.");
			return true;
		} else {
			System.out.println("중복 아이디가 아니므로 사용할 수 있습니다.");
			return false;
		}

	}
	
	public int registerMember(Member m) {
		String sql = "INSERT INTO member VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
		try (
				Connection conn = DBConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
			){
			pstmt.setString(1, m.getMem_id());
			pstmt.setString(2, m.getPassword());
			pstmt.setString(3, m.getMem_name());
			pstmt.setString(4, m.getEmail());
			pstmt.setString(5, m.getPhone_Number());
			
			
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
		
	
	}
}
