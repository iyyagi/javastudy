package gui.quiz.gugudan.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;

import gui.quiz.gugudan.component.GugudanButton;

public class PlusDanEvent implements ActionListener {

	List<GugudanButton> gugudanBtns;
	
	public PlusDanEvent(List<GugudanButton> gugudanBtns) {
		this.gugudanBtns = gugudanBtns;
	}

	// 9.
	@Override
	public void actionPerformed(ActionEvent e) {
		for (GugudanButton gugudanBtn : gugudanBtns) {
			gugudanBtn.plusDan();
		}	
	}
}
