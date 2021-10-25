package list;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonService {
	private static PersonService instance = new PersonService();
	private ArrayList<Person> list;
	private PersonService() {
		list = new ArrayList<Person>();
	}

	public static PersonService getInstance() {
		if (instance == null)
			instance = new PersonService();
		return instance;
	}
	
	public void insertPerson(Scanner sc) {
		System.out.println("Person 데이터를 등록합니다....");
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		sc.nextLine();
		Person p = new Person(name, age);
		list.add(p);
	}
	public void searchPerson(Scanner sc) {

		System.out.println("Person 데이터 검색을 시작합니다.......");
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		Person p = new Person(name, 0);
		if(list.contains(p)) {
			System.out.println("검색한 데이터가 있습니다.");
			for(int i=0;i<list.size();i++) {
				if(list.get(i).equals(p))
					System.out.println(list.get(i));
			}
		}else {
			System.out.println("검색한 데이터가 없습니다.");
		}
			
	}
	public void deletePerson(Scanner sc) {
		
		System.out.println("Person 데이터 삭제를 시작합니다.......");
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		Person p = new Person(name, 0);
		boolean result = list.remove(p);
		if(result)
			System.out.println("데이터가 삭제되었습니다.");
		else
			System.out.println("삭제할 데이터가 없습니다.");
	}
}











