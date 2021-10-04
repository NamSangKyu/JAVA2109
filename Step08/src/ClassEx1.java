
public class ClassEx1 {

	public static void main(String[] args) {
		//간단한 사람 인적 정보(이름, 나이)를 저장
		Person p1 = new Person();//Person 타입으로 객체를 하나 생성
		Person p2 = new Person();
		
		p1.name = "홍길동";
		p1.age = 20;
		p1.gender = true;
		System.out.println(p1);
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		p2.name = "김철수";
		p2.age = 33;
		p1.gender = true;
		System.out.println(p2);
		System.out.println(p2.name);
		System.out.println(p2.age);
	}

}
