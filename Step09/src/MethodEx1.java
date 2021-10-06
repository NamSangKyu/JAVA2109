
public class MethodEx1 {

	public static void main(String[] args) {
		Person p = new Person("홍길동", 20);
		p.printPersonInfo();
		
		Person s = new Person("김영희", 35);
		s.printPersonInfo();
		
		Student a = new Student("20214555", "김철수", "경제학과", 3.1);
		a.printStudentInfo();
	}

}
