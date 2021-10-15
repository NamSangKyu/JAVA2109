package hasa;

public class SmartPhone {
	private Bluetooth bluetooth;
	
	public void pairing(Bluetooth bluetooth) {
		this.bluetooth = bluetooth;
		bluetooth.connect();
	}
	
	public void disconnect() {
		bluetooth.disconnect();
		bluetooth = null;
	}
	
	public void sendData(String msg) {
		bluetooth.receiveData(msg);
	}
	
}
