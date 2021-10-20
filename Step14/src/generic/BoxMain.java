package generic;

public class BoxMain {

	public static void main(String[] args) {
		Box box = new Box();
		box.setObj(new Apple());
		//box.setObj(new Orange());
		Apple apple = (Apple) box.getObj();
		apple.printApple();
		
		
		BoxGeneric<Apple> boxApple = new BoxGeneric<Apple>();
		boxApple.setObj(new Apple());
		apple = boxApple.getObj();
		apple.printApple();
		BoxGeneric<Orange> boxOrage = new BoxGeneric<Orange>();
		boxOrage.setObj(new Orange());
		Orange orange = boxOrage.getObj();
		orange.printOrange();
	}

}
