package inter;

public interface PowerOnOff {
	//상수 선언시 public static final 자동으로 붙음
	public static final boolean POWER_ON = true;
	public static final boolean POWER_OFF = false;
	
	//자동으로 추상메서드 선언됨
	public abstract void powerOnOff();
	
	//jdk 8버전부터 추가됨
	default void powerOn() {
		System.out.println("전원 On");
	}
	//인터페이스에서 static 메서드 선언 가능
	public static void powerOff() {
		System.out.println("전원 Off");
	}
}


