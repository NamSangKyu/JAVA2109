package generic;

public class BoxMain {

	public static void main(String[] args) {
		Box box = new Box();
		box.setObj(new Apple());
		box.setObj(new Orange());
		Apple apple = (Apple) box.getObj();
		apple.printApple();
		
	}

}
