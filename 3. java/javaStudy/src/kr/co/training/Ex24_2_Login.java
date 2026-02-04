package kr.co.training;

public class Ex24_2_Login implements Ex24_2_LoginInterface {
	String memberId = "id";
	String memberPwd = "qwer1234";
	
//  - 사용자가 입력한 아이디와 비밀번호를 매개변수로 받습니다.
//  - 아이디와 비밀번호가 일치한다면 "로그인 되었습니다." 문자열을 반환합니다.
//  - 아이디가 틀렸다면 "아이디가 틀렸습니다." 를 반환합니다.
//  - 비밀번호가 틀렸다면 "비밀번호가 틀렸습니다."를 반환합니다.
	@Override
	public String login (String memberId, String memberPwd) {
		if (this.memberId.equals(memberId) && this.memberPwd.equals(memberPwd)) {
			return "로그인 되었습니다.";
		} else if (this.memberId.equals(memberId) && !this.memberPwd.equals(memberPwd)) {
			return "비밀번호가 틀렸습니다.";
		} else if (!this.memberId.equals(memberId) && this.memberPwd.equals(memberPwd)) {
			return "아이디가 틀렸습니다.";
		} else {
			return "아이디와 비밀번호가 틀렸습니다.";
		}
			
	}

}
