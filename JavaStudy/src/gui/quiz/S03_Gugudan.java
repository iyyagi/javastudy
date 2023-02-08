package gui.quiz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class S03_Gugudan extends JFrame {

	/*
	  실행하면 구구단이 출력되는 GUI 프로그램을 만들어 보세요.
	 1. 프로그램을 처음 실행하면 구구단 2단이 출력되어 있는 상태로 시작
	 2. + 버튼을 누르면 단이 증가하며 구구단이 바뀐다.(최대 19단 까지)
	 3. - 버튼을 누르면 단이 감소하며 구구단이 바뀐다. (최소 2단 까지)

	 */

	JButton plusBtn = new JButton("+");
	JButton minusBtn = new JButton("-");
	BorderLayout layout = new BorderLayout();
	JLabel label = new JLabel();
	TextArea ta = new TextArea();
	static int num = 2;
	public S03_Gugudan() {
		super("구구단 프로그램");
		setLayout(layout);
		setLocationRelativeTo(null);
		layout.setVgap(15);
		layout.setHgap(15);
		plusBtn.setBounds(100, 300, 122, 80);
		minusBtn.setBounds(300, 300, 122, 80);
		plusBtn.setFont(new Font("굴림체", Font.PLAIN, 30));
		minusBtn.setFont(new Font("굴림체", Font.PLAIN, 30));
		plusBtn.setForeground(Color.red);
		plusBtn.setBackground(Color.black);
		minusBtn.setForeground(Color.blue);
		minusBtn.setBackground(Color.DARK_GRAY);
		
		add(plusBtn);
		add(minusBtn);
//		ta.setBounds(300,500,122,500);
//		ta.setText(gugudan());
//		add(ta);
		
		label.setBounds(300, 500, 122, 500);
		label.setFont(new Font("궁서체", Font.BOLD, 15));
		add(label, "Center");
	
		label.setText(gugudan());
		
	

		minusBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// minus버튼 누르면 구구단 감소
				if (num <= 2) {
					num = 19;
					label.setText(gugudan());
				} else {
					label.setText(num-- + "구구단 감소");
					label.setText(gugudan());
				}
			}
		});

		plusBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (num >= 19) {
					num = 2;
					label.setText(gugudan());
				
				} else {
					
					label.setText(num++ + "구구단 증가"); 
					label.setText(gugudan());
				}
			}
		});

		setVisible(true);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public String gugudan() {
		StringBuilder sb = new StringBuilder();
			for (int gop = 1; gop <= 9; ++gop) {
				
				sb.append(num + "X" + gop + "=" + num * gop + "\n ");
			
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		S03_Gugudan g = new S03_Gugudan();


	}	
}
