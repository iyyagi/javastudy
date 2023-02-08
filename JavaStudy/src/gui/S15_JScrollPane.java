package gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class S15_JScrollPane {

	/*
	  JScrollPane에 붙이는 컴포넌트는 스크롤이 가능해 진다.
	 
	*/
	
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("ScrollPane Test");
		
		
		f.setLayout(new GridLayout(2, 2));
		
		for (int i = 0; i < 3; ++i) {
			f.add(new JButton("" + i));
		}
		
		// Panel : 다른 컴포넌트를 붙일 수 있는 컴포넌트 (레이아웃 설정할 수 있음)
		// Pane : 다른 컴포넌트를 붙일 수 있는 컴포넌트 (특이한 기능이 있음)
		JTextArea textArea = new JTextArea();
		JScrollPane scrollabelPane = new JScrollPane();
		
		// JScrollPane에는 컴포넌트를 설정할 때는 add대신 setViewportView를 사용한다.
		scrollabelPane.setViewportView(textArea);
	
		f.add(scrollabelPane);
		
		f.setLocation(100, 100);
		f.setVisible(true);
		f.setSize(500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
