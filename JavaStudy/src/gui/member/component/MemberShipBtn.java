package gui.member.component;

import java.awt.Font;

import javax.swing.JButton;

import gui.quiz.membership.event.MemberShipEvent;

public class MemberShipBtn extends JButton {

	public MemberShipBtn() {
		setText("회원 가입");

		setBounds(50, 250, 250, 50);
		setFont(new Font(null, Font.PLAIN, 35));
		setFocusable(false);
		addActionListener(new MemberShipEvent());
	}
}
