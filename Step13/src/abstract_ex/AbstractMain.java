package abstract_ex;

public class AbstractMain {
	public static void eat(Animal animal) {
		animal.eat();
	}
	public static void main(String[] args) {
		//추상클래스는 직접 생성 X
		//Animal animal = new Animal();
		//animal.eat();
		Person p = new Person();
		p.eat();
		Dog d = new Dog();
		d.eat();
		
		eat(p);
		eat(d);
	}

}
