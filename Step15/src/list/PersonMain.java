package list;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			/*
			 * Person 데이터 관리 프로그램
			 * 1. Person 데이터 등록
			 * 2. Person 데이터 검색
			 * 3. Person 데이터 삭제
			 * 원하시는 메뉴 번호를 입력하세요 : 
			 */
			System.out.println("Person 데이터 관리 프로그램");
			System.out.println("1. Person 데이터 등록");
			System.out.println("2. Person 데이터 검색");
			System.out.println("3. Person 데이터 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("원하시는 메뉴 번호를 입력하세요 :");
			int no = sc.nextInt();
			sc.nextLine();//뒤에 줄바꿈 문자(엔터)를 제거
			
			//각 번호에 해당하는 일을 호출
			//Service 클래스에 있는 메서드를 호출
			if(no == 0) break;
			switch(no) {
			case 1:
				PersonService.getInstance().insertPerson(sc);
				break;
			case 2:
				PersonService.getInstance().searchPerson(sc);
				break;
			case 3:
				PersonService.getInstance().deletePerson(sc);
				break;				
			}
			
		}
	}

}
