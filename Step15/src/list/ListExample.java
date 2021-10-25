package list;

import java.util.ArrayList;

public class ListExample {
	/*
	 * List의 특징
	 * 1. 데이터 중복 O
	 * 2. 등록한 데이터 순서가 보장됨
	 * 
	 * ArrayList : 리스트를 배열을 이용해서 관리
	 * LinkedList : 리스트를 객체들끼리 엮어서 관리
	 * Vector  : ArrayList에 동기화가 적용된 형태
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		//데이터 추가 - 순서대로 저장됨
		list.add("HTML/CSS");
		list.add("js/jQuery");
		list.add("java");
		list.add("HTML/CSS");//중복된 데이터도 저장됨
		list.add("jsp");
		
		System.out.println(list.toString());
		//데이터 삭제 - 인덱스 번호로 삭제
		list.remove(0);
		System.out.println(list.toString());
		//데이터 삭제 - 객체 비교 삭제
		list.remove("java");
		System.out.println(list.toString());
		
		//
		
	}

}






