package gui.quiz.membership.component;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import gui.quiz.membership.database.LoginDao;
import gui.quiz.membership.event.LoginEvent;

public class LoginButton extends JButton {

	JTextField idInput;
	JPasswordField pwInput;
	public LoginButton(JTextField idInput, JPasswordField pwInput) {
		setText("로그인");

		setBounds(50, 180, 250, 50);
		setFont(new Font(null, Font.PLAIN, 35));
		setFocusable(false);
		addActionListener(new LoginEvent(idInput, pwInput));
		
		
	}

}
