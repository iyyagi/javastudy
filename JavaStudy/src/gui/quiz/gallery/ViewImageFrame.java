package gui.quiz.gallery;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import gui.quiz.ImageIconTools;

public class ViewImageFrame extends JFrame {
	
	
	JFrame f = this;
	JLabel ImageLabel = new JLabel();
	JButton closeButton = new JButton("Close");
	
	// Thumbnail 버튼 클릭 시 적용되는 ViewImageFrame
	public ViewImageFrame() {
		setUndecorated(true); // title bar 없애기
		setSize(500, 500);
		setLayout(new BorderLayout());
		add(ImageLabel, "Center");
		add(closeButton, "South");
		
		
		// 취소버튼을 누르면 동작되는 addAction
		closeButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.setVisible(false);
				
			}
		});
		
		
		
	}
	// 이미지의 크기를 바꾸는 로직
	public void setImageLabel(File f) {
		try {
			ImageLabel.setIcon(ImageIconTools.getScaledImageIcon(f, 500, 500));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
