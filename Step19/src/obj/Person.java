package obj;

import java.io.Serializable;

public class Person implements Serializable{
	private String name;
	private int age;
	private transient int money;//직렬화 대상에서 제외, 파일 저장 X
	
	public Person(String name, int age, int money) {
		super();
		this.name = name;
		this.age = age;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", money=" + money + "]";
	}
	
	
	
}
