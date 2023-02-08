package gui;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

import database.model.Fruit;

public class S10_JComboBox extends JFrame {

	JComboBox cb;
	
	public S10_JComboBox() {
		// Object 타입으로 사용이 가능하다. Fruit 클래스의 toString을 참조한다.
		Fruit[] fruits = { 
				new Fruit("Apple", 3.3, 5000, "KR", "A+"),
				new Fruit("Mango", 3.3, 5000, "EN", "D+"),
				new Fruit("Kiwi", 3.3, 5000, "BR", "A"),
				new Fruit("Podo", 3.3, 5000, "CO", "C"),
				new Fruit("Grape", 3.3, 5000, "JP", "B-"),
		};
//		String[] fruits = {"apple", "mango", "kiwi", "orange"};
		
		cb = new JComboBox(fruits);
		cb.setBounds(50, 100, 100, 25);
		
		cb.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println(e.getItem());
				}
			}
		});
		
		this.add(cb);
		
		add(cb);
		setTitle("JComboBox Test Frame");
		setSize(500, 500);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void open() {
		setVisible(true);
	}
	
	public static void main(String[] args) {
		S10_JComboBox f = new S10_JComboBox();
		f.open();
	}
}
