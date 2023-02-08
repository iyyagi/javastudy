package gui.gallery.component;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import gui.gallery.action.AppleAction;

public class AppleButton extends JButton {

	
	public AppleButton() {
	
		BufferedImage image = null;
		try {
			image = ImageIO.read(new File("images/apple.jpg"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image scaledImage = image.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		setIcon(new ImageIcon(scaledImage));
		addActionListener(new AppleAction(this));
	}
}
