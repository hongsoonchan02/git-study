package kr.co.training;

import java.util.ArrayList;

public class Ex20_3_Member {
//	2. Ex20_3_Member
//	  - introduce 메서드
//	    > Ex20_3_MemberInfo를 매개변수로 받습니다.
//	    > "이름 : "
//	    > "나이 : "
//	    > "사는곳 : "
//	    > "학생여부 : "    (true면 학생, false 학생 아님)
//	 - run 메서드
//	    > Ex20_3_MemberInfo를 매개변수로 받습니다.
//	    > "OOO에 사는 OO이 달리고 있습니다." 출력
	
	public void introduce2(ArrayList<Ex20_3_MemberInfo> memberList) {
		System.out.println(memberList);
	}
	
	
	public void introduce(Ex20_3_MemberInfo mi) {
		System.out.println("이름 : " + mi.getName());
		System.out.println("나이 : " + mi.getAge());
		System.out.println("사는곳 : " + mi.getAddr());
		System.out.println("학생여부 : " + mi.getIsStudent());
	}
	
	public void run(Ex20_3_MemberInfo mi) {
		System.out.println(mi.getAddr() + "에 사는 " + mi.getName() + "이 달리고 있습니다.");
	}
}
