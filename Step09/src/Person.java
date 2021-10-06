
public class Person {
	String name;
	int age;
	boolean gender;
	//생성자는 클래스를 이용하여 객체를 만들면
	//제일먼저 딱한번 실행되는 기능
	Person(){
		System.out.println("Person 기본 생성자");
	}
	//이름을 받아오는 생성자
	Person(String n){
		System.out.println("Person(String) 생성자");
		name = n;
	}
	//나이를 받아오는 생성자
	Person(int a){
		System.out.println("Person(int) 생성자");
		age = a;
	}
	//이름과 나이를 받아오는 생성자
	Person(String n, int a){
		System.out.println("Person(String, int)");
		name=n;
		age=a;
	}
	
	void printPersonInfo() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		//성별이 true면 남자, false면 여자
		if(gender)
			System.out.println("성별 : 남자");
		else
			System.out.println("성별 : 여자");
	}
}






