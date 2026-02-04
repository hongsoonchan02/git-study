package kr.co.koreait;

public class Ex24_Abstract {

	public static void main(String[] args) {
		Ex24_1_PineapplePhone phone = new Ex24_1_PineapplePhone();
		phone.openingLogo();
		Ex24_2_PineapplePhone p = new Ex24_2_PineapplePhone();
		p.powerOn();
		p.powerOff();
		p.openingLogo();
		System.out.println(Ex24_2_PineapplePhone.MAX_BATTERY_CAPACITY);
		

	}

}
