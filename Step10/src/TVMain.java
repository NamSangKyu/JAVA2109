
public class TVMain {

	public static void main(String[] args) {
		TV tv = new TV();
		
		tv.powerOnOff();
		for(int i=0;i<20;i++)
			tv.chDown();
		for(int i=0;i<20;i++)
			tv.chUp();
		//tv.powerOnOff();
		for(int i=0;i<50;i++)
			tv.volUp();
		tv.muteOnOff();
		for(int i=0;i<50;i++)
			tv.volDown();
	}

}
