package generic_extends;

public class MouseMain {

	public static void main(String[] args) {
		ImportMouse<GamingMouse> mouse1 = 
				new ImportMouse<GamingMouse>(new GamingMouse());
		mouse1.click(1);
		mouse1.click(0);
		mouse1.wheel();
		
		//OfficeMouse는 Mouse 인터페이스를 받지 않아서 제네릭 설정 X
		//ImportMouse<OfficeMouse> mouse2= new ImportMouse<OfficeMouse>();
		ImportMouse<Mouse> mouse2 = new ImportMouse<Mouse>(new Mouse() {
			
			@Override
			public void wheel() {
				System.out.println("휠버튼");
			}
			
			@Override
			public void click(int n) {
				System.out.println(n+"번째 버튼 클릭");
			}
		});
		mouse2.click(3);
	}

}
