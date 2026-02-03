package kr.co.training;

public class Ex21_2_Warlord extends Ex21_2_Character {
	// Character 클래스를 상속받습니다.
	
	// 객체 생성 시 힘50, 민첩10, 지력10, 레벨1로 생성
	//	- 부모 생성자를 호출하세요.
	
	Ex21_2_Warlord() {
		super(50, 10, 10, 1);
	}
	
	// attack 메서드 생성
	//	- "둔기를 휘두릅니다" 출력
	public void attack() {
		System.out.println("둔기를 휘두릅니다.");
	}
	
	// levelUp() 메서드 생성
	//	- "레벨업을 하여 힘이 5 증가합니다." 출력
	//	- "현재 레벨 : OO, 힘 : OO" 출력
	//	- 현재 레벨을 1증가시키고, 힘을 5 증가시킵니다.
	public void levelUp() {
		System.out.println("레벨업을 하여 힘이 5 증가합니다.");
		setLevel(getLevel() + 1); // 현재 레벨 + 1
		setStr(getStr() + 5); // 현재 힘 + 5
		System.out.println("현재 레벨 : " + getLevel() + ", 힘 : " + getStr());
	}

}
