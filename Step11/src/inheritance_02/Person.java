package inheritance_02;

public class Person extends Animal{
	//자식 클래스 생성자가 부모 클래스 생성자에 필요한 값을 받아서 보내줌
	public Person(int age) {
		super(age);//super 부모 클래스를 지칭
		System.out.println("Person 생성자");
	}
	
}
