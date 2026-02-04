package kr.co.training;

public class Ex24_4_Warlord extends Ex24_4_CharacterAbility implements Ex24_4_Character {
	Ex24_4_MonsterAbility ma;

	
	Ex24_4_Warlord(Ex24_4_MonsterAbility ma) {
		super(30, 17, 10);
		this.ma = ma;
	}
	
//	2. 기본 공격 attack 메서드
//    * 참고 : 케릭터가 먼저 공격하고, 그 다음 몬스터가 공격을 합니다.
//               즉, 서로 한 번씩 돌아가며 공격합니다.
	@Override
	public void attack() {
//    ------- 케릭터 공격 차례
//    - 마력이 6 미만이라면 기본 공격 사용 불가 ("마력이 부족해 공격할 수 없습니다" 출력)
//    - "몬스터가 OO의 피해를 입었습니다!" 출력    
//    - 몬스터가 케릭터 힘*1.3 만큼의 체력이 깍입니다.
//    - 케릭터의 마력 6 감소
		
		switch (1) {
		case 1:
			if (getMp() < 6) {
				System.out.println("마력이 부족해 공격할 수 없습니다.");
			} else {
				System.out.println("몬스터가" + getStr()*1.3 + "의 피해를 입었습니다.!");
				ma.setHp(ma.getHp() - getStr()*1.3);
				setMp(getMp() - 6);
			}
		
//    
//    ------- 케릭터 공격 차례(몬스터 처치 시)
//    - 몬스터의 체력이 0 이하라면 "몬스터 사냥을 성공하셨습니다" 출력
//    - 케릭터의 경험치 13 증가
		case 2:
			if (ma.getHp() < 0) {
				System.out.println("몬스터 사냥을 성공하셨습니다");
				setExperience(getExperience() + 13);
				break;
			}
//
//    ------- 몬스터 공격
//    - "몬스터가 공격했습니다!" 출력    
//    - "케릭터가 OO의 피해를 입었습니다!" 출력
//    - 몬스터 데미지 만큼 케릭터의 체력이 감소합니다.
		case 3:
			System.out.println("몬스터가 공격했습니다!");
			System.out.println("캐릭터가" + ma.getDamage() + "의 피해를 입었습니다!");
			setHp(getHp() - ma.getDamage());
//
//    ------- 몬스터 공격(케릭터 사망 시)
//    > 케릭터의 체력과 마력이 70으로 회복됩니다.
//    > 경험치가 30 감소합니다.
		case 4:
			if(getHp() <= 0) {
				System.out.println("캐릭터가 사망했습니다.");
				setHp(70);
				setMp(70);
				setExperience(getExperience() - 30);
				break;
			}
		}
	}
//
//
//  3. 힘 스킬 strSkill 메서드
//    * 참고 : 케릭터가 먼저 공격하고, 그 다음 몬스터가 공격을 합니다.
//               즉, 서로 한 번씩 돌아가며 공격합니다.
	@Override
	public void strSkill() {
	
		switch (1) {
//    ------- 케릭터 공격 차례
//    - 마력이 15 미만이라면 스킬 사용 불가 ("마력이 부족해 스킬을 사용할 수 없습니다." 출력)
//    - "몬스터가 힘 스킬로 인해 OO의 피해를 입었습니다!" 출력
//    - 몬스터가 힘*1.8 만큼의 체력이 깍입니다.
//    - 케릭터의 마력 15 감소
		case 1:
			if (getMp() < 15) {
				System.out.println("마력이 부족해 스킬을 사용할 수 없습니다.");
			} else {
				System.out.println("몬스터가 힘 스킬로 인해 " + getStr()*1.8 + "의 피해를 입었습니다!");
				ma.setHp(ma.getHp() - getStr()*1.8);
				setMp(getMp() - 15);
			}
//
//   ------- 케릭터 공격 차례(몬스터 처치 시)
//    - 몬스터의 체력이 0 이하라면 "몬스터 사냥을 성공하셨습니다" 출력
//    - 케릭터의 경험치 13 증가
		case 2:
			if (ma.getHp() <= 0) {
				System.out.println("몬스터 사냥을 성공하셨습니다.");
				setExperience(getExperience() + 13);
				break;
			}
//
//    ------- 몬스터 공격
//    - "몬스터가 공격했습니다!" 출력    
//    - "케릭터가 OO의 피해를 입었습니다!" 출력
//    - 몬스터 데미지 만큼 케릭터의 체력이 감소합니다.
		case 3:
			System.out.println("몬스터가 공격했습니다!");
			System.out.println("캐릭터가 " + ma.getDamage() + "의 피해를 입었습니다");
			setHp(getHp() - ma.getDamage());
//
//    ------- 몬스터 공격(케릭터 사망 시)
//    > 케릭터의 체력과 마력이 70으로 회복됩니다.
//    > 경험치가 30 감소합니다.
		case 4:
			if(getHp() <= 0) {
				System.out.println("캐릭터가 사망했습니다.");
				setHp(70);
				setMp(70);
				setExperience(getExperience() - 30);
				break;
			}
		}
	}
//
//
//  4. 민첩 스킬 dexSkill 메서드
//    * 참고 : 케릭터가 먼저 공격하고, 그 다음 몬스터가 공격을 합니다.
//               즉, 서로 한 번씩 돌아가며 공격합니다.
	@Override
	public void dexSkill() {
		
		switch (1) {
//
//    ------- 케릭터 공격 차례
//    - 마력이 19 미만이라면 스킬 사용 불가 ("마력이 부족해 스킬을 사용할 수 없습니다." 출력)
//    - "몬스터가 민첩 스킬로 인해 OO의 피해를 입었습니다!" 출력
//    - 몬스터가 민첩*0.7 만큼의 체력이 깍입니다. 
//    - "몬스터가 민첩 스킬로 인해 OO의 피해를 입었습니다!" 출력
//    - 몬스터가 민첩*0.7 만큼의 체력이 깍입니다.
//    - "몬스터가 민첩 스킬로 인해 OO의 피해를 입었습니다!" 출력
//    - 몬스터가 민첩*0.7 만큼의 체력이 깍입니다. (총 3회 공격)
//    - 케릭터의 마력 19 감소
		case 1:
			if (getMp() < 19) {
				System.out.println("마력이 부족해 스킬을 사용할 수 없습니다.");
			} else {
				System.out.println("몬스터가 민첩 스킬로 인해 " + getDex()*0.7 + "의 피해를 입었습니다!");
				ma.setHp(ma.getHp() - getDex()*0.7);
				System.out.println("몬스터가 민첩 스킬로 인해 " + getDex()*0.7 + "의 피해를 입었습니다!");
				ma.setHp(ma.getHp() - getDex()*0.7);
				System.out.println("몬스터가 민첩 스킬로 인해 " + getDex()*0.7 + "의 피해를 입었습니다!");
				ma.setHp(ma.getHp() - getDex()*0.7);
				setMp(getMp() - 19);
			}
//
//   ------- 케릭터 공격 차례(몬스터 처치 시)
//    - 몬스터의 체력이 0 이하라면 "몬스터 사냥을 성공하셨습니다" 출력
//    - 케릭터의 경험치 13 증가
		case 2:
			if (ma.getHp() <= 0) {
				System.out.println("몬스터 사냥을 성공하셨습니다.");
				setExperience(getExperience() + 13);
				break;
			}
//
//    ------- 몬스터 공격
//    - "몬스터가 공격했습니다!" 출력    
//    - "케릭터가 OO의 피해를 입었습니다!" 출력
//    - 몬스터 데미지 만큼 케릭터의 체력이 감소합니다.
		case 3:
			System.out.println("몬스터가 공격했습니다!");
			System.out.println("캐릭터가 " + ma.getDamage() + "의 피해를 입었습니다");
			setHp(getHp() - ma.getDamage());
//	
//
//    ------- 몬스터 공격(케릭터 사망 시)
//    > 케릭터의 체력과 마력이 70으로 회복됩니다.
//    > 경험치가 30 감소합니다.
		case 4:
			if(getHp() <= 0) {
				System.out.println("캐릭터가 사망했습니다.");
				setHp(70);
				setMp(70);
				setExperience(getExperience() - 30);
				break; 
			}
		}
	}
//
//
//  5. 지력 스킬 knowledgeSkill 메서드
//    * 참고 : 케릭터가 먼저 공격하고, 그 다음 몬스터가 공격을 합니다.
//               즉, 서로 한 번씩 돌아가며 공격합니다.
	@Override
	public void knowledgeSkill() {
		switch (1) {
//    ------- 케릭터 공격 차례
//    - 마력이 28 미만이라면 스킬 사용 불가 ("마력이 부족해 스킬을 사용할 수 없습니다." 출력)
//    - "몬스터가 지력 스킬로 인해 OO의 피해를 입었습니다!" 출력
//    - 몬스터가 지력*3.6 만큼의 체력이 깍입니다.
//    - 케릭터의 마력 28 감소
		case 1:
			if (getMp() < 28) {
				System.out.println("마력이 부족해 스킬을 사용할 수 없습니다.");
			} else {
				System.out.println("몬스터가 지력 스킬로 인해 " + getKnowledge()*3.6 + "의 피해를 입었습니다!");
				ma.setHp(ma.getHp() - getKnowledge()*3.6);
				setMp(getMp() - 28);
			}
//
//   ------- 케릭터 공격 차례(몬스터 처치 시)
//    - 몬스터의 체력이 0 이하라면 "몬스터 사냥을 성공하셨습니다" 출력
//    - 케릭터의 경험치 13 증가
		case 2:
			if (ma.getHp() <= 0) {
				System.out.println("몬스터 사냥을 성공하셨습니다.");
				setExperience(getExperience() + 13);
				break;
			}
//
//    ------- 몬스터 공격
//    - "몬스터가 공격했습니다!" 출력    
//    - "케릭터가 OO의 피해를 입었습니다!" 출력
//    - 몬스터 데미지 만큼 케릭터의 체력이 감소합니다.
		case 3:
			System.out.println("몬스터가 공격했습니다!");
			System.out.println("캐릭터가 " + ma.getDamage() + "의 피해를 입었습니다");
			setHp(getHp() - ma.getDamage());
//
//    ------- 몬스터 공격(케릭터 사망 시)
//    > 케릭터의 체력과 마력이 70으로 회복됩니다.
//    > 경험치가 30 감소합니다.
		case 4:
			if(getHp() <= 0) {
				System.out.println("캐릭터가 사망했습니다.");
				setHp(70);
				setMp(70);
				setExperience(getExperience() - 30);
				break; 
			}
		}
	}

}
