package gui.quiz;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import gui.gallery.component.AppleButton;
import oracle.net.aso.a;

public class S14_ChangeImage {
	/* 	 
	   (1) images 폴더 내부에 모든 이미지들을 GridLayout으로 보여주기
	   (2) 해당 이미지를 클릭하면 확대된 이미지가 새 창에 나오기
	  
	*/
	 
	public static void main(String[] args) {
		
		JFrame f = new JFrame("My Gallery");
		Toolkit kit = Toolkit.getDefaultToolkit();
		ImageIcon img = new ImageIcon("images/apple2.jpg");
		f.setIconImage(img.getImage());
		GridLayout layout = new GridLayout(1, 1);
		SizeUp up = new SizeUp();
		JButton apple = new AppleButton();

		JButton button2 = new JButton("바나나");
		JButton button3 = new JButton("포도");
		JButton button4 = new JButton("딸기");
		BufferedImage image1 = null;
		BufferedImage image2 = null;
		BufferedImage image3 = null;
		BufferedImage image4 = null;
		try {
			image1 = ImageIO.read(new File("images/apple.jpg"));
			image2 = ImageIO.read(new File("images/banana.jpg"));
			image3 = ImageIO.read(new File("images/grape.jpg"));
			image4 = ImageIO.read(new File("images/strawberry.jpg"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		// getScaledInstance() : 원본으로 부터 크기 조절된 이미지 인스턴스를 생성하여 반환
		
		Image scaledImage2 = image2.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		button2.setIcon(new ImageIcon(scaledImage2));
		Image scaledImage3 = image3.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		button3.setIcon(new ImageIcon(scaledImage3));
		Image scaledImage4 = image4.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		button4.setIcon(new ImageIcon(scaledImage4));
	
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				up.bananaUp();
			}
		});
		
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				up.grapeUp();
			}
		});
		
		
		f.setLayout(layout);
		f.add(apple);
		f.add(button2);
		f.add(button3);
		f.add(button4);
		f.setLocation(600, 100);
		f.setSize(500, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
