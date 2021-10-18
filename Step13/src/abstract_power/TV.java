package abstract_power;

public class TV extends PowerOnOff{
	private boolean power;

	@Override
	public void powerOnOff() {
		power = !power;
		if(power)
			System.out.println("TV 전원 On");
		else
			System.out.println("TV 전원 Off");
			
	}

}
