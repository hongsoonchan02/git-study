package kr.co.koreait;

public class Ex23_Ploy {

	public static void main(String[] args) {
		// 부모 클래스 타입으로 객체 생성 (평소 방식)
		Ex23_1_Parent parent = new Ex23_1_Parent();
		parent.printHello();
		
		// 자식 클래스 타입으로 객체 생성 (평소 방식)
		Ex23_1_Child child = new Ex23_1_Child();
		child.displayHello();
		child.printHello();
		
		Ex23_1_Parent p = child; // 클래스 타입 변환+-- 
		
		
		// 클래스 타입 변환 (자식 객체를 부모 타입으로)
		//	- 부모 클래스에 있는 변수와 메서드만 사용 가능
		Ex23_1_Parent p2 = new Ex23_1_Child();
		p.printHello();
		
		Ex23_2_Calendar calendar = new Ex23_2_DeskCalendar("빨강", 8);
		calendar.info();
		calendar.hanging();
//		calendar.onTheDesk();
		
		Ex23_3_ComputerRoom cr = new Ex23_3_ComputerRoom();
		Ex23_3_Samsong samsong = new Ex23_3_Samsong();
		EX23_3_Lz lz = new EX23_3_Lz();
		cr.computer1 = new Ex23_3_Samsong();
		cr.computer2 = new Ex23_3_Samsong();
		cr.computer3 = new Ex23_3_Samsong();
		cr.selectPowerOn(lz);
		
		cr.allPowerOn();
		
	}

}
