package override;

public class SonicAirplane extends Airplane{
	private boolean mode;

	public SonicAirplane() {
		mode = false;
	}
	public void changeMode() {
		mode = !mode;
	}
	@Override
	public void fly() {
		if(mode) {
			System.out.println("초음속 모드로 하늘을 날고 있습니다.");
		}else {
			super.fly();
		}
	}
	
}
