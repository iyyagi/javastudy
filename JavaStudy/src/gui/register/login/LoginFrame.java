package gui.register.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import gui.register.dao.LoginDAO;
import gui.register.join.JoinFrame;

public class LoginFrame extends JFrame {

	
	JoinFrame joinFrame = new JoinFrame(this); // LgoinFrame을 바라본다.
	 
	JLabel loginLabel = new JLabel() {
		{
			setText("아이디");
			setLocation(80, 80);
			setSize(100, 30);
		}
	};
	
	JLabel passwordLabel = new JLabel() {
		{
			setText("비밀번호");
			setLocation(80, 120);
			setSize(100, 30);
		}
	};
	
	JTextField loginTextField = new JTextField() {
		{
			setLocation(150, 80);
			setSize(150, 30);
			setColumns(30);
		}
	};
	
	JPasswordField passwordField = new JPasswordField() {
		{
			setLocation(150, 120);
			setSize(150, 30);
			setColumns(30);
		}
	};
	
	JButton loginButton = new JButton() {
		
		{
			setText("로그인");
			setLocation(80, 160);
			setSize(105, 30);
			addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("로그인 버튼이 눌렸음");
					new LoginDAO().login(loginTextField.getText(), passwordField.getPassword());
					
					
				}
			});
		}
	};
	
	JButton joinButton = new JButton() {
		{
			setText("회원가입");
			setLocation(195, 160);
			setSize(105, 30);
			addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					joinFrame.open();
				
				}
			});
		}
	};
	
	public LoginFrame() {
		
		add(loginLabel);
		add(passwordLabel);
		add(loginTextField);
		add(passwordField);
		add(loginButton);
		add(joinButton);
		
		setTitle("Login My Service");
		setResizable(false);
		setLayout(null);
		setSize(400, 300);
		setLocation(500, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new LoginFrame();
	}
}
