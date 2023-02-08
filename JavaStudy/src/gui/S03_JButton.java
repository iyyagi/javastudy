package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.AttributedCharacterIterator.Attribute;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class S03_JButton extends JFrame {


	JButton mainBtn = new JButton("main");
	JButton subBtn = new JButton("sub");
	
	public S03_JButton() {
		super("JButton 테스트"); // JFrame 부모생성자 호출
		add(mainBtn, "Center");
		add(subBtn, "South");

		// 버튼 텍스트 설정
		mainBtn.setText("Hello!");

		// 버튼 글꼴크기 설정
		mainBtn.setFont(new Font("궁서체", Font.ITALIC, 55));
		Attribute[] attrs = new Font(null, 0, 0).getAvailableAttributes();
		
		// 글꼴 설정
		subBtn.setFont(new Font("굴림체", Font.PLAIN, 30));

		// 버튼의 글씨 색 변경
		subBtn.setForeground(Color.red);
		
		// 버튼의 배경 색 변경
		subBtn.setBackground(Color.black);
		
		// 버튼의 이벤트 설정 (버튼에 액션 리스너 추가)
		subBtn.addActionListener(new ActionListener() {
			int num = 1;
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼이 눌렸을 때 동작을 설정할 수 있음.
				System.out.println("Hello, Button Event!!");
				mainBtn.setText(num++ + "번째 눌림");
				
			}
		});
		
		
		setVisible(true);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Attribute : 속성
		/*
		  family attributes : 글꼴
		  weight attribute 	: 글씨 무게 (굵기)
		  width attribute 	: 너비
		  posture attribute : ?
		  size 				: 크기
		  superscript		: ?
		  char_replacement 	: ?
		  foreground		: 글씨색
		  background		: 배경색
		  underline			: 밑줄
		  strikethrough		: 줄긋기
		  run_direction		:
		  bidi_embedding	:
		  justification		: 정렬
		  input method highlight : ?
		  input method underline : ?
		  swap_colors : ?
		  numeric_shaping : ?
		  kerning : ?
		  ligatures : ?
		  tracking : ?
		 */
		//		HashMap<TextAttribute, Object> attributes = new HashMap<>();
		//		attributes.put(TextAttribute.FONT, "궁서체");
		//		attributes.put(TextAttribute.SIZE, 30);
		//		attributes.put(TextAttribute.TRANSFORM, 20);
		//		attributes.put(TextAttribute.STRIKETHROUGH, true);


	}

	public static void main(String[] args) {
		new S03_JButton();

	}
}
