package gui.register.join;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import gui.member.Register;
import gui.register.dao.LoginDAO;
import gui.register.dao.RegisterDAO;
import gui.register.model.Member;
import gui.register.module.PasswordEncryption;

public class JoinFrame extends JFrame{
	
	RegisterDAO register = new RegisterDAO();
	LoginDAO login = new LoginDAO();
	
	
	JFrame parent; // LoginFrame을 바라본다.
	JFrame child = this; // JoinFrame을 바라본다.
	// 아이디, 이름, 나이, 주민등록번호 맨 앞자리 까지, 관심분야, SNS 수신 동의 여부, 이메일, 핸드폰 번호 가입일
	JTextField id_field = new JTextField("abc123") {
		{
			setBounds(50, 50, 200, 30);
		}
	}; 
	
	JPasswordField pw_field = new JPasswordField("1234") {
		{
			setBounds(50, 100, 200, 30);
		}
	};
	
	JTextField name_field = new JTextField("김말이") {
		{
			setBounds(50, 150, 200, 30);
		}
	};
	
	
	JTextField age_field = new JTextField("23") {
		{
			setBounds(50, 200, 200, 30);
		}
	};
	
	JTextField social_number_field = new JTextField("881111-1") {
		{
			setBounds(50, 250, 200, 30);
		}
	};
	JCheckBox soccer = new JCheckBox("축구") {
		{
			setBounds(50, 300, 50, 30);
		}
	};
	
	JCheckBox basketball = new JCheckBox("농구") {
		{
			setBounds(100, 300, 50, 30);
		}
	};
	
	JCheckBox movie = new JCheckBox("영화") {
		{
			setBounds(150, 300, 50, 30);
		}
	};
	
	JCheckBox drama = new JCheckBox("드라마") {
		{
			setBounds(200, 300, 65, 30);
		}
	};
	
	JCheckBox bike = new JCheckBox("자전거") {
		{
			setBounds(265, 300, 65, 30);
		}
	};
	
	JCheckBox sms_box = new JCheckBox("~~~동의합니다.") {
		{
			setBounds(50, 300, 200, 30);
		}
		
	}; 
	
	JTextField email_field = new JTextField("email@abc.com") {
		{
			setBounds(50, 350, 200, 30);
		}
	};
	
	JTextField phone_field = new JTextField("01012345678") {
		{
			setBounds(50, 400, 200, 30);
		}
	};
	
	JButton join_button = new JButton("가입하기") {
		{
			setBounds(50, 450, 120, 30);
			addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// 입력값 검증
					if (!fieldValidate()) {
						return;
					}
					// DB에 회원 정보 쓰기
					Member mem = new Member();
					mem.setMem_id(id_field.getText());
					
					String encrypted_password = PasswordEncryption.encrypt(pw_field.getPassword());
					mem.setPassword(encrypted_password);
					mem.setSms(sms_box.isSelected());
					mem.setPhone_Number(phone_field.getText());
					mem.setEmail(email_field.getText());
					mem.setAge(Integer.parseInt(age_field.getText()));
					mem.setMem_name(name_field.getText());
					
					
					List<String> interest = new ArrayList<>();
					for (JCheckBox interest_field : interest_fields) {
						if (interest_field.isSelected()) {
							interest.add(interest_field.getName());
						}
					}
					
					// 1개 또는 2개만 선택했을 때 빈곳에 null 채우기
					while (interest.size() != 3) {
						interest.add(null);
					}
					
					mem.setInterest1(interest.get(0));
					mem.setInterest2(interest.get(1));
					mem.setInterest3(interest.get(2));
					
					
					
					// 881111-1
					char ch = social_number_field.getText().charAt(7);
					if (ch == '1' || ch == '3') {
						mem.setGender("남");
					} else {
						mem.setGender("여");
					}
					
					int birth = Integer.parseInt(social_number_field.getText().substring(0,6));
					// java.sql.Date.valueOf(LocalDate) 활용
					// 리턴되는 타입은 java.sql.Date이지만
					// java.sql.Date는 java.util.Date의 자식이므로 업캐스팅이 가능하다.
					mem.setBirthday(java.sql.Date.valueOf(LocalDate.of(
							(ch <= '2' ? 1900 : 2000) + birth / 10000,
							birth % 10000 / 100,
							birth % 100
					)));
					register.registerMember(mem);
				}
			});
		}
	};
	
	JButton cancel_button = new JButton("취소") {
		{
			setBounds(200, 450, 120, 30);
			addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					parent.setVisible(true);
					child.setVisible(false);
				}
			});
		}
	};
	
	List<JCheckBox> interest_fields = new ArrayList<>() {
		{
			add(soccer);
			add(basketball);
			add(movie);
			add(drama);
			add(bike);
		}
	};
	
	public JoinFrame(JFrame parent) {
		this.parent = parent;
		add(id_field);
		add(name_field);
		add(age_field);
		add(social_number_field);
		for (JCheckBox interset_field : interest_fields) {
			add(interset_field);
		}
		add(sms_box);
		add(email_field);
		add(phone_field);
		add(join_button);
		add(cancel_button);
		add(pw_field);
		setLayout(null);
		setSize(400, 600);
		setLocation(900, 100);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}

	public void open() {
		setVisible(true);
		parent.dispose(); // LoginFrame을 숨기는 메서드
	}
	
	public boolean fieldValidate() {
		
		return true;
	}
	
}
