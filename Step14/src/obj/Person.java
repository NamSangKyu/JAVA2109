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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	//obj 현재 객체와 동일한지 비교할 객체
	//obj의 내용이 this 객체의 내용과 동일한지 판단
	@Override
	public boolean equals(Object obj) {
		//1. obj가 null 인지 체크
		if(obj == null) return false;
		//2. 메모리 주소 비교
		if(this == obj) return true;
		//3. obj가 현재 클래스랑 동일한 타입인지 판단.
		if(obj instanceof Person) {
			//	3-1. 필드가 전부 값이 동일한지 체크
			Person temp = (Person) obj;
			if(age == temp.age && name.equals(temp.name))
				return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		//객체가 가지고 있는 데이터를 수학적인 수식을 이용해서 숫자로 변경
		return name.hashCode() + age;
	}

}






