package gui.quiz.gallery;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import gui.quiz.ImageIconTools;

public class ThumbnailButton extends JButton implements ActionListener{

	// 12. 하나만 전달하면 된다.
	private static ViewImageFrame view;
	// 13. 동일한 ViewImageFrame에 view를 받는다.
	public static void setViewFrame(ViewImageFrame f) {
		view = f;
	}
	
	File f;
	
	final private static int THUMBNAIL_WIDTH = 100;
	final private static int THUMBNAIL_HEIGHT = 80;
	
	//8.
	// this로 받아서
	public ThumbnailButton(String path) {
		this(new File(path));
	}
	
	// this로 전달
	public ThumbnailButton(File f) {
		this.f = f;

		try {
			// 9. ImageIconTools
			setIcon(new ImageIconTools().getScaledImageIcon(f, THUMBNAIL_WIDTH, THUMBNAIL_HEIGHT));
			setSize(THUMBNAIL_WIDTH, THUMBNAIL_HEIGHT);
			addActionListener(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	// 11. 내 파일에 acion을 진행한다.
	@Override
	public void actionPerformed(ActionEvent e) {
		
		view.setImageLabel(f);
		view.setVisible(true);
	}
	
}
