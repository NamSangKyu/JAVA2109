package hasa;

public class GalaxyBus extends Bluetooth{

	@Override
	public void connect() {
		System.out.println("버즈가 연결되었습니다");
	}

	@Override
	public void disconnect() {
		System.out.println("버즈가 연결 해제되었습니다");
	}

	@Override
	public void receiveData(String msg) {
		System.out.println(msg + "음악 데이터를 받습니다.");
	}
}
