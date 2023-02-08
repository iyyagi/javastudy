package gui.member;

public class Register {

	
	/*
	  회원 가입을 받을 수 있는 창을 만들고
	  회원의 다양한 정보를 입력받아 회원정보를 DB에 저장해 보세요.
	 	(1) 회원ID PK, 아이디, 이름, 나이, 주민등록번호 맨 앞자리 까지, 관심분야, SNS 수신 동의 여부, 이메일, 핸드폰 번호 가입일
	 	
	 	(2) 입력한 내용에 대한 유효성 검사를 구현할 것
	 	
	 	(3) 비밀번호는 암호화 하여 DB에 저장(구글링 가능)
	 	
	 	(4) 처음으로는 로그인 창이 등장하고 회원가입 버튼을 누르면 회원가입 창이 나올 것
	 	
	 	(5) 로그인 기능을 구현하여 ID, PASSWORD가 일치하면 로그인 성공 메시지
	 		
	*/
	
	public static void main(String[] args) {
		new MemberMainFrame();
	}
}
