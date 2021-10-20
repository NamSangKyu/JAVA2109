package obj;

public class Person {
	/*
	 * 이름, 나이를 저장하는 클래스
	 * Person 정보 출력하는 메서드 작성
	 */
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printPersonInfo() {
		System.out.println(name + ","+age);
	}
	
}
