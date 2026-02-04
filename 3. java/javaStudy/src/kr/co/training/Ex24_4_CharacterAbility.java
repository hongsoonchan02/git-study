package kr.co.training;

public class Ex24_4_CharacterAbility {
// 1. 힘(str), 민첩(dex), 지력(knowledge)
//    - 기본값 : 0
// 2. 레벨(level)
//    - 기본값 : 1
// 3. 경험치(experience)
//    - 기본값 : 0
//    - 특징 : 경험치가 100 이상이 될 경우 레벨이 1 증가하고 경험치는 0으로 초기화됩니다.
// 4. 체력(hp), 마력(mp)
//    - 기본값 : 100
//    - 특징 : 레벨업을 해도 회복되지 않습니다.
//                 포션을 사용해도 최대 100까지만 회복됩니다.
// 5. 잔여 스텟(unusedStatus)
//    - 기본값 : 0
//    - 특징 : 레벨업을 하면 5가 추가됩니다.
// 6. 소지중인 체력 포션(hpPortionCount), 마력 포션(hpPortionCount)
//    - 기본값 : 10
	private int str, dex, knowledge, level = 1, experience, hp = 100, mp = 100, unusedStatus, hpPortionCount = 10, mpPortionCount = 10;
	
	Ex24_4_CharacterAbility() {
	}
	
	Ex24_4_CharacterAbility(int str, int dex, int knowledge) {
		this.str = str;
		this.dex = dex;
		this.knowledge = knowledge;
	}
	
	// setter
	public void setStr(int str) {
		this.str = str;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	public void setKnowledge(int knowledge) {
		this.knowledge = knowledge;
	}
	public void setHp(int hp) {
		if(hp > 100) {
			this.hp = 100;
		} else {
			this.hp = hp;
		}
	}
	public void setMp(int mp) {
		if(mp > 100) {
			this.mp = 100;
		} else {
			this.mp = mp;
		}
	}
	public void setExperience(int experience) {
		this.experience = experience;
		if (experience >= 100) {
			this.level += 1;
			this.unusedStatus += 5;
			this.experience = 0;
		}
	}
	public void setLevel(int level)	{
		this.level = level;
	}
	public void setUnusedStatus(int unusedStatus) {
		this.unusedStatus = unusedStatus;
	}
	public void setHpPortionCount(int hpPortionCount) {
		this.hpPortionCount = hpPortionCount;
	}
	public void setMpPortionCount(int mpPortionCount) {
		this.mpPortionCount = mpPortionCount;
	}
	
	// ------------------------------------------------------------------------------
	// getter
	public int getStr() {
		return str;
	}
	public int getDex() {
		return dex;
	}
	public int getKnowledge() {
		return knowledge;
	}
	public int getHp() {
		return hp;
	}
	public int getMp() {
		return mp;
	}
	public int getExperience() {
		return experience;
	}
	public int getLevel()	{
		return level;
	}
	public int getUnusedStatus() {
		return unusedStatus;
	}
	public int getHpPortionCount() {
		return hpPortionCount;
	}
	public int getMpPortionCount() {
		return mpPortionCount;
	}	


}
