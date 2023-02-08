package test;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Hangman extends JFrame implements ActionListener {

    // 랜덤 단어

    String[] words = {

          "abolition","abominable","abominate","aboriginal","aborigine","aborning","abort",

          "abound","about","above","aboveboard","accent","accentual","accentuate",

          "accept","acceptant","accomplish","accord","accordant","accordion","build",

          "buildup","built","builtin","Bujumbura","father","bulblet","bulgaria","bulge",

          "bulk","bulkhead","bulky","mother","bulldog","bulldoze","bullet","bulletin",

          "bullfinch","bullfrog","bullhead","cellophane","cellular","celluloid","cellulose",

          "cement","cemetery","chariot","charisma","charismatic","censor","censorial",

          "censorious","censure","census","centennial","centerline","centerpiece","centigrade",

          "centimeter","centipede","centaur","centenary","chelate","chemic","chemise",

          "chiropractor","chirp","chisel","cigarette","cilia","ciliate","circumcision",

          "circumference","circumferential","cityscape","citywide","clannish","clandestine",

          "clapboard","cochlea","obeisant","obelisk","oberlin","obese","nugatory","nugget",

          "nuisance","numerology","numerous","numinous","numismatic","numismatist",

          "nullify","observatory","observe","obsess","occidental","occipital","occlude","occlusion",

          "officeholder","officemate","official","officialdom","ombudsman","ombudsperson",

          "omega","omelet","onomatopoeia","onomatopoeic","ophthalmic","ophthalmology",

          "optometrist","optometry","orchestra","orchestral","orchestrate","orchid","orchis",

          "ordain","osteology","osteopath","osteopathic","osteopathy","osteoporosis","oxygen",

          "oxygenate","pageant","pageantry","paginate","pagoda","pandemic","pandemonium",

          "pander","paperback","paperbound","paperweight","paperwork","paramagnet",

          "paramagnetic","sawmill","sawtimber","sawtooth","sawyer","scabbard","scabious",

          "scabrous","scaffold","schizomycetes","schizophrenia","schizophrenic","screwbean",

          "screwdriver","screwworm","scribble","seafare","seafood","Seagram","seagull",

          "seahorse","seclusion","second","secondary","secondhand","secrecy","sediment",

          "sedimentary","sedimentation","sedition","seditious","semantic","semaphore",

          "semblance","semester","semantic","semaphore","semblance","semester","seminole",

          "semiramis","stenographer","stenography","stenotype","stockbroker","stockholder",

          "storehouse","storekeep","storeroom","straightaway","straighten","straightforward",

          "strenuous","streptococcus","treptomycin","stronghold","strongroom","strontium",

          "thrash","thread","threadbare"

    };
   
    int[] checked = new int[201]; // 나왔던 단어 체크하는 배열

    int word_length; // 단어의 길이

    int guessNum; // 맞추는 횟수 (10번만에 맞추는지 8번만에 맞추는지)

    int level; // 게임 난이도

    char[] word1 = new char[12]; // 프로그램 안에서 돌아가는 char

    String[] slevel = { "Easy", "Medium", "Hard" }; // 난이도

    String[] word2 = new String[12]; // 화면에 출력할 String

    String check_word;

    double wins;

    double looses;

    double winningProsentige;

    // 버튼 설정

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

    JButton begin = new JButton("BEGIN"); JButton easy = new JButton("EASY");

    JButton medium = new JButton("MEDIUM"); JButton hard = new JButton("HARD");

    JLabel text = new JLabel("Skill level: ", JLabel.LEFT); // 레벨 레이블로 띄우기



    JPanel displayTOP = new JPanel();

    JPanel display1 = new JPanel();

    JPanel display2 = new JPanel();



    Font normalFont = new Font("Arial", Font.BOLD, 16);

    Font warningFont = new Font("Arial", Font.BOLD, 20);



    public Hangman() {

          setTitle("행맨 게임");

          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          setSize(850, 700);

          setVisible(true);

    }



    public void init() {

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

          begin.addActionListener(this);

          easy.addActionListener(this);

          medium.addActionListener(this);

          hard.addActionListener(this);



          GridLayout aaa = new GridLayout(3, 0); // 전체 panel에 대한 layout 설정

          FlowLayout bbb = new FlowLayout(); // displayTOP에 대한 layout // begin버튼

          FlowLayout ccc = new FlowLayout(); // display2에 대한 layout

          GridLayout ddd = new GridLayout(3,9); // display1에 대한 layout // 알파벳



          Container root = getContentPane(); // 컨테이너 타입의 객체 root

          root.setLayout(aaa); // grid

          root.setBackground(Color.white);



          displayTOP.add(begin);

          displayTOP.setLayout(bbb);

          displayTOP.setBackground(Color.white);



          root.add(displayTOP); // TOP을 컨테이너에 등록

          display1.setLayout(ddd);

          display1.setBackground(Color.white);



          a.setBackground(Color.orange); b.setBackground(Color.orange);

          c.setBackground(Color.orange); d.setBackground(Color.orange);

          e.setBackground(Color.orange); f.setBackground(Color.orange);

          g.setBackground(Color.orange); h.setBackground(Color.orange);

          i.setBackground(Color.orange); j.setBackground(Color.orange);

          k.setBackground(Color.orange); l.setBackground(Color.orange);

          m.setBackground(Color.orange); n.setBackground(Color.orange);

          o.setBackground(Color.orange); p.setBackground(Color.orange);

          q.setBackground(Color.orange); r.setBackground(Color.orange);

          s.setBackground(Color.orange); t.setBackground(Color.orange);

          u.setBackground(Color.orange); v.setBackground(Color.orange);

          w.setBackground(Color.orange); x.setBackground(Color.orange);

          y.setBackground(Color.orange); z.setBackground(Color.orange);



          display1.add(a); display1.add(b);

          display1.add(c); display1.add(d);

          display1.add(e); display1.add(f);

          display1.add(g); display1.add(h);

          display1.add(i); display1.add(j);

          display1.add(k); display1.add(l);

          display1.add(m); display1.add(n);

          display1.add(o); display1.add(p);

          display1.add(q); display1.add(r);

          display1.add(s); display1.add(t);

          display1.add(u); display1.add(v);

          display1.add(w); display1.add(x);

          display1.add(y); display1.add(z);



          root.add(display1);



          display2.setLayout(ccc);

          display2.setBackground(Color.white);

          display2.add(text);

          display2.add(easy);

          display2.add(medium);

          display2.add(hard);

          root.add(display2);

          setContentPane(root);



          a.setEnabled(false); b.setEnabled(false);

          c.setEnabled(false); d.setEnabled(false);

          e.setEnabled(false); f.setEnabled(false);

          g.setEnabled(false); h.setEnabled(false);

          i.setEnabled(false); j.setEnabled(false);

          k.setEnabled(false); l.setEnabled(false);

          m.setEnabled(false); n.setEnabled(false);

          o.setEnabled(false); p.setEnabled(false);

          q.setEnabled(false); r.setEnabled(false);

          s.setEnabled(false); t.setEnabled(false);

          u.setEnabled(false); v.setEnabled(false);

          w.setEnabled(false); x.setEnabled(false);

          y.setEnabled(false); z.setEnabled(false);

          // begin이 눌리면 그때부터 활성화 (true)

          easy.setEnabled(true);

          medium.setEnabled(true);

          hard.setEnabled(true);



          for (int i = 0; i < checked.length; i++) {

                checked[i] = 0; // 아직 선택되지 않은 단어 (0)으로 초기화

          }



          for (int i = 0; i < 12; i++) {

                word1[i] = ' '; // character // 프로그램 안에서 맞는지 틀린지

                word2[i] = " "; // string // 화면에 내보낼 때

          }



          /* 필요한 변수들의 초기치 설정 */

          wins = 0;

          looses = 0;

          winningProsentige = 0.0;

    }



    public void paint(Graphics screen) {

          super.paint(screen);

          Graphics2D screen2D = (Graphics2D) screen;

          screen2D.setFont(warningFont);



          screen2D.drawLine(70, 60, 130, 60);

          screen2D.drawLine(70, 60, 70, 80);

          screen2D.drawLine(130, 60, 130, 170);

          screen2D.drawLine(60, 170, 160, 170);



          if (level == 0) {

                switch (guessNum) {

                      case 1:

                            screen2D.drawOval(60, 80, 20, 20); // 얼굴

                            break;

                      case 2:

                            screen2D.drawOval(60, 80, 20, 20); // 얼굴

                            break;

                      case 3:

                            screen2D.drawOval(60, 80, 20, 20); // 얼굴

                            screen2D.drawOval(60, 100, 20, 40); // 몸통

                            break;

                      case 4:

                            screen2D.drawOval(60, 80, 20, 20); // 얼굴

                            screen2D.drawOval(60, 100, 20, 40); // 몸통

                            break;

                      case 5:

                            screen2D.drawOval(60, 80, 20, 20); // 얼굴

                            screen2D.drawOval(60, 100, 20, 40); // 몸통

                            screen2D.drawLine(58, 115, 48, 130); // 왼 팔

                            break;

                      case 6:

                            screen2D.drawOval(60, 80, 20, 20); // 얼굴

                            screen2D.drawOval(60, 100, 20, 40); // 몸통

                            screen2D.drawLine(58, 115, 48, 130); // 왼 팔

                            break;

                      case 7:

                            screen2D.drawOval(60, 80, 20, 20); // 얼굴

                            screen2D.drawOval(60, 100, 20, 40); // 몸통

                            screen2D.drawLine(58, 115, 48, 130); // 왼 팔

                            screen2D.drawLine(82, 115, 92, 130); // 오른 팔

                            break;

                      case 8:

                            screen2D.drawOval(60, 80, 20, 20); // 얼굴

                            screen2D.drawOval(60, 100, 20, 40); // 몸통

                            screen2D.drawLine(58, 115, 48, 130); // 왼 팔

                            screen2D.drawLine(82, 115, 92, 130); // 오른 팔

                            break;

                      case 9:

                            screen2D.drawOval(60, 80, 20, 20); // 얼굴

                            screen2D.drawOval(60, 100, 20, 40); // 몸통

                            screen2D.drawLine(58, 115, 48, 130); // 왼 팔

                            screen2D.drawLine(82, 115, 92, 130); // 오른 팔

                            screen2D.drawLine(65, 140, 55, 160); // 왼 다리

                            break;

                      case 10:

                            screen2D.drawOval(60, 80, 20, 20); // 얼굴

                            screen2D.drawOval(60, 100, 20, 40); // 몸통

                            screen2D.drawLine(58, 115, 48, 130); // 왼 팔

                            screen2D.drawLine(82, 115, 92, 130); // 오른 팔

                            screen2D.drawLine(65, 140, 55, 160); // 왼 다리

                            screen2D.drawLine(75, 140, 85, 160); // 오른 다리

                            break;

                }

          }



          if (level == 1) {

                switch (guessNum) {

                      case 1:

                            screen2D.drawOval(60, 80, 20, 20); // 얼굴

                            break;

                      case 2:

                            screen2D.drawOval(60, 80, 20, 20); // 얼굴

                            screen2D.drawOval(60, 100, 20, 40); // 몸통

                            break;

                      case 3:

                            screen2D.drawOval(60, 80, 20, 20); // 얼굴

                            screen2D.drawOval(60, 100, 20, 40); // 몸통

                            screen2D.drawLine(58, 115, 48, 130); // 왼 팔

                            break;

                      case 4:

                            screen2D.drawOval(60, 80, 20, 20); // 얼굴

                            screen2D.drawOval(60, 100, 20, 40); // 몸통

                            screen2D.drawLine(58, 115, 48, 130); // 왼 팔

                            screen2D.drawLine(82, 115, 92, 130); // 오른 팔

                            break;

                      case 5:

                            screen2D.drawOval(60, 80, 20, 20); // 얼굴

                            screen2D.drawOval(60, 100, 20, 40); // 몸통

                            screen2D.drawLine(58, 115, 48, 130); // 왼 팔

                            screen2D.drawLine(82, 115, 92, 130); // 오른 팔

                            break;

                      case 6:

                            screen2D.drawOval(60, 80, 20, 20); // 얼굴

                            screen2D.drawOval(60, 100, 20, 40); // 몸통

                            screen2D.drawLine(58, 115, 48, 130); // 왼 팔

                            screen2D.drawLine(82, 115, 92, 130); // 오른 팔

                            screen2D.drawLine(65, 140, 55, 160); // 왼 다리

                            break;

                      case 7:

                            screen2D.drawOval(60, 80, 20, 20); // 얼굴

                            screen2D.drawOval(60, 100, 20, 40); // 몸통

                            screen2D.drawLine(58, 115, 48, 130); // 왼 팔

                            screen2D.drawLine(82, 115, 92, 130); // 오른 팔

                            screen2D.drawLine(65, 140, 55, 160); // 왼 다리

                            break;

                      case 8:

                            screen2D.drawOval(60, 80, 20, 20); // 얼굴

                            screen2D.drawOval(60, 100, 20, 40); // 몸통

                            screen2D.drawLine(58, 115, 48, 130); // 왼 팔

                            screen2D.drawLine(82, 115, 92, 130); // 오른 팔

                            screen2D.drawLine(65, 140, 55, 160); // 왼 다리

                            screen2D.drawLine(75, 140, 85, 160); // 오른 다리

                            break;

                }

          }



          if (level == 2) {

                switch (guessNum) {

                      case 1:

                            screen2D.drawOval(60, 80, 20, 20); // 얼굴

                            break;

                      case 2:

                            screen2D.drawOval(60, 80, 20, 20); // 얼굴

                            screen2D.drawOval(60, 100, 20, 40); // 몸통

                            break;

                      case 3:

                            screen2D.drawOval(60, 80, 20, 20); // 얼굴

                            screen2D.drawOval(60, 100, 20, 40); // 몸통

                            screen2D.drawLine(58, 115, 48, 130); // 왼 팔

                            break;

                      case 4:

                            screen2D.drawOval(60, 80, 20, 20); // 얼굴

                            screen2D.drawOval(60, 100, 20, 40); // 몸통

                            screen2D.drawLine(58, 115, 48, 130); // 왼 팔

                            screen2D.drawLine(82, 115, 92, 130); // 오른 팔

                            break;

                      case 5:

                            screen2D.drawOval(60, 80, 20, 20); // 얼굴

                            screen2D.drawOval(60, 100, 20, 40); // 몸통

                            screen2D.drawLine(58, 115, 48, 130); // 왼 팔

                            screen2D.drawLine(82, 115, 92, 130); // 오른 팔

                            screen2D.drawLine(65, 140, 55, 160); // 왼 다리

                            break;

                      case 6:

                            screen2D.drawOval(60, 80, 20, 20); // 얼굴

                            screen2D.drawOval(60, 100, 20, 40); // 몸통

                            screen2D.drawLine(58, 115, 48, 130); // 왼 팔

                            screen2D.drawLine(82, 115, 92, 130); // 오른 팔

                            screen2D.drawLine(65, 140, 55, 160); // 왼 다리

                            screen2D.drawLine(75, 140, 85, 160); // 오른 다리

                            break;

                }

          }



          screen2D.setColor(Color.RED);

          screen2D.drawString(Integer.toString(guessNum) + " guesses left", 340, 240);

          screen2D.setFont(normalFont);

          screen2D.setColor(Color.BLACK);

          screen2D.drawString("Current skill level: " + slevel[level], 300, 220);

          screen2D.drawString("Wins ", 220, 200);

          screen2D.drawString(Integer.toString((int) wins), 265, 200);

          screen2D.drawString("Looses", 300, 200);

          screen2D.drawString(Integer.toString((int) looses), 365, 200);

          screen2D.drawString("WinningProsentige", 400, 200);

          screen2D.drawString(Double.toString(winningProsentige) + "%", 555, 200);

          screen2D.setFont(normalFont);

          screen2D.setColor(Color.BLACK);



          if (word_length == 4) { // 단어의 길이 4-12로 제한

                for(int count=0; count<4; count++) {

                      screen2D.drawString(word2[count], 300+20*count, 150);

                }

          }

          if (word_length == 5) { // 단어의 길이 4-12로 제한

                for(int count=0; count<5; count++) {

                      screen2D.drawString(word2[count], 300+20*count, 150);

                }

          }

          if (word_length == 6) { // 단어의 길이 4-12로 제한

                for(int count=0; count<6; count++) {

                      screen2D.drawString(word2[count], 300+20*count, 152);

                }

          }

          if (word_length == 7) { // 단어의 길이 4-12로 제한

                for(int count=0; count<7; count++) {

                      screen2D.drawString(word2[count], 300+20*count, 153);

                }

          }

          if (word_length == 8) { // 단어의 길이 4-12로 제한

                for(int count=0; count<8; count++) {

                      screen2D.drawString(word2[count], 300+20*count, 155);

                }

          }

          if (word_length == 9) { // 단어의 길이 4-12로 제한

                for(int count=0; count<9; count++) {

                      screen2D.drawString(word2[count], 300+20*count, 156);

                }

          }

          if (word_length == 10) { // 단어의 길이 4-12로 제한

                for(int count=0; count<10; count++) {

                      screen2D.drawString(word2[count], 300+20*count, 158);

                }

          }

          if (word_length == 11) { // 단어의 길이 4-12로 제한

                for(int count=0; count<11; count++) {

                      screen2D.drawString(word2[count], 300+20*count, 160);

                }

          }

          if (word_length == 12) { // 단어의 길이 4-12로 제한

                for(int count=0; count<12; count++) {

                      screen2D.drawString(word2[count], 300+20*count, 160);

                }

          }

          // 답이 맞은 단어에 대한 화면 표시

          // 답이 틀린 단어에 대한 화면 표시

          // 시도한 횟수에 대하여 맞은 단어와 틀린 단어의 수 등을 표시

    }



    public void wordSelect() {

          double sel_num = Math.random() * 201;// 0~200.xx

          int selection = (int) Math.floor(sel_num); // 0~200

          while(true) { /* 이미 선택된 단어가 다시 선택되는 경우는 배제해야 함 */ // 나왔던 단어가 또 나오면 안됨

                if(checked[selection] == 0) { // 아직 뽑힌 단어가 아니라면 0

                      checked[selection] = 1;

                      break;

                } else {

                      selection = (int) Math.floor(Math.random() * 201);

                }

          }

          String sel_Word;

          if(words[selection] != null) { // 고른 단어가 null이 아닐때까지

                sel_Word = words[selection].toLowerCase();

                word_length = sel_Word.length();



                char[] temp = sel_Word.toCharArray(); // character 배열로 변환

                for(int index1 = 0; index1 < word_length; index1++) {

                      word1[index1] = temp[index1];

                }

                for(int index2 = 0; index2 < word_length; index2++) {

                      word2[index2] = "[]"; // _로 유저에게 단어의 철자 수를 알려줌

                }

          }

    }



    public void word_reset() {

          for (int i = 0; i < 12; i++) {

                word2[i] = "[]";

          }

          wordSelect();

    }



    public void spell_check(char spell) {

          int check_key = 0;

          for (int i = 0; i < 12; i++) { // 12는 좋은 표현이 아님

                if (word1[i] != ' ') {

                      if (word1[i] == spell) {

                            word2[i] = "" + spell;

                            check_key = 1;

                            repaint();

                      }

                }

          }



          if (check_key == 0) { // 끝까지 다 찾았는데 check_key가 0이면 특정 알파(a)가 없음

                guessNum--;

                repaint();

          }

          Adjust_display();

          repaint();

    }



    public void Adjust_display() {

          if (word_length == 4) {

                if (word2[0] != "[]" && word2[1] != "[]" && word2[2] != "[]" && word2[3] != "[]") {

                      // 단어 추정 성공

                      a.setEnabled(false); b.setEnabled(false);

                      c.setEnabled(false); d.setEnabled(false);

                      e.setEnabled(false); f.setEnabled(false);

                      g.setEnabled(false); h.setEnabled(false);

                      i.setEnabled(false); j.setEnabled(false);

                      k.setEnabled(false); l.setEnabled(false);

                      m.setEnabled(false); n.setEnabled(false);

                      o.setEnabled(false); p.setEnabled(false);

                      q.setEnabled(false); r.setEnabled(false);

                      s.setEnabled(false); t.setEnabled(false);

                      u.setEnabled(false); v.setEnabled(false);

                      w.setEnabled(false); x.setEnabled(false);

                      y.setEnabled(false); z.setEnabled(false);

                      begin.setEnabled(true);

                      if (level == 0) {

                            medium.setEnabled(true);

                            hard.setEnabled(true);

                      } else if (level == 1) {

                            easy.setEnabled(true);

                            hard.setEnabled(true);

                      } else if (level == 2) {

                            easy.setEnabled(true);

                            medium.setEnabled(true);

                      }

                      wins++;

                      winningProsentige = (wins / (wins + looses)) * 100.0;

                      repaint();

                }

          }

          if (word_length == 5) {

                if (word2[0] != "[]" && word2[1] != "[]" && word2[2] != "[]" && word2[3] != "[]" && word2[4] != "[]" ) {

                      // 단어 추정 성공

                      a.setEnabled(false); b.setEnabled(false);

                      c.setEnabled(false); d.setEnabled(false);

                      e.setEnabled(false); f.setEnabled(false);

                      g.setEnabled(false); h.setEnabled(false);

                      i.setEnabled(false); j.setEnabled(false);

                      k.setEnabled(false); l.setEnabled(false);

                      m.setEnabled(false); n.setEnabled(false);

                      o.setEnabled(false); p.setEnabled(false);

                      q.setEnabled(false); r.setEnabled(false);

                      s.setEnabled(false); t.setEnabled(false);

                      u.setEnabled(false); v.setEnabled(false);

                      w.setEnabled(false); x.setEnabled(false);

                      y.setEnabled(false); z.setEnabled(false);

                      begin.setEnabled(true);

                      if (level == 0) {

                            medium.setEnabled(true);

                            hard.setEnabled(true);

                      } else if (level == 1) {

                            easy.setEnabled(true);

                            hard.setEnabled(true);

                      } else if (level == 2) {

                            easy.setEnabled(true);

                            medium.setEnabled(true);

                      }

                      wins++;

                      winningProsentige = (wins / (wins + looses)) * 100.0;

                      repaint();

                }

          }

          if (word_length == 6) {

                if (word2[0] != "[]" && word2[1] != "[]" && word2[2] != "[]" && word2[3] != "[]" && word2[4] != "[]" && word2[5] != "[]" ) {

                      // 단어 추정 성공

                      a.setEnabled(false); b.setEnabled(false);

                      c.setEnabled(false); d.setEnabled(false);

                      e.setEnabled(false); f.setEnabled(false);

                      g.setEnabled(false); h.setEnabled(false);

                      i.setEnabled(false); j.setEnabled(false);

                      k.setEnabled(false); l.setEnabled(false);

                      m.setEnabled(false); n.setEnabled(false);

                      o.setEnabled(false); p.setEnabled(false);

                      q.setEnabled(false); r.setEnabled(false);

                      s.setEnabled(false); t.setEnabled(false);

                      u.setEnabled(false); v.setEnabled(false);

                      w.setEnabled(false); x.setEnabled(false);

                      y.setEnabled(false); z.setEnabled(false);

                      begin.setEnabled(true);

                      if (level == 0) {

                            medium.setEnabled(true);

                            hard.setEnabled(true);

                      } else if (level == 1) {

                            easy.setEnabled(true);

                            hard.setEnabled(true);

                      } else if (level == 2) {

                            easy.setEnabled(true);

                            medium.setEnabled(true);

                      }

                      wins++;

                      winningProsentige = (wins / (wins + looses)) * 100.0;

                      repaint();

                }

          }

          if (word_length == 7) {

                if (word2[0] != "[]" && word2[1] != "[]" && word2[2] != "[]" && word2[3] != "[]" && word2[4] != "[]" && word2[5] != "[]" && word2[6] != "[]" ) {

                      // 단어 추정 성공

                      a.setEnabled(false); b.setEnabled(false);

                      c.setEnabled(false); d.setEnabled(false);

                      e.setEnabled(false); f.setEnabled(false);

                      g.setEnabled(false); h.setEnabled(false);

                      i.setEnabled(false); j.setEnabled(false);

                      k.setEnabled(false); l.setEnabled(false);

                      m.setEnabled(false); n.setEnabled(false);

                      o.setEnabled(false); p.setEnabled(false);

                      q.setEnabled(false); r.setEnabled(false);

                      s.setEnabled(false); t.setEnabled(false);

                      u.setEnabled(false); v.setEnabled(false);

                      w.setEnabled(false); x.setEnabled(false);

                      y.setEnabled(false); z.setEnabled(false);

                      begin.setEnabled(true);

                      if (level == 0) {

                            medium.setEnabled(true);

                            hard.setEnabled(true);

                      } else if (level == 1) {

                            easy.setEnabled(true);

                            hard.setEnabled(true);

                      } else if (level == 2) {

                            easy.setEnabled(true);

                            medium.setEnabled(true);

                      }

                      wins++;

                      winningProsentige = (wins / (wins + looses)) * 100.0;

                      repaint();

                }

          }

          if (word_length == 8) {

                if (word2[0] != "[]" && word2[1] != "[]" && word2[2] != "[]" && word2[3] != "[]" && word2[4] != "[]" && word2[5] != "[]" && word2[6] != "[]" && word2[7] != "[]" ) {

                      // 단어 추정 성공

                      a.setEnabled(false); b.setEnabled(false);

                      c.setEnabled(false); d.setEnabled(false);

                      e.setEnabled(false); f.setEnabled(false);

                      g.setEnabled(false); h.setEnabled(false);

                      i.setEnabled(false); j.setEnabled(false);

                      k.setEnabled(false); l.setEnabled(false);

                      m.setEnabled(false); n.setEnabled(false);

                      o.setEnabled(false); p.setEnabled(false);

                      q.setEnabled(false); r.setEnabled(false);

                      s.setEnabled(false); t.setEnabled(false);

                      u.setEnabled(false); v.setEnabled(false);

                      w.setEnabled(false); x.setEnabled(false);

                      y.setEnabled(false); z.setEnabled(false);

                      begin.setEnabled(true);

                      if (level == 0) {

                            medium.setEnabled(true);

                            hard.setEnabled(true);

                      } else if (level == 1) {

                            easy.setEnabled(true);

                            hard.setEnabled(true);

                      } else if (level == 2) {

                            easy.setEnabled(true);

                            medium.setEnabled(true);

                      }

                      wins++;

                      winningProsentige = (wins / (wins + looses)) * 100.0;

                      repaint();

                }

          }

          if (word_length == 9) {

                if (word2[0] != "[]" && word2[1] != "[]" && word2[2] != "[]" && word2[3] != "[]" && word2[4] != "[]" && word2[5] != "[]" && word2[6] != "[]" && word2[7] != "[]" && word2[8] != "[]" ) {

                      // 단어 추정 성공

                      a.setEnabled(false); b.setEnabled(false);

                      c.setEnabled(false); d.setEnabled(false);

                      e.setEnabled(false); f.setEnabled(false);

                      g.setEnabled(false); h.setEnabled(false);

                      i.setEnabled(false); j.setEnabled(false);

                      k.setEnabled(false); l.setEnabled(false);

                      m.setEnabled(false); n.setEnabled(false);

                      o.setEnabled(false); p.setEnabled(false);

                      q.setEnabled(false); r.setEnabled(false);

                      s.setEnabled(false); t.setEnabled(false);

                      u.setEnabled(false); v.setEnabled(false);

                      w.setEnabled(false); x.setEnabled(false);

                      y.setEnabled(false); z.setEnabled(false);

                      begin.setEnabled(true);

                      if (level == 0) {

                            medium.setEnabled(true);

                            hard.setEnabled(true);

                      } else if (level == 1) {

                            easy.setEnabled(true);

                            hard.setEnabled(true);

                      } else if (level == 2) {

                            easy.setEnabled(true);

                            medium.setEnabled(true);

                      }

                      wins++;

                      winningProsentige = (wins / (wins + looses)) * 100.0;

                      repaint();

                }

          }

          if (word_length == 10) {

                if (word2[0] != "[]" && word2[1] != "[]" && word2[2] != "[]" && word2[3] != "[]" && word2[4] != "[]" && word2[5] != "[]" && word2[6] != "[]" && word2[7] != "[]" && word2[8] != "[]" && word2[9] != "[]" ) {

                      // 단어 추정 성공

                      a.setEnabled(false); b.setEnabled(false);

                      c.setEnabled(false); d.setEnabled(false);

                      e.setEnabled(false); f.setEnabled(false);

                      g.setEnabled(false); h.setEnabled(false);

                      i.setEnabled(false); j.setEnabled(false);

                      k.setEnabled(false); l.setEnabled(false);

                      m.setEnabled(false); n.setEnabled(false);

                      o.setEnabled(false); p.setEnabled(false);

                      q.setEnabled(false); r.setEnabled(false);

                      s.setEnabled(false); t.setEnabled(false);

                      u.setEnabled(false); v.setEnabled(false);

                      w.setEnabled(false); x.setEnabled(false);

                      y.setEnabled(false); z.setEnabled(false);

                      begin.setEnabled(true);

                      if (level == 0) {

                            medium.setEnabled(true);

                            hard.setEnabled(true);

                      } else if (level == 1) {

                            easy.setEnabled(true);

                            hard.setEnabled(true);

                      } else if (level == 2) {

                            easy.setEnabled(true);

                            medium.setEnabled(true);

                      }

                      wins++;

                      winningProsentige = (wins / (wins + looses)) * 100.0;

                      repaint();

                }

          }

          if (word_length == 11) {

                if (word2[0] != "[]" && word2[1] != "[]" && word2[2] != "[]" && word2[3] != "[]" && word2[4] != "[]" && word2[5] != "[]" && word2[6] != "[]" && word2[7] != "[]" && word2[8] != "[]" && word2[9] != "[]" && word2[10] != "[]" ) {

                      // 단어 추정 성공

                      a.setEnabled(false); b.setEnabled(false);

                      c.setEnabled(false); d.setEnabled(false);

                      e.setEnabled(false); f.setEnabled(false);

                      g.setEnabled(false); h.setEnabled(false);

                      i.setEnabled(false); j.setEnabled(false);

                      k.setEnabled(false); l.setEnabled(false);

                      m.setEnabled(false); n.setEnabled(false);

                      o.setEnabled(false); p.setEnabled(false);

                      q.setEnabled(false); r.setEnabled(false);

                      s.setEnabled(false); t.setEnabled(false);

                      u.setEnabled(false); v.setEnabled(false);

                      w.setEnabled(false); x.setEnabled(false);

                      y.setEnabled(false); z.setEnabled(false);

                      begin.setEnabled(true);

                      if (level == 0) {

                            medium.setEnabled(true);

                            hard.setEnabled(true);

                      } else if (level == 1) {

                            easy.setEnabled(true);

                            hard.setEnabled(true);

                      } else if (level == 2) {

                            easy.setEnabled(true);

                            medium.setEnabled(true);

                      }

                      wins++;

                      winningProsentige = (wins / (wins + looses)) * 100.0;

                      repaint();

                }

          }

          if (word_length == 12) {

                if (word2[0] != "[]" && word2[1] != "[]" && word2[2] != "[]" && word2[3] != "[]" && word2[4] != "[]" && word2[5] != "[]" && word2[6] != "[]" && word2[7] != "[]" && word2[8] != "[]" && word2[9] != "[]" && word2[10] != "[]" && word2[11] != "[]" ) {

                      // 단어 추정 성공

                      a.setEnabled(false); b.setEnabled(false);

                      c.setEnabled(false); d.setEnabled(false);

                      e.setEnabled(false); f.setEnabled(false);

                      g.setEnabled(false); h.setEnabled(false);

                      i.setEnabled(false); j.setEnabled(false);

                      k.setEnabled(false); l.setEnabled(false);

                      m.setEnabled(false); n.setEnabled(false);

                      o.setEnabled(false); p.setEnabled(false);

                      q.setEnabled(false); r.setEnabled(false);

                      s.setEnabled(false); t.setEnabled(false);

                      u.setEnabled(false); v.setEnabled(false);

                      w.setEnabled(false); x.setEnabled(false);

                      y.setEnabled(false); z.setEnabled(false);

                      begin.setEnabled(true);

                      if (level == 0) {

                            medium.setEnabled(true);

                            hard.setEnabled(true);

                      } else if (level == 1) {

                            easy.setEnabled(true);

                            hard.setEnabled(true);

                      } else if (level == 2) {

                            easy.setEnabled(true);

                            medium.setEnabled(true);

                      }

                      wins++;

                      winningProsentige = (wins / (wins + looses)) * 100.0;

                      repaint();

                }

          }



          if (guessNum <= 0) { // 단어 추정 실패



                // 버튼 눌릴 수 없게 만듬

                a.setEnabled(false); b.setEnabled(false);

                c.setEnabled(false); d.setEnabled(false);

                e.setEnabled(false); f.setEnabled(false);

                g.setEnabled(false); h.setEnabled(false);

                i.setEnabled(false); j.setEnabled(false);

                k.setEnabled(false); l.setEnabled(false);

                m.setEnabled(false); n.setEnabled(false);

                o.setEnabled(false); p.setEnabled(false);

                q.setEnabled(false); r.setEnabled(false);

                s.setEnabled(false); t.setEnabled(false);

                u.setEnabled(false); v.setEnabled(false);

                w.setEnabled(false); x.setEnabled(false);

                y.setEnabled(false); z.setEnabled(false);



                // 정답을 화면에 표시

                for (int i = 0; i < 12; i++) {

                      word2[i] = "" + word1[i];

                }



                begin.setEnabled(true);

                // level에 따른 버튼 활성화 작업

                if (level == 0) {

                      medium.setEnabled(true);

                      hard.setEnabled(true);

                } else if (level == 1) {

                      easy.setEnabled(true);

                      hard.setEnabled(true);

                } else if (level == 2) {

                      easy.setEnabled(true);

                      medium.setEnabled(true);

                }

                looses++;

                winningProsentige = (wins / (wins + looses)) * 100.0;

                repaint();

          }

    }



    public void actionPerformed(ActionEvent event) {

          String typed = event.getActionCommand(); // 어떤 버튼을 눌렀는지 알려줌

          if (typed.equals("BEGIN")) {

                for (int i = 0; i < 12; i++) {

                      word1[i] = ' ';

                      word2[i] = "[]";

                }



                easy.setEnabled(false);

                medium.setEnabled(false);

                hard.setEnabled(false);



                if (level == 0) {

                      guessNum = 10;

                } else if (level == 1) {

                      guessNum = 8;

                } else if (level == 2) {

                      guessNum = 6;

                }



                repaint();

                a.setEnabled(true); b.setEnabled(true);

                c.setEnabled(true); d.setEnabled(true);

                e.setEnabled(true); f.setEnabled(true);

                g.setEnabled(true); h.setEnabled(true);

                i.setEnabled(true); j.setEnabled(true);

                k.setEnabled(true); l.setEnabled(true);

                m.setEnabled(true); n.setEnabled(true);

                o.setEnabled(true); p.setEnabled(true);

                q.setEnabled(true); r.setEnabled(true);

                s.setEnabled(true); t.setEnabled(true);

                u.setEnabled(true); v.setEnabled(true);

                w.setEnabled(true); x.setEnabled(true);

                y.setEnabled(true); z.setEnabled(true);



                begin.setEnabled(false);

                word_reset();

          }

          if (typed.equals("A")) {

                a.setEnabled(false);

                spell_check('a');

          }

          if (typed.equals("B")) {

                b.setEnabled(false);

                spell_check('b');

          }

          if (typed.equals("C")) {

                c.setEnabled(false);

                spell_check('c');

          }

          if (typed.equals("D")) {

                d.setEnabled(false);

                spell_check('d');

          }

          if (typed.equals("E")) {

                e.setEnabled(false);

                spell_check('e');

          }

          if (typed.equals("F")) {

                f.setEnabled(false);

                spell_check('f');

          }

          if (typed.equals("G")) {

                g.setEnabled(false);

                spell_check('g');

          }

          if (typed.equals("H")) {

                h.setEnabled(false);

                spell_check('h');

          }

          if (typed.equals("I")) {

                i.setEnabled(false);

                spell_check('i');

          }

          if (typed.equals("J")) {

                j.setEnabled(false);

                spell_check('j');

          }

          if (typed.equals("K")) {

                k.setEnabled(false);

                spell_check('k');

          }

          if (typed.equals("L")) {

                l.setEnabled(false);

                spell_check('l');

          }

          if (typed.equals("M")) {

                m.setEnabled(false);

                spell_check('m');

          }

          if (typed.equals("N")) {

                n.setEnabled(false);

                spell_check('n');

          }

          if (typed.equals("O")) {

                o.setEnabled(false);

                spell_check('o');

          }

          if (typed.equals("P")) {

                p.setEnabled(false);

                spell_check('p');

          }

          if (typed.equals("Q")) {

                q.setEnabled(false);

                spell_check('q');

          }

          if (typed.equals("R")) {

                r.setEnabled(false);

                spell_check('r');

          }

          if (typed.equals("S")) {

                s.setEnabled(false);

                spell_check('s');

          }

          if (typed.equals("T")) {

                t.setEnabled(false);

                spell_check('t');

          }

          if (typed.equals("U")) {

                u.setEnabled(false);

                spell_check('u');

          }

          if (typed.equals("V")) {

                v.setEnabled(false);

                spell_check('v');

          }

          if (typed.equals("W")) {

                w.setEnabled(false);

                spell_check('w');

          }

          if (typed.equals("X")) {

                x.setEnabled(false);

                spell_check('x');

          }

          if (typed.equals("Y")) {

                y.setEnabled(false);

                spell_check('y');

          }

          if (typed.equals("Z")) {

                z.setEnabled(false);

                spell_check('z');

          }

          if (typed.equals("EASY")) {

                easy.setEnabled(false);

                medium.setEnabled(true);

                hard.setEnabled(true);

                level = 0;

                guessNum = 10;

                repaint();

          }

          if (typed.equals("MEDIUM")) {

                easy.setEnabled(true);

                medium.setEnabled(false);

                hard.setEnabled(true);

                level = 1;

                guessNum = 8;

                repaint();

          }

          if (typed.equals("HARD")) {

                easy.setEnabled(true);

                medium.setEnabled(true);

                hard.setEnabled(false);

                level = 2;

                guessNum = 6;

                repaint();

          }

    }



    public static void main(String[] args) {

          Hangman h = new Hangman();

          h.init();
        
    }

}