package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S01_JavaSwing {

	/*
	 	# Java Swing
	 	 - 자바로 GUI 프로그램을 만들기 위한 API

	 	# Container
	 	 - 위에 여러 컴포넌트들을 배치할 수 있는 판
	 	 - JFrame, JPanel, JDialog...등 다양한 클래스가 컨테이너 역할을 할 수 있다.
	 	 
	 	# Component
	 	 - 컨테이너 위에 배치할 수 있는 다양한 기능을 가진 것들
	 	 - 버튼, 표, 슬라이더, 메뉴.... 등	 
	*/
	
	public static void main(String[] args) {
		// 프레임 인스턴스 생성
		JFrame frame = new JFrame();
		
		// 버튼 인스턴스 생성
		JButton button1 = new JButton("ok");
		JButton button2 = new JButton("no");
		
		// button1의 위치와 크기 지정
		button1.setLocation(10, 10);
		button1.setSize(100, 50);
		
		// button2의 위치와 크기 지정
		button2.setLocation(10, 80);
		button2.setSize(100, 50);
		
		// 설정한 버튼을 프레임이 붙인다.
		frame.add(button1);
		frame.add(button2);
		
		frame.setTitle("My Gui Programming"); // 프로그램 제목
		// 프레임의 레이아웃을 지정하는 메서드
		frame.setLayout(null);
		//프레임을 보이도록 설정하는 메서드
		frame.setVisible(true);
		// 프로그램 가로 세로 사이즈
		frame.setSize(500, 500); 
		// 프로그램 실행 시 위치
		frame.setLocation(100, 200); 
		
		// 프레임이 X 버튼을 눌렀을 때의 동작을 설정하는 메서드
		/*
		 	이러한 상수값이 있다.
		 	EXIT_ON_CLOSE : X 누를 시 프로그램 종료
		 	DO_NOTHING_ON_CLOSE : 아무것도 안함
		 	HIDE_ON_CLOSE : 창 닫기
		 	DISPOSE_ON_CLOSE : 창 닫고 프로그램 종료는 안하기
		 
		 */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
}












