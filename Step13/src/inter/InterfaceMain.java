package inter;

public class InterfaceMain {

	public static void main(String[] args) {
		//인터페이스는 클래스가 아니기때문에 생성 X
		//Animal animal = new Animal();
		Animal animal = null;//틀만 만들기 때문에 선언이 가능
		animal = new Person();
		animal.eat();
		animal = new Dog();
		animal.eat();
		
	}

}
