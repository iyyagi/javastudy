package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class S07_JPasswordField {
	// 비밀번호 입력할 때 사용하는 필드
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		JLabel label = new JLabel("Password");
		
		JPasswordField pf = new JPasswordField();
		label.setBounds(50, 100, 80, 30 );
		pf.setBounds(130, 100, 150, 30);
		pf.addActionListener(new ActionListener() {
			
			// 기본적으로 password로 사용시 문자열로 저장
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("현재 입력되어 있는 값 " + new String(pf.getPassword()));
				pf.setText("");
			}
		});
		
		f.add(label);
		f.add(pf);
		
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
