package gui.quiz.membership.database;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import gui.quiz.membership.component.LoginButton;
import gui.quiz.membership.component.MemberPasswordField;
import gui.quiz.membership.component.MemberShipButton;
import gui.quiz.membership.component.MemberidField;

public class MemberShipMainFrame extends JFrame {

	JTextField idInput = new MemberidField();
	JPasswordField pwInput = new MemberPasswordField();
	JButton loginBtn = new LoginButton(idInput, pwInput);
	JButton memberShipBtn = new MemberShipButton();
	JLabel idLabel = new JLabel("ID   : ");
	JLabel pwLabel = new JLabel("PW : ");
	public MemberShipMainFrame() {
		super("Swing Program");
		
		
		idLabel.setBounds(30, 30, 100, 50);
		pwLabel.setBounds(30, 100, 100, 50);
		idLabel.setFont(new Font(null, Font.PLAIN, 30));
		pwLabel.setFont(new Font(null, Font.PLAIN, 30));
		
		
		// JLabel 추가
		add(idLabel);
		add(pwLabel);
		
		// ID, PW 입력 추가
		add(idInput);
		add(pwInput);
		
		// 로그인 버튼, 회원가입 버튼 추가
		add(loginBtn);
		add(memberShipBtn);
		
		
		
		setLayout(null);
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
