package isa;

public class CastingNotClass {

	public static void main(String[] args) {
		Aircon air = new Aircon();
		PowerOnOff onOff = air;
		if(onOff instanceof TV) {
			TV tv = (TV) onOff; //형변환이 안됨
		}
		System.out.println("프로그램 종료");
	}

}
