package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class S09_JRadioButton {

	// 여러가지 옵션 중 하나만 택할 때 사용하는 컴포넌트
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Radio Button");
		JRadioButton maleBtn = new JRadioButton();
		JRadioButton femaleBtn = new JRadioButton();
		JButton btn = new JButton("회원가입");
		maleBtn.setText("A) Male:");
		femaleBtn.setText("B) Female:");
		maleBtn.setBounds(50, 50, 150, 30);
		femaleBtn.setBounds(50, 100, 150, 30);
		btn.setBounds(50, 150, 150, 30);
		
		// doClick : 해당 컴포넌트를 클릭하는 효과가 있는 메서드

//		maleBtn.doClick();
		maleBtn.setSelected(true);
		
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(femaleBtn.isSelected() ? "You are Female" : "You are male");
				
				
			}
		});
		
		// 버튼 그룹을 설정하면 여러 버튼 중 하나만 선택할 수 있다.
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(femaleBtn);
		buttonGroup.add(maleBtn);
	
		
		
		f.add(btn);
		f.add(maleBtn);
		f.add(femaleBtn);
		f.setSize(500, 250);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
