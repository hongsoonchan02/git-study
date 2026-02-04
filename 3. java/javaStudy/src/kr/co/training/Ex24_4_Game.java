package kr.co.training;

import java.util.Scanner;

public class Ex24_4_Game {
	
	// Scanner 객체 생성
	// Warlod 객체 생성
	// CharacterAbility 객체 생성
	static Ex24_4_MonsterAbility ma = new Ex24_4_MonsterAbility();
	static Scanner sc = new Scanner(System.in);
	static Ex24_4_Warlord w = new Ex24_4_Warlord(ma);
	static Ex24_4_CharacterAbility ca = new Ex24_4_CharacterAbility();
	
	public static void main(String[] args) {
		startGame(); // 게임 시작
	}
	
	public static void startGame() {
		
		do { // 게임 시작
			System.out.println("게임 메뉴를 선택해주세요.");
			System.out.println("1. 사냥 시작");
			System.out.println("2. 인벤토리-포션");
			System.out.println("3. 스텟");
			System.out.println("4. 케릭터 정보 확인");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			System.out.println("================");
			if(menu == 1) {
				huntMenu(); // 사냥 시작
			} else if(menu == 2) {
				setPorsion(); // 인벤토리-포션
			} else if(menu == 3) {
				setStatus(); // 스텟
			} else if(menu == 4) {
				getCharInfo(); // 케릭터 정보 확인
			} else if(menu == 0) {
				System.out.println("게임을 종료합니다."); // 종료
				break;
			} else {
				System.out.println("올바른 메뉴를 선택해주세요.");
				System.out.println("================");
			}
		} while(true);
	}
	
	public static boolean huntMenu() {
		// MonsterAbility 객체 생성
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("공격을 선택해주세요.");
			System.out.println("1. 기본 공격");
			System.out.println("2. 힘 스킬 사용");
			System.out.println("3. 민첩 스킬 사용");
			System.out.println("4. 지력 스킬 사용");
			System.out.println("0. 처음으로 돌아가기");
			System.out.print("메뉴 선택 : ");
			int selectAttack = sc.nextInt();
			sc.nextLine();
			System.out.println("================");

			if(selectAttack == 1) {
//				기본 공격 선택 시 : attack 메서드 호출
				w.attack();
			} else if(selectAttack == 2) {
//				힘 스킬 선택 시 : strSkill 메서드 호출
				w.strSkill();
			} else if(selectAttack == 3) {
//				민첩 스킬 선택 시 : dexSkill 메서드 호출
				w.dexSkill();
			} else if(selectAttack == 4) {
//				지력 스킬 선택 시 : knowledgeSkill 메서드 호출
				w.knowledgeSkill();
			} else if(selectAttack == 0) {
				// 처음으로 돌아가기
				System.out.println("처음 메뉴로 돌아갑니다.");
				System.out.println("================");
				return true;
			} else {
				System.out.println("================");
				System.out.println("올바른 메뉴를 선택해주세요.");
			}
			System.out.println("================");

		} while(true);
	}
	

	public static boolean setPorsion() {
		do {
			System.out.println("인벤토리-포션");
			System.out.println("1. 체력 포션");
			System.out.println("2. 마나 포션"); 
			System.out.println("3. 포션 목록");
			System.out.println("0. 처음으로 돌아가기");
			System.out.print("사용할 포션을 선택하세요: ");
			// 스캐너로 입력 받기
			int selectPorsion = sc.nextInt();
			sc.nextLine();
			System.out.println("================");
			
			if(selectPorsion == 1) {
//		         > 소지중 체력 포션이 1개 이상일 경우
//	             => "체력 포션을 사용했습니다." 출력
//	             => 소지중 체력 포션 1개 감소			    
//	             => 체력 60 회복
//	             => "포션 사용 후 현재 체력 : OO"
//	         > 소지중 체력 포션이 0개 일 경우
//	             => "인벤토리 체력 포션이 없습니다." 출력
				if (w.getHpPortionCount() >= 1) {
					System.out.println("체력 포션을 사용했습니다");
					w.setHpPortionCount(w.getHpPortionCount() - 1);
					w.setHp(w.getHp() + 60);
					System.out.println("포션 사용 후 현재 체력 : " + w.getHp());
				} else {
					System.out.println("인벤토리 체력 포션이 없습니다.");
				}
			} else if(selectPorsion == 2) {
//		         > 소지중 마력 포션이 1개 이상일 경우
//	             => "마력 포션을 사용했습니다." 출력
//	             => 소지중 체력 포션 1개 감소			    
//	             => 마력 60 회복
//	             => "포션 사용 후 현재 마력 : OO"
//	         > 소지중 마력 포션이 0개 일 경우
//	             => "인벤토리 마력 포션이 없습니다." 출력 
				if (w.getMpPortionCount() >= 1) {
					System.out.println("마력 포션을 사용했습니다");
					w.setMpPortionCount(w.getMpPortionCount() - 1);
					w.setMp(w.getMp() + 60);
					System.out.println("포션 사용 후 현재 마력 : " + w.getMp());
				} else {
					System.out.println("인벤토리 마력 포션이 없습니다.");
				}
			} else if(selectPorsion == 3) {
//		         > "소지중인 체력 포션은 OO개 입니다." 출력
				System.out.println("소지중인 체력 포션은 " + w.getHpPortionCount() + "개 입니다.");
//		         > "소지중인 마력 포션은 OO개 입니다." 출력 
				System.out.println("소지중인 마력 포션은 " + w.getMpPortionCount() + "개 입니다.");
			} else if(selectPorsion == 0) {
				// 처음으로 돌아가기
				System.out.println("처음 메뉴로 돌아갑니다.");
				System.out.println("================");
				return true;
			} else {
				System.out.println("올바른 메뉴를 선택해주세요.");
			}
			System.out.println("================");
		} while(true);
	}
	
	public static boolean setStatus() {
		// 레벨업 할때마다 스텟(unusedStatus) 5가 생김
		// 현재 레벨 확인 후 여유분의 스텟을 추가하는 코드 작성
		// * ability의 setter/getter를 이용
		do {
			System.out.println("사용할 스텟을 입력해주세요.");
			System.out.println("1. 힘+5");
			System.out.println("2. 민첩+5");
			System.out.println("3. 지력+5");
			System.out.println("0. 처음으로 돌아가기");
			System.out.print("사용할 스텟 : ");
			int selectStatus = sc.nextInt();
			sc.nextLine();
			System.out.println("================");

			if(selectStatus == 1) {
//	          > 사용 가능한 잔여 스텟(unusedStatus)이 있을 경우
//                => "힘이 5 증가되었습니다." 출력
//                => 힘 5 증가
//                => 잔여 스텟 5 감소
//                => "증가된 후 힘 : OO" 출력 
//            > 사용 가능한 잔여 스텟(unsedStatus)이 없을 경우
//                => "사용 가능한 스텟이 없습니다." 출력
				if (w.getUnusedStatus() >= 1) {
					System.out.println("힘이 5 증가되었습니다.");
					w.setStr(w.getStr() + 5);
					w.setUnusedStatus(w.getUnusedStatus() - 5);
					System.out.println("증가된 후 힘 : " + w.getStr());
				} else {
					System.out.println("사용 가능한 스텟이 없습니다.");
				}
			} else if(selectStatus == 2) {
//	          > 사용 가능한 잔여 스텟(unusedStatus)이 있을 경우
//                => "민첩이 5 증가되었습니다." 출력
//                => 민첩 5 증가
//                => 잔여 스텟 5 감소
//                => "증가된 후 민첩 : OO" 출력 
//            > 사용 가능한 잔여 스텟(unsedStatus)이 없을 경우
//                => "사용 가능한 스텟이 없습니다." 출력
				if (w.getUnusedStatus() >= 1) {
					System.out.println("민첩이 5 증가되었습니다.");
					w.setDex(w.getDex() + 5);
					w.setUnusedStatus(w.getUnusedStatus() - 5);
					System.out.println("증가된 후 민첩 : " + w.getDex());
				} else {
					System.out.println("사용 가능한 스텟이 없습니다.");
				}
			} else if(selectStatus == 3) {
//	          > 사용 가능한 잔여 스텟(unusedStatus)이 있을 경우
//                => "지력이 5 증가되었습니다." 출력
//                => 지력 5 증가
//                => 잔여 스텟 5 감소
//                => "증가된 후 지력 : OO" 출력
//            > 사용 가능한 잔여 스텟(unsedStatus)이 없을 경우
//                => "사용 가능한 스텟이 없습니다." 출력
				if (w.getUnusedStatus() >= 1) {
					System.out.println("지력이 5 증가되었습니다.");
					w.setKnowledge(w.getKnowledge() + 5);
					w.setUnusedStatus(w.getUnusedStatus() - 5);
					System.out.println("증가된 후 지력 : " + w.getKnowledge());
				} else {
					System.out.println("사용 가능한 스텟이 없습니다.");
				}
			
			} else if(selectStatus == 0) {
				// 처음으로 돌아가기
				System.out.println("처음 메뉴로 돌아갑니다.");
				System.out.println("================");
				return true;
			} else {
				System.out.println("올바른 메뉴를 선택해주세요.");
			}
			System.out.println("================");

		} while(true);
	}
	
	public static boolean getCharInfo() {
//        - 현재 가진 정보들을 전체 출력
//			> "========케릭터 정보========"
		System.out.println("========케릭터 정보========");
//        	> "체력 : OO"
		System.out.println("체력 : "	 + w.getHp());
//        	> "마나 : OO"
		System.out.println("마력 : " + w.getMp());
//        	> "힘 : OO "
		System.out.println("힘 : " + w.getStr());
//        	> "민첩 : OO"
		System.out.println("민첩 : " + w.getDex());
//        	> "지력 : OO"
		System.out.println("현재 레벨 : " + w.getLevel());
//        	> "현재 레벨 : OO"
		System.out.println("현재 경험치 : " + w.getExperience());
//        	> "현재 경험치 : OO"
		System.out.println("사용 가능 스텟 : " + w.getUnusedStatus());
//        	> "사용 가능 스텟 : OO" 
		System.out.println("================");
		return true;
	}
	
}
