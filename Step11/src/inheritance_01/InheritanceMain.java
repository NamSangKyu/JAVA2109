package inheritance_01;

public class InheritanceMain {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Person person = new Person();
		
		animal.eat();
		person.eat();
		person.run();
	}

}
