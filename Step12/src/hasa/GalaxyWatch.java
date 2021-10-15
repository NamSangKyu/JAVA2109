package hasa;

public class GalaxyWatch extends Bluetooth {

	@Override
	public void connect() {
		System.out.println("워치가 연결되었습니다.");
	}

	@Override
	public void disconnect() {
		System.out.println("워치가 연결 해제되었습니다.");
	}

	@Override
	public void receiveData(String msg) {
		System.out.println("사용자의 건강데이터를 받습니다");
		System.out.println("받은 데이터 : "+msg);
	}

}
