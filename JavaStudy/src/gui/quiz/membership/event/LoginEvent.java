package gui.quiz.membership.event;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import database.OjdbcConnection;
import gui.quiz.membership.database.LoginDao;

import gui.quiz.membership.database.MemberUser;


public class LoginEvent implements ActionListener {

	LoginDao dao = new LoginDao();
	
	JTextField idInput;
	JPasswordField pwInput;
	public LoginEvent(JTextField idInput, JPasswordField pwInput) {
		this.idInput = idInput;
		this.pwInput = pwInput;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String sql = "SELECT member_id, member_pw FROM member";
		try (
				Connection conn = dao.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				) {

			while (rs.next()) {
				try {
					if (rs.getString("member_id").equals(idInput)) {
						if (rs.getString("member_pw").equals(pwInput)) {
							JOptionPane.showMessageDialog(null, "로그인에 성공했습니다.");
						} else {
							JOptionPane.showMessageDialog(null, "로그인에 실패했습니다.");
						}
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			System.out.println(rs);
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
		
	}
}


