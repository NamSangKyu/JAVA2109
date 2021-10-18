package abstract_power;

public class BoilerMain {

	public static void main(String[] args) {
		Boiler boiler = new Boiler(new BoilerPower());
		boiler.powerOnOff();
		boiler.powerOnOff();
		boiler.setOnOff(new KPowerModule());
		boiler.powerOnOff();
		boiler.powerOnOff();
		boiler.powerOnOff();
		boiler.powerOnOff();
		boiler.powerOnOff();
		boiler.powerOnOff();
		//익명 클래스
		boiler.setOnOff(new PowerOnOff() {
			private boolean power;
			@Override
			public void powerOnOff() {
				power = !power;
				
				if(power)
					System.out.println("전원 On");
				else
					System.out.println("전원 Off");
					
			}
		});
		boiler.powerOnOff();
		boiler.powerOnOff();
	}

}




