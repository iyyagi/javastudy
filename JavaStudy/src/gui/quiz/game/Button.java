package gui.quiz.game;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Button extends JPanel implements ActionListener {
	
	Hangman man;
	
	public Button() {
		JButton a = new JButton("A"); JButton b = new JButton("B");
	    JButton c = new JButton("C"); JButton d = new JButton("D");
	    JButton e = new JButton("E"); JButton f = new JButton("F");
	    JButton g = new JButton("G"); JButton h = new JButton("H");
	    JButton i = new JButton("I"); JButton j = new JButton("J");
	    JButton k = new JButton("K"); JButton l = new JButton("L");
	    JButton m = new JButton("M"); JButton n = new JButton("N");
	    JButton o = new JButton("O"); JButton p = new JButton("P");
	    JButton q = new JButton("Q"); JButton r = new JButton("R");
	    JButton s = new JButton("S"); JButton t = new JButton("T");
	    JButton u = new JButton("U"); JButton v = new JButton("V");
	    JButton w = new JButton("W"); JButton x = new JButton("X");
	    JButton y = new JButton("Y"); JButton z = new JButton("Z");
	    
	    add(a); add(b);
        add(c); add(d);
        add(e); add(f);
        add(g); add(h);
        add(i); add(j);
        add(k); add(l);
        add(m); add(n);
        add(o); add(p);
        add(q); add(r);
        add(s); add(t);
        add(u); add(v);
        add(w); add(x);
        add(y); add(z);
        
        
        
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
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}
