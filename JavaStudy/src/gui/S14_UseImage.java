package gui;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class S14_UseImage {

 
	public static void main(String[] args) {
		JFrame f = new JFrame("Image Test Frame");
		
		JLabel label = new JLabel("Wait for Click");
	 
		JButton button = new JButton("Clieck");
		label.setHorizontalAlignment(JLabel.CENTER);
		JButton button2 = new JButton("Cancel");
		button2.addActionListener(new ActionListener() {
		 	
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setOpaque(false);
				label.setIcon(null);
			}
		});

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// 이미지 입출력 클래스, 이미지 수정 기능들이 포함되어 있음
				// ImageIO.read() : 이미지 정보를 읽어서 BufferedImage 형태로 변환
				try {
					BufferedImage image = 
							ImageIO.read(new File("images/apple.jpg"));
					// getScaledInstance() : 원본으로 부터 크기 조절된 이미지 인스턴스를 생성하여 반환
					Image scaledImage = image.getScaledInstance(300, 300, Image.SCALE_DEFAULT);
					label.setIcon(new ImageIcon(scaledImage));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				label.setText(null);
				label.setOpaque(true); // 배경색 투명 해제
				label.setBackground(Color.black);
			}
		});

		
		
		
		f.add(label, "Center");
		f.add(button, "South");
		f.add(button2, "North");
		f.setLocation(600, 100);
		f.setSize(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
