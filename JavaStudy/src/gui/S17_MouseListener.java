package gui;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class S17_MouseListener {

	// 마우스 이벤트 처리
	
	// MouseListner Interface : 인터페이스. 모든 추상 메서드를 구현해야 해서 불편하다.
	
	// MouseAdapter : 추상 클래스, 원하는 메서드만 구현하면 된다.
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("Mouse Event");
		
		JButton top = new JButton("위");
		JLabel bottom = new JLabel("아래");
		
		// 모든 컴포넌트에는 이벤트를 붙힐 수 있다.
		bottom.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 이벤트 발생 시 e에 이벤트 정보가 넘어온다.
				System.out.println(e.getClickCount());
				
				// 마우스의 위치
				System.out.printf("마우스 좌표(프로그램에서): %d, %d", e.getX(), e.getY());
				System.out.printf("마우스 좌표(모니터상에서): %d, %d", e.getXOnScreen(), e.getYOnScreen());
				
				// 이벤트를 발생시킨 컴포넌트의 인스턴스(컴포넌트 타입이므로 다운캐스팅이 필요)
				System.out.println(((JLabel)e.getComponent()).getText());
				System.out.println("누른 시간 : " + new Date(e.getWhen()));
				
			}
		});
		
		f.setLayout(new GridLayout(2, 1));
		f.add(top);
		f.add(bottom);
		
		
		f.setLocation(500, 100);
		f.setVisible(true);
		f.setSize(500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
