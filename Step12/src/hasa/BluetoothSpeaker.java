package hasa;

public class BluetoothSpeaker extends GalaxyBus {

	@Override
	public void connect() {
		System.out.println("스피커가 연결되었습니다");
	}

	@Override
	public void disconnect() {
		System.out.println("스피커가 연결 해제되었습니다");
	}


	
}
