package abstract_power;

public class PowerMain {
	public static void powerOnOff(PowerOnOff power) {
		power.powerOnOff();
	}
	
	public static void main(String[] args) {
		PowerOnOff power = null;
		power = new TV();
		power.powerOnOff();
		power = new Aircon();
		power.powerOnOff();
		
		powerOnOff(new TV());
		powerOnOff(new Aircon());
	}

}
