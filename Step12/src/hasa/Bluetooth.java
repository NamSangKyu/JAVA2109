package hasa;

public class Bluetooth {
	public void connect() {
		System.out.println("블루투스 연결이 되었습니다.");
	}
	
	public void disconnect() {
		System.out.println("블루투스 연결이 종료되었습니다.");
	}
	
	public void receiveData(String msg) {
		System.out.println(msg + " 전송받음");
	}
}
