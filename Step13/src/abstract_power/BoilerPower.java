package abstract_power;

public class BoilerPower extends PowerOnOff{
	private boolean power;

	@Override
	public void powerOnOff() {
		power = !power;
		if(power)
			System.out.println("Boiler On");
		else
			System.out.println("Boiler Off");
			
	}

}
