package gui.member.service;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import gui.member.database.Database;
import gui.member.database.MemberUser;

public class MemberIn implements ActionListener {

	JTextField id;
	JPasswordField pwd;
	JTextField name;
	JTextField phone;
	JTextField memberAge;
	JTextField memberBirth;
	JTextField memberHobby;
	JCheckBox checkBox;
	JTextField emails;
	MemberUser user;
	public MemberIn(JTextField id, JPasswordField pwd, JTextField name,
			JTextField phone, JTextField memberAge, JTextField memberBirth,
			JTextField memberHobby, JCheckBox checkBox, JTextField emails) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.phone = phone;
		this.memberAge = memberAge;
		this.memberBirth = memberBirth;
		this.emails = emails;
		this.memberHobby = memberHobby;
		this.checkBox = checkBox;
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String sql = "INSERT INTO member VALUES (member_seq.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?, sysdate)";
		Database dao = new Database();
	
		try (
				Connection conn = dao.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				) {
			
			MemberUser user = new MemberUser();
			pstmt.setString(1, id.getText());
			pstmt.setString(2, new String(pwd.getPassword()));
			pstmt.setString(3, name.getText());
			pstmt.setInt(4, Integer.parseInt(memberAge.getText()));
			pstmt.setInt(5, Integer.parseInt(memberBirth.getText()));
			pstmt.setString(6, memberHobby.getText());
			pstmt.setString(7, checkBox.getText());
			pstmt.setString(8, emails.getText());
			pstmt.setString(9, phone.getText());
			pstmt.executeUpdate();
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
