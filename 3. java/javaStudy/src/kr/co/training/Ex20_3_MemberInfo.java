package kr.co.training;

public class Ex20_3_MemberInfo {
	
//	1. Ex20_3_MemberInfo
//	  - private 변수 name, age, addr, isStudent를 가집니다.
//	  - isStudent는 boolean  , 
//	  - getter/setter
	private String name;
	private int age;
	private String addr;
	private boolean isStudent;


	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAddr() {
		return addr;
	}
	public void setIsStudent(boolean isStudent) {
		this.isStudent = isStudent;
	}
	public boolean getIsStudent() {
		return isStudent;
	}
}
