package gui.quiz.membership.component;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPasswordField;

import gui.quiz.membership.event.MemberShipEvent;

public class MemberShipButton extends JButton {

	public MemberShipButton() {
		setText("회원 가입");
		
		setBounds(50, 250, 250, 50);
		setFont(new Font(null, Font.PLAIN, 35));
		setFocusable(false);
		addActionListener(new MemberShipEvent());
	}
}
 