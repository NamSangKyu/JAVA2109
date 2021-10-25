package list;

public class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		System.out.println("Person hashCode 호출");
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Person equals 호출");
		if(obj == null) return false;
		if(obj == this) return true;
		if(obj instanceof Person) {
			Person temp = (Person) obj;
			if(name.equals(temp.name))
				return true;
		}
		return false;
	}
	
}






