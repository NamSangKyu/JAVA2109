package isa;

public class Aircon extends PowerOnOff{
	@Override
	public void powerOnOff() {
		power = !power;
		if(power)
			System.out.println("Aircon전원 켜졌습니다.");
		else
			System.out.println("Aircon전원 꺼졌습니다.");
	}
}
