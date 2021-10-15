package hasa;

public class BluetoothMain {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.pairing(new GalaxyBus());
		phone.sendData("노래A");
		phone.disconnect();
		phone.pairing(new GalaxyWatch());
		phone.sendData("혈압 : 104");
		phone.disconnect();
		phone.pairing(new BluetoothSpeaker());
		phone.sendData("노래B");
		phone.disconnect();
	}

}
