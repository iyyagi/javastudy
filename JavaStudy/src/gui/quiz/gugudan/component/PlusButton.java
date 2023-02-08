package gui.quiz.gugudan.component;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;

import gui.quiz.gugudan.event.PlusDanEvent;


// 2. PlusButton을 따로 빼서 객체화
public class PlusButton extends JButton {
	// 7. List추가
	public PlusButton(List<GugudanButton> gugudanBtns) {
		setText("+");
		setBounds(250, 500, 250, 50);
		setFont(new Font(null, Font.PLAIN, 35));
		setFocusable(false);
						 // 8. PlusDanEvent로 gugudanBtns List를 전달
		addActionListener(new PlusDanEvent(gugudanBtns));
			
		}
}
