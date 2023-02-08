package gui.quiz.membership.database;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MemberUser {

	private static Integer member_num;
	private static String member_id; 
	private static String member_pw;
	private static String member_name; 
	private static Integer member_age;
	private static Integer member_jumin;
	private static String member_hobby;
	private static String member_exist;
	private static String member_email;
	private static String member_phone;
	private static String member_joindate;
	JTextField idInput;
	JPasswordField pwInput;
	
	public MemberUser() {
	
	}

	@Override
	public String toString() {
		return String.format("[%s, %s]", member_id, member_pw);
	}

	public static Integer getMember_num() {
		return member_num;
	}

	public static void setMember_num(Integer member_num) {
		MemberUser.member_num = member_num;
	}

	public static String getMember_id() {
		return member_id;
	}

	public static void setMember_id(String member_id) {
		MemberUser.member_id = member_id;
	}

	public static String getMember_pw() {
		return member_pw;
	}

	public static void setMember_pw(String member_pw) {
		MemberUser.member_pw = member_pw;
	}

	public static String getMember_name() {
		return member_name;
	}

	public static void setMember_name(String member_name) {
		MemberUser.member_name = member_name;
	}

	public static Integer getMember_age() {
		return member_age;
	}

	public static void setMember_age(Integer member_age) {
		MemberUser.member_age = member_age;
	}

	public static Integer getMember_jumin() {
		return member_jumin;
	}

	public static void setMember_jumin(Integer member_jumin) {
		MemberUser.member_jumin = member_jumin;
	}

	public static String getMember_hobby() {
		return member_hobby;
	}

	public static void setMember_hobby(String member_hobby) {
		MemberUser.member_hobby = member_hobby;
	}

	public static String getMember_exist() {
		return member_exist;
	}

	public static void setMember_exist(String member_exist) {
		MemberUser.member_exist = member_exist;
	}

	public static String getMember_email() {
		return member_email;
	}

	public static void setMember_email(String member_email) {
		MemberUser.member_email = member_email;
	}

	public static String getMember_phone() {
		return member_phone;
	}

	public static void setMember_phone(String member_phone) {
		MemberUser.member_phone = member_phone;
	}

	public static String getMember_joindate() {
		return member_joindate;
	}

	public static void setMember_joindate(String member_joindate) {
		MemberUser.member_joindate = member_joindate;
	}
	
	
	
	
	
	
}
