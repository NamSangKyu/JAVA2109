package inter;

public class TVMain {

	public static void main(String[] args) {
		TV tv = new TV();
		tv.powerOnOff();
		tv.powerOnOff();
		tv.powerOn();//default 메서드는 이미 구현되서 사용이 가능
		PowerOnOff.powerOff();//인터페이스에서 static 메서드 선언 가능
		//TV.powerOn(); <-- 생성이 안된 상태라서 사용 X
	}

}
