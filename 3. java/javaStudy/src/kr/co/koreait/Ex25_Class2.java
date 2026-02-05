package kr.co.koreait;

public class Ex25_Class2 {

	public static void main(String[] args) {
//		<정적 중첩 클래스 생성 방법>
//		OuterClass.InnerClass inner = new OuterClass.InnerClass();
//		inner.print();
		
//		<비정적 중첩 클래스 생성 방법>		
		// 1. 바깥 클래스 객체 생성 먼저
		OuterClass o = new OuterClass();
		
		// 2. 안쪽(inner) 클래스 객체 생성
		OuterClass.InnerClass inner = o.new InnerClass();
		inner.print();
		
		Ex25_1_Calculator calculator = new Ex25_1_Calculator(10, 7);
		Ex25_1_Calculator.Calc calc = calculator.new Calc();
		System.out.println(calc.add());
		Ex25_2_Greeting g = new Ex25_2_Greeting();
		g.sayHello();
		
		// 익명 내부 클래스
		Animal animal = new Animal() {
			@Override
			public void sound() {
				System.out.println("소리를 냅니다.");
			}
		};
		
		// 람다식
		Animal animal2 = () -> System.out.println("멍멍");

	} 

}

interface Animal {
	void sound();
}

class OuterClass {
	private static int staticNum = 10; // 클래스 변수
	private int instanceNum = 20; // 인스턴스 변수
	
//	static class InnerClass { 정적 중첩 클래스
	class InnerClass { // 비정적 중첩 클래스
		public void print() {
			System.out.println(staticNum);		
			System.out.println(instanceNum);		
		}
	}
}