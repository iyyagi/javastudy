package gui.member;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import gui.member.component.LoginButton;
import gui.member.component.MemberPasswordField;
import gui.member.component.MemberShipBtn;
import gui.member.component.MemberidField;


public class MemberMainFrame extends JFrame {
	private static JTextField idInput = new MemberidField();
	private static JPasswordField pwInput = new MemberPasswordField();
	private static JButton loginBtn = new LoginButton(idInput, pwInput );
	private static JLabel idLabel = new JLabel("ID   : ");
	private static JLabel pwLabel = new JLabel("PW : ");
	JButton memberIn = new MemberShipBtn();
	public MemberMainFrame() {
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
		add(memberIn);
		setLayout(null);
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
