package gui.quiz.game;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Flow;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Hangman extends JFrame implements ActionListener {

	Random ran = new Random();
	int count = 0;
	int loseCount = 8;
	boolean gameOver = true;
	boolean nextImg = true;
	String countryText = country(getName());
	String blankLen = "";
	char[] blankArray = new char[countryText.length()];
	List<ImageIcon> image = new ArrayList<>();
	List<String> words;
	JLabel blankLabel = new JLabel();
	JLabel hangmanLabel = new JLabel();
	
	JLabel titleLabel = new JLabel("카타르 월드컵 출전 국가");

	public Hangman() {
		super("행맨");
		String countryText = country(getName());
		String blankLen = "";
		char[] blankArray = new char[countryText.length()];
		for (int i = 0; i < countryText.length(); ++i) {
			blankLen += "_ ";
			blankArray[i] = '_';
			blankLabel.setText(blankLen);
		
		}

		GridLayout gridLayout = new GridLayout(4, 1, 10, 10);
		
		JPanel titlePanel = new JPanel();
		
		JPanel blankPanel = new JPanel();
		
		titleLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		
		titlePanel.add(titleLabel);
	
		blankPanel.add(blankLabel);

		
		JPanel hangmanPanel = new JPanel(new CardLayout());
		
		for (int i = 1; i <= 8; ++i) {
			image.add(new ImageIcon("hangman/" + i + ".jpg"));
		}
		hangmanPanel.add(hangmanLabel);

		JTextField textInput = new JTextField();
		if (gameOver) {
			textInput.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {

					boolean nextImg = true;
					int loseCount = 0;
					for (int i = 0; i < countryText.length(); ++i) {
						if (e.getKeyChar() == countryText.charAt(i)) {
							blankArray[i] = e.getKeyChar();
							blankLabel.setText(Arrays.toString(blankArray));
							JOptionPane.showMessageDialog(null, "맞췄습니다.");
							nextImg = false;
						}
					}
					if (nextImg) {
						hangmanLabel.setIcon(image.get(count++));
						JOptionPane.showMessageDialog(null, "틀렸습니다.");
						loseCount++;
						nextImg = true;

					} else if (count == 8) {
						JOptionPane.showMessageDialog(null, "패배.");
						gameOver = false;
					}
				}

			});
		}

		JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
	
		
		
		JButton a = new JButton("a"); JButton b = new JButton("b");
		JButton c = new JButton("c"); JButton d = new JButton("d");
		JButton e = new JButton("e"); JButton f = new JButton("f");
		JButton g = new JButton("g"); JButton h = new JButton("h");
		JButton i = new JButton("i"); JButton j = new JButton("j");
		JButton k = new JButton("k"); JButton l = new JButton("l");
		JButton m = new JButton("m"); JButton n = new JButton("n");
		JButton o = new JButton("o"); JButton p = new JButton("p");
		JButton q = new JButton("q"); JButton r = new JButton("r");
		JButton s = new JButton("s"); JButton t = new JButton("t");
		JButton u = new JButton("u"); JButton v = new JButton("v");
		JButton w = new JButton("w"); JButton x = new JButton("x");
		JButton y = new JButton("y"); JButton z = new JButton("z");

		inputPanel.add(a); inputPanel.add(b);
		inputPanel.add(c); inputPanel.add(d);
		inputPanel.add(e); inputPanel.add(f);
		inputPanel.add(g); inputPanel.add(h);
		inputPanel.add(i); inputPanel.add(j);
		inputPanel.add(k); inputPanel.add(l);
		inputPanel.add(m); inputPanel.add(n);
		inputPanel.add(o); inputPanel.add(p);
		inputPanel.add(q); inputPanel.add(r);
		inputPanel.add(s); inputPanel.add(t);
		inputPanel.add(u); inputPanel.add(v);
		inputPanel.add(w); inputPanel.add(x);
		inputPanel.add(y); inputPanel.add(z);

		a.addActionListener(this); b.addActionListener(this);
		c.addActionListener(this); d.addActionListener(this);
		e.addActionListener(this); f.addActionListener(this);
		g.addActionListener(this); h.addActionListener(this);
		i.addActionListener(this); j.addActionListener(this);
		k.addActionListener(this); l.addActionListener(this);
		m.addActionListener(this); n.addActionListener(this);
		o.addActionListener(this); p.addActionListener(this);
		q.addActionListener(this); r.addActionListener(this);
		s.addActionListener(this); t.addActionListener(this);
		u.addActionListener(this); v.addActionListener(this);
		w.addActionListener(this); x.addActionListener(this);
		y.addActionListener(this); z.addActionListener(this);

		add(titlePanel);
		add(blankPanel);
		add(hangmanPanel);
		add(inputPanel);
		//add(textInput);
		setLayout(gridLayout);
		setLocation(100, 100);
		setVisible(true);
		setSize(400, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public String country(String path) {
		words = new ArrayList<>();
		words.add("korea");
		words.add("japan");
		words.add("brazil");
		int ran = (int)(Math.random() * words.size());
		path = words.get(ran);
		return path;
	}
	
	public static void main(String[] args) {
		new Hangman();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		boolean nextImg = true;
	
		for (int i = 0; i < countryText.length(); ++i) {
			if (e.getActionCommand().charAt(0) == countryText.charAt(i)) {
				blankArray[i] = e.getActionCommand().charAt(0);
				blankLabel.setText(Arrays.toString(blankArray));
				nextImg = false;
			}
		}
		if (nextImg) {
			hangmanLabel.setIcon(image.get(count++));
			JOptionPane.showMessageDialog(null, "틀렸습니다.");
			titleLabel.setText("남은 목숨" + --loseCount);
			nextImg = true;
		} else if (count == 8) {
			gameOver = false;
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	}
}
