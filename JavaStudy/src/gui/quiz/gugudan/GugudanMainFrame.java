package gui.quiz.gugudan;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

import gui.quiz.gugudan.component.GugudanButton;
import gui.quiz.gugudan.component.MinusButton;
import gui.quiz.gugudan.component.PlusButton;

public class GugudanMainFrame extends JFrame {

	// List로 여러개의 같은 종류의 버튼 관리
	List<GugudanButton> gugudanBtns = new ArrayList<>();

	// 인스턴스 초기화 블록(생성자 보다 먼저 수행)
	/*
	 인스턴스가 생성된 후 자동으로 실행하는 블록
	 한 클래스 안에 여러개의 인스턴스 블록을 넣을 수 있다.
     용도
		인스턴스 변수를 초기화시키는 코드를 둔다.
		어떤 생성자가 호출되든 그 전에 공통으로 초기화시키고 싶은 작업이 있다면 인스턴스 블록에서 처리하면 된다 
	 */
	{	
		// 구구단 버튼 9개를 전달해 준다.
		for (int i = 1; i <= 9; ++i) {
			gugudanBtns.add(new GugudanButton(i)); 
		}
	}
	// 3. 인스턴스 불러오기 // 6. gugudanBtns를 이벤트 생성으로 전달
	JButton plusBtn = new PlusButton(gugudanBtns);
	JButton minusBtn = new MinusButton(gugudanBtns);

	// 1. 구구단 메인 프레임
	public GugudanMainFrame() {
		super("구구단");

		// 5. for-each문으로 list를 add
		for (JButton gugudanBtn : gugudanBtns) {
			add(gugudanBtn);
		}

		// 4. 불러온 인스턴스를 add
		add(plusBtn);
		add(minusBtn);

		// 1. BorderLayout이 설정되어 있으면 원하는 대로 배치할 수 없으므로 레이아웃 해제
		setLayout(null);
		setSize(500, 590);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
