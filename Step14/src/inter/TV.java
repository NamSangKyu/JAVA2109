package inter;

public class TV implements PowerOnOff{
	private boolean power;
	@Override
	public void powerOnOff() {
		power = !power;
		
		if(power == PowerOnOff.POWER_ON)
			System.out.println("TV 전원 On");
		else
			System.out.println("TV 전원 Off");
	}
	
}
