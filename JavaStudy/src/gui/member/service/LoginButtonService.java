package gui.member.service;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import gui.member.database.Database;

public class LoginButtonService implements ActionListener {
	
	
	JTextField idInput;
	JPasswordField pwInput;
	
	public LoginButtonService(JTextField idInput, JPasswordField pwInput) {
		this.idInput = idInput;
		this.pwInput = pwInput;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(idInput.getText() + new String(pwInput.getPassword()));
		Database db = new Database();
		
		
		String Sql = "SELECT member_id, member_pw FROM member WHERE member_id = ?";
		try (
				Connection conn = db.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(Sql);
				) {
			pstmt.setString(1, idInput.getText());
			try(ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					System.out.println("ㅎㅇ");
					if (rs.getString("member_id").equals(idInput.getText()) && 
						rs.getString("member_pw").equals(new String(pwInput.getPassword()))) {
						System.out.println("성공");
						JOptionPane.showMessageDialog(null, "로그인에 성공했습니다.");
					} else { 
						System.out.println("실패");
						JOptionPane.showMessageDialog(null, "로그인에 실패했습니다.");
					}
				}
				
			}
			
		} catch (SQLException e1) {
			System.out.println("뭔가 문제가 생겼어");
			e1.printStackTrace();
		}
		idInput.setText("");
		pwInput.setText("");
	}
	

}
