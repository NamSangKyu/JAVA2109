package isa;

public class InstanceOfTest {

	public static void main(String[] args) {
		Aircon air = new Aircon();
		TV tv = new TV();
		
		System.out.println(tv instanceof PowerOnOff);
		System.out.println(air instanceof PowerOnOff);
		
		PowerOnOff onOff = tv;
		System.out.println(onOff instanceof TV);
		System.out.println(onOff instanceof Aircon);
	}

}
