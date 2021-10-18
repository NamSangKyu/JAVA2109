package abstract_power;

public class Boiler {
	private PowerOnOff onOff;

	public Boiler(PowerOnOff onOff) {
		this.onOff = onOff;
	}

	public PowerOnOff getOnOff() {
		return onOff;
	}

	public void setOnOff(PowerOnOff onOff) {
		this.onOff = onOff;
	}
	
	public void powerOnOff() {
		onOff.powerOnOff();
	}
}
