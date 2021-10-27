package map;

import java.util.HashMap;

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
		
		
	}

}






