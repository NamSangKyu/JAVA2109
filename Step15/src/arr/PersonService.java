package arr;

import java.util.Scanner;

public class PersonService {
	private static PersonService instance = new PersonService();
	private Person[] arr;
	private int index; //배열 arr을 관리할 인덱스
	
	private PersonService() {
		arr = new Person[10];
		index = 0;
	}

	public static PersonService getInstance() {
		if (instance == null)
			instance = new PersonService();
		return instance;
	}
	
	public void insertPerson(Scanner sc) {
		if(arr.length == index) {
			System.out.println("데이터 등록할 공간이 없습니다.");
			return;//메서드를 강제 종료
		}
		System.out.println("Person 데이터를 등록합니다....");
//		  1. 이름과 나이를 입력
//		  		- 나이 입력 후 sc.nextline()을 작성
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		sc.nextLine();
//		  2. Person 생성
		Person p = new Person(name, age);
//		  3. 배열 arr에 생성한 객체를 저장
		arr[index] = p;
//		  4. index 증가
		index++;		 
	}

}



