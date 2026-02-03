package kr.co.training;

public class Ex21_3_CharacterAbility {
	// 아래의 필드들을 가집니다.
	//	- 힘(str), 민첩(dex), 지력(knowledge)
	//	  레벨(level, 초기값 1)
	//	  경험치(exp, 100이 될 경우 레벨이 1 증가하고 경험치는 0이 됨)
	//	  체력(hp, 초기값 100, 레벨업을 해도 회복되지 않음
	//	  마력(mp, 초기값 100, 레벨업을 해도 회복되지 않음
	private int str, dex, knowledge, level = 1, exp, hp = 100, mp = 100;
	//	- 모든 필드의 접근 제어자는 private
	//	- 각 필드에 대한 getter/setter 작성
	public void setStr(int str) {
		this.str = str;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	public void setKnowledge(int knowledge) {
		this.knowledge = knowledge;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public void setExp(int exp, Ex21_3_Sorceress sorceress) {
		// 경험치가 100 이상되면 레벨업, 초과되는 경험치를 다시 저장
		//	- 143 -> 1업 -> 남는 경험치 43 저장
		this.exp = exp;
		if (this.exp >= 100) {
			sorceress.levelUp();
			int n = this.exp - 100;
			this.exp = 0;
			this.level += 1;
			this.exp += n;
			
		}
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	// set
	public int getStr() {
		return str;
	}
	public int getKnowledge()	{
		return knowledge;
	}
	public int getLevel()	{
		return level;
	}
	public int getExp()	{
		return exp;
	}
	public int getHp()	{
		return hp;
	}
	public int getMp()	{
		return mp;
	}
	//	- 현재 능력치를 모두 확인할 수 있는 toString 오버라이딩 작성
	//		> toString은 문자열을 반환 합니다.
	//		> public void toString() {return " 문자열"}
	@Override
	public String toString() {
		return  "힘 : " + str + 
				", 민첩 : " + dex + 
				", 지력 : " + knowledge + 
				", 레벨 : " + level + 
				", 경험치 : "+ exp + 
				", 체력 :" + hp +
				", 마력 : " + mp; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
