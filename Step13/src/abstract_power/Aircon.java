package abstract_power;

public class Aircon extends PowerOnOff {
	private boolean power;

	@Override
	public void powerOnOff() {
		power = !power;
		if(power)
			System.out.println("Aircon 전원 On");
		else
			System.out.println("Aircon 전원 Off");
	}

}
