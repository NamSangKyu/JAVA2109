package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {
	/*
	 * Map
	 * 	키와 데이터를 한쌍으로 저장하는 형태
	 * 	키값(고유값)을 이용해서 데이터를 저장/읽어옴
	 */
	public static void main(String[] args) {
		//       키      데이터
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		//데이터 추가
		map.put("Kim", 20);
		map.put("Lee", 33);
		map.put("Park", 45);
		map.put("Kim", 40);
		
		//데이터 읽기
		System.out.println(map.get("Kim"));
		System.out.println(map.get("Lee"));
		
		//맵에 저장된 데이터 개수
		System.out.println(map.size());
		
		//해당값으로 키 값이 있는지 체크
		System.out.println(map.containsKey("Lee"));//Lee 라는 키값이 있냐?
		//저장된값이 있는지 체크
		System.out.println(map.containsValue(45));//저장된 값중에 45가 있느냐? (키값 검색X)
		
		//데이터 삭제
		map.remove("Lee");
		System.out.println(map);
		
		//전체 데이터 삭제
		//map.clear();
		
		//맵에 데이터가 없는지?
		System.out.println(map.isEmpty());
		
		//맵에 있는 키값을 Set로 받음
		Set<String> key = map.keySet();
		//맵에 있는 전체 내용 출력
		Iterator<String> it = key.iterator();
		while(it.hasNext()) {
			String k = it.next();
			System.out.println(k + " " + map.get(k));
		}
	}

}






