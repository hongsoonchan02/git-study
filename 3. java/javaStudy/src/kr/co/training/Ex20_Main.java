package kr.co.training;

import java.util.ArrayList;

public class Ex20_Main {

	public static void main(String[] args) {
		// 생성자로만 필드를 초기화 하는 경우
		//	- 데이터가 불변 (객체 생성 후 값이 변하지 않음)
		Ex20_Animal animal = new Ex20_Animal("초코", 1);
		animal.eat();
		
		// getter/setter를 사용하는 경우
		//	- 객체 생성 후에도 자유롭게 데이터 변경 가능
		//	- 필요한 필드만 setter로 값을 넣을 수 있음
		//		> 초기값 이후 값을 변경할 필요가 없다면 setter 안 만들면 됨
		animal.setName("누렁이");
		animal.setAge(5);
		animal.eat();
		
		Ex20_2_BookInfo bookInfo = new Ex20_2_BookInfo();
		bookInfo.setBookCount(100); // 초기에 100권이 있다
		
		Ex20_2_Book book = new Ex20_2_Book(); // 도서관 객체
		
		//              도서관 정보, 빌릴 책의 수
		book.borrowBook(bookInfo, 3);
		book.returnBook(bookInfo, 7);
		book.showBookCount(bookInfo);
		
//		0. Ex20_Main
//		  - 각각의 객체 생성 후 MemberInfo는 초기 값 setter로 넣기
		Ex20_3_MemberInfo mi = new Ex20_3_MemberInfo();
		Ex20_3_Member member = new Ex20_3_Member();
		ArrayList<Ex20_3_MemberInfo> memberList = new ArrayList<>();
		
		mi.setName("홍길동");
		mi.setAddr("인천시");
		mi.setAge(19);
		mi.setIsStudent(true);
		
		member.introduce(mi);
		member.run(mi);
		member.introduce2(memberList);

	}

}
