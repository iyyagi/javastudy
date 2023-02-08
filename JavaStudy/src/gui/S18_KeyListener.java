package gui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class S18_KeyListener {
	
	// 키보드 이벤트 처리
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Keyboard Event");
		
		JTextArea textarea = new JTextArea();
		
		textarea.setRows(10);
		// KeyListener 대신 KeyAdapter를 사용할 수 있다.
		textarea.addKeyListener(new KeyAdapter() {
//			@Override
//			public void keyPressed(KeyEvent e) {
//				System.out.println("키보드 눌렸다." + e.getKeyLocation());
//			}
//			
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("입력한 내용이 타이핑");
				System.out.printf("방금 누른 키(문자) : %c\n",e.getKeyChar());
				System.out.printf("방금 누른 키(키보드 코드) : %d\n", e.getKeyCode());
				System.out.println(e.isAltDown()); // alt버튼을 눌렀으면 true, 아니면 false;
				
				//System.out.println("손을 뗌");
			}
			
//			@Override
//			public void keyTyped(KeyEvent e) {
//				System.out.println("입력한 내용이 타이핑");
//				System.out.printf("방금 누른 키(문자) : %c\n",e.getKeyChar());
//				System.out.printf("방금 누른 키(키보드 코드) : %d\n", e.getKeyCode());
//				// ※ 방향키 같은 것에 반응이 없음
//			}
			
		});
		
		f.add(textarea, "South");
		f.setLocation(500, 100);
		f.setVisible(true);
		f.setSize(500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
