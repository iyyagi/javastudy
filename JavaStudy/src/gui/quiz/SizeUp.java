package gui.quiz;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SizeUp  {

	
	public SizeUp() {
	
		
	
	}
	
	public void grapeUp() {
		JFrame g = new JFrame("포도");
		JLabel grape = new JLabel();
		BufferedImage image1 = null;
		try {
			image1 = ImageIO.read(new File("images/grape.jpg"));
		
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		Image scaledImage3 = image1.getScaledInstance(400, 400, Image.SCALE_DEFAULT);
		grape.setIcon(new ImageIcon(scaledImage3));
		
		
		g.add(grape);
		g.setLocation(600, 100);
		g.setSize(400, 400);
		g.setVisible(true);
	
	}
	
	
	public void bananaUp() {
		JFrame b = new JFrame("바나나");
		JLabel banana = new JLabel();
		BufferedImage image2 = null;
		try {
			image2 = ImageIO.read(new File("images/banana.jpg"));
		
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		Image scaledImage2 = image2.getScaledInstance(400, 400, Image.SCALE_DEFAULT);
		banana.setIcon(new ImageIcon(scaledImage2));
		b.add(banana);
		b.setLocation(600, 100);
		b.setSize(400, 400);
		b.setVisible(true);
	}
	
	public void appleUp() {
		JFrame a = new JFrame("사과");
		JLabel apple = new JLabel();
		
		BufferedImage image3 = null;
		try {
			image3 = ImageIO.read(new File("images/apple.jpg"));
		
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		Image scaledImage1= image3.getScaledInstance(400, 400, Image.SCALE_DEFAULT);
		apple.setIcon(new ImageIcon(scaledImage1));
		a.add(apple);
		a.setLocation(600, 100);
		a.setSize(400, 400);
		a.setVisible(true);
	
		
	}
}
