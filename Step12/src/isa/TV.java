package isa;

public class TV extends PowerOnOff{

	@Override
	public void powerOnOff() {
		power = !power;
		if(power)
			System.out.println("TV전원 켜졌습니다.");
		else
			System.out.println("TV전원 꺼졌습니다.");
	}
	
}
