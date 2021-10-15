package override;

public class AnimalMain {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog();
		Person person = new Person();
		animal.eat();
		dog.eat();
		person.eat();
	}
	

}
