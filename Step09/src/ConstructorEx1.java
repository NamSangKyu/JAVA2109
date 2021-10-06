
public class ConstructorEx1 {

	public static void main(String[] args) {
		//생성자 --> 클래스명() --> 생성자는 클래스명으로 된 메서드(기능)
		Person p = new Person();
		
		p.name = "김철수";
		p.age = 20;
		p.gender = true;
		
		Person p1 = new Person("김영희");
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		Person p2 = new Person(33);
		System.out.println(p2.name);
		System.out.println(p2.age);
		
		Person p3 = new Person("문영수",40);
		System.out.println(p3.name);
		System.out.println(p3.age);
	}

}




