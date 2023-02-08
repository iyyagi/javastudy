package gui.gallery.action;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import gui.gallery.component.AppleButton;

public class AppleAction implements ActionListener{

	AppleButton apple;
	
	public AppleAction(AppleButton apple) {
		this.apple = apple;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame a = new JFrame("확대 사과");
		JLabel apple = new JLabel();
		try {
			BufferedImage image = 
					ImageIO.read(new File("images/apple.jpg"));
			Image scaledImage = image.getScaledInstance(400, 400, Image.SCALE_DEFAULT);
			
			apple.setIcon(new ImageIcon(scaledImage));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		a.add(apple);
		a.setLocation(600, 100);
		a.setSize(400, 400);
		a.setVisible(true);
		
		
	}

}
