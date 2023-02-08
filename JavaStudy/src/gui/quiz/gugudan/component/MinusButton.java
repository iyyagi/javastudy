package gui.quiz.gugudan.component;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;

import gui.quiz.gugudan.event.MinusDanEvent;

// 2-1 MinusButton을 따로 빼서 객체화
public class MinusButton extends JButton {
	
	// 7-1 List추가
	public MinusButton(List<GugudanButton> gugudanBtns) {
		setText("-");
		setBounds(0, 500, 250, 50);
		setFont(new Font(null, Font.PLAIN, 35));
		setFocusable(false);
		addActionListener(new MinusDanEvent(gugudanBtns));
			
			
	}

	
}
