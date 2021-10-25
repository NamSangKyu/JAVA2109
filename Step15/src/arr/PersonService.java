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
	public void searchPerson(Scanner sc) {

		System.out.println("Person 데이터 검색을 시작합니다.......");
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		
		for(int i=0;i<index;i++) {
			if(arr[i].getName().equals(name)) {
				System.out.println(arr[i].toString());
				return;
			}
		}
		System.out.println("검색한 데이터가 없습니다.");
	}
	public void deletePerson(Scanner sc) {
		/*
		 * 1. 삭제할 데이터 이름 입력
		 * 2. 이름으로 배열 검색
		 * 3-1. 동일한 이름이 있으면 삭제처리, 해당 index null 처리
		 *		배열에 빈 공간이 있으면 X, index값 감소 
		 * 3-2. 동일한 이름이 없으면 '삭제할 데이터가 없습니다.' 출력 
		 */
		System.out.println("Person 데이터 삭제를 시작합니다.......");
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		for(int i=0;i<index;i++) {
			if(arr[i].getName().equals(name)) {
				arr[i] = null;
				for(int j=i;j<index-1;j++) {
					arr[j] = arr[j+1];
				}
				index--;
				return;
			}
		}
		System.out.println("삭제할 데이터가 없습니다.");
	}
}











