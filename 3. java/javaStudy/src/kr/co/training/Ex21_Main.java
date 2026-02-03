package kr.co.training;

public class Ex21_Main {

	public static void main(String[] args) {
//		Ex21_1_Order order = new Ex21_1_Order();
//		order.setNumber("ORDER5");
//		order.setStatus("결제 완료");
//		order.setAmount(85.1);
//		order.setAmount(125.4);
//		order.setAmount(15.7);
//		order.setAmount(155.1);
//		
//		Ex21_2_Warlord warload = new Ex21_2_Warlord();
//		warload.attack();
//		warload.levelUp();
//		warload.levelUp();
//		warload.levelUp();
//		warload.walk();
//		warload.stop();
//		warload.levelUp();
		
		// -------------------------------------------------------
		// 캐릭터의 능력치를 가진 객체
		Ex21_3_CharacterAbility ca = new Ex21_3_CharacterAbility();
		
		Ex21_3_Sorceress sorceress2 = new Ex21_3_Sorceress(ca, null);
		
		// 소서리스 객체
		Ex21_3_Sorceress sorceress = new Ex21_3_Sorceress(ca, sorceress2);
		System.out.println(ca);
		sorceress.attack(ca);
		System.out.println(ca);
		sorceress.attack(ca);
		System.out.println(ca);
		sorceress.attack(ca);
		System.out.println(ca);
		sorceress.attack(ca);
		System.out.println(ca);
		sorceress.attack(ca);
		System.out.println(ca);
		sorceress.attack(ca);


	}

}
