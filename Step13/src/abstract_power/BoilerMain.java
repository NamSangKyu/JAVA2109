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
	}

}
