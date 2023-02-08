package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class S13_FlowLayout {
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Flow");
		JPanel centerPanel =
				new JPanel(new FlowLayout(FlowLayout.CENTER, 0 , 0));
		int i = 0;
		while (i < 20) {
			centerPanel.add(new JButton("" + i++));
		}
		
		f.add(centerPanel, "Center");
		f.add(new JButton("Click!!") {
			int i = 20; 
			{
				addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("Click!!");
						centerPanel.add(new JButton("" + i++)); // Click버튼을 누르면 버튼을 추가하는 로직
						centerPanel.validate(); // 컴포넌트의 변화를 업데이트 하는 역할
					}
				});
			}
		}, "South");
		
		f.setLocation(600, 100);
		f.setSize(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
