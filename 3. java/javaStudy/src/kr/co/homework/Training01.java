package kr.co.homework;

public class Training01 {
//		1) Training01_Calc 클래스를 생성하세요.
//		- 매개변수 numbers의 모든 정수의 합을 반환하는 int sum() 메서드 생성
//		- 매개변수 numbers의 가장 큰 정수를 반환하는 int max() 메서드 생성
//		- 매개변수 numbers의 가장 작은 정수를 반환하는 int min() 메서드 생성
//	
//	2) 현재 메인 메서드에서 Training01_Calc 객체를 생성 후 sum, max, min 메서드를 호출하세요.
//		- 각각의 메서드에는 아래의 numbers 배열이 인자로 작성됩니다.
	public int sum(int[] numbers) {
		int s = 0;
		for (int n : numbers) {
			s =+ n;
		}
		return s;
	}
	
	public int max(int[] numbers) {
		int max = numbers[0];
		for (int n : numbers) {
			if (n > max) {
				max = n;
			}
		}
		return max;
	}
	
	public int min(int[] numbers) {
		int min = numbers[0];
		for (int n : numbers) {
			if (n < min) {
				min = n;
			}
		}
		return min;
	}
	

}
