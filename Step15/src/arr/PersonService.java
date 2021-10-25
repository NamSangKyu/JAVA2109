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
		/*
		 * 1. 이름과 나이를 입력
		 * 2. Person 생성
		 * 3. 배열 arr에 생성한 객체를 저장
		 * 4. index 증가
		 */
	}

}



