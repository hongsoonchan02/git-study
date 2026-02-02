package kr.co.training;

public class Ex21_3_Main {

	public static void main(String[] args) {
		Ex21_3_Dog dog = new Ex21_3_Dog("강아지", 5);
		dog.eat();
		dog.sleep();
		dog.wagTail();
		
		Ex21_3_Cat cat = new Ex21_3_Cat("고양이", 2);
		cat.eat();
		cat.sleep();
		cat.nyangPunch();
	}

}
