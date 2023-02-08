package gui.quiz.membership.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import gui.member.service.MemberIn;

public class SignUpDialog extends JFrame {
 
	String choice = null;
	
	public SignUpDialog() {
	
		setTitle("회원관리 화면");
		
		// 1. 컴포넌트들을 만들어 보자.
		JLabel title = new JLabel("회원가입", JLabel.CENTER);
		
		title.setForeground(new Color(5, 0, 153));
		title.setFont(new Font("궁서체", Font.BOLD, 30));
		
		JButton join = new JButton("가입");
		JButton cancel = new JButton("취소");
		
		JTextField id = new JTextField(10);
		JPasswordField pwd = new JPasswordField(10);
		JTextField name = new JTextField(10);
		JTextField phone = new JTextField(10);
		JTextField memberAge = new JTextField(10);
		JTextField memberBirth = new JTextField(10);
		JTextField memberHobby = new JTextField(10);
		JTextField check = new JTextField(10);
		JTextField emails = new JTextField(10);
		
		// form panel
		JPanel idPanel = new JPanel();
		idPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		idPanel.add(new JLabel("아이디 : "));
		idPanel.add(id);
		
		JPanel pwdPanel = new JPanel();
		pwdPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		pwdPanel.add(new JLabel("비밀번호 : "));
		pwdPanel.add(pwd);
		
		JPanel namePanel = new JPanel();
		namePanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		namePanel.add(new JLabel("이    름 : "));
		namePanel.add(name);
		
		JPanel age = new JPanel();
		age.setLayout(new FlowLayout(FlowLayout.RIGHT));
		age.add(new JLabel("나    이 : "));
		age.add(memberAge);
		
		JPanel birth = new JPanel();
		birth.setLayout(new FlowLayout(FlowLayout.RIGHT));
		birth.add(new JLabel("생년월일 : "));
		birth.add(memberBirth);
		
		JPanel hobby = new JPanel();
		hobby.setLayout(new FlowLayout(FlowLayout.RIGHT));
		hobby.add(new JLabel("취   미 : "));
		hobby.add(memberHobby);
		
		JPanel phonePanel = new JPanel();
		phonePanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		phonePanel.add(new JLabel("연 락 처 : "));
		phonePanel.add(phone);
		
		JPanel email = new JPanel();
		email.setLayout(new FlowLayout(FlowLayout.RIGHT));
		email.add(new JLabel("이 메 일 : "));
		email.add(emails);
		
		JCheckBox checkBox = new JCheckBox("SNS 수신동의");
		checkBox.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		 
		
		
		JPanel formPanel = new JPanel();
		formPanel.setLayout(new GridLayout(9, 1));
		formPanel.add(idPanel);
		formPanel.add(pwdPanel);
		formPanel.add(birth);	
		formPanel.add(namePanel);
		formPanel.add(age);
		formPanel.add(phonePanel);
		formPanel.add(hobby);
		formPanel.add(email);
		formPanel.add(checkBox);
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(new FlowLayout());
	
		contentPanel.add(formPanel);
		
		// button panel
		JPanel panel = new JPanel();
		panel.add(join);
		panel.add(cancel);
		
		join.addActionListener(new MemberIn(id, pwd, name, phone, memberAge, memberBirth, 
				memberHobby, checkBox, emails));
		cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 눌렸습니다.");
				
				
			}
		});
		
		add(title, BorderLayout.NORTH);
		add(contentPanel, BorderLayout.CENTER);
		add(panel, BorderLayout.SOUTH);
		
		
		setBounds(300, 300, 400, 400);
		
		
		
		setVisible(true);
	}

}
