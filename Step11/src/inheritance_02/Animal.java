package inheritance_02;

//필드 - 나이
//생성자 - 나이 초기화
//eat()
//printAnimalInfo() --> 이 동물의 나이 OO 입니다.
public class Animal {
	private int age;

	public Animal(int age) {
		super();
		System.out.println("Animal 생성자");
		this.age = age;
	}

	public void eat() {
		System.out.println("동물이 먹이를 먹습니다.");
	}

	public void printAnimalInfo() {
		System.out.println("이 동물의 나이는 " + age + "입니다.");
	}
}



