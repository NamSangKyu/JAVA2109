package isa;

public class PowerOnOff {
	protected boolean power;
	
	public void powerOnOff() {
		power = !power;
		if(power)
			System.out.println("전원 켜졌습니다.");
		else
			System.out.println("전원 꺼졌습니다.");
	}
}
