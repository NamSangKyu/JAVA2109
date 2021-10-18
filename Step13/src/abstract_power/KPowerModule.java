package abstract_power;

public class KPowerModule extends PowerOnOff{
	private int power;
	@Override
	public void powerOnOff() {
		power++; 
		if(power > 3)
			power = 0;
		
		switch(power) {
		case 0:
			System.out.println("보일러 전원 On");
			break;
		case 1:
			System.out.println("보일러 대기모드");
			break;
		case 2:
			System.out.println("보일러 외출모드");
			break;
		case 3:
			System.out.println("보일러 전원 Off");			
		}
	}

}






