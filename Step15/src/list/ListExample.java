package list;

import java.util.ArrayList;
import java.util.Iterator;

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
		
		//저장하고 있는 데이터 개수
		System.out.println(list.size());
		
		//해당 데이터가 리스트에 있는지?
		System.out.println(list.contains("jsp"));
		System.out.println(list.contains("jsp1"));
		
		//리스트 내용 비우기
//		list.clear();
//		System.out.println(list);
		//리스트 내용이 비었냐? 비었으면 true, 안비었으면 false
		System.out.println(list.isEmpty());

		//리스트를 원하는 인덱스에 추가
		list.add(1, "java");
		System.out.println(list);
		
		//리스트에 있는 모든 객체 꺼내기 - 1
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//리스트에 있는 모든 객체 꺼내기 - 2
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}






