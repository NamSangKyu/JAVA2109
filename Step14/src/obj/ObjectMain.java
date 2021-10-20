package obj;

public class ObjectMain {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("홍길동", 20);
		
		System.out.println(p1);
		System.out.println(p1.toString());
		
		System.out.println(Integer.toHexString(p1.hashCode()));
		System.out.println(Integer.toHexString(p2.hashCode()));
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}

}



