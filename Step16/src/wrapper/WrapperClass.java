package wrapper;

import java.util.ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
		//Wrapper 클래스는 Primitive 타입의 변수 타입을 Reference 형태로 작성한 것
		//int --> Integer
		//double --> Double
		//float --> Float
		//boolean --> Boolean
		//char --> Character
		//제네릭은 Reference 타입만 선언 가능
		//ArrayList<int> list = new ArrayList<int>(); //int 는 Primitive 타입이라서 안됨
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(0);
		System.out.println(list.toString());
		
		Integer num1 = 10; //auto boxing
		int num2 = num1; //auto unboxing
		System.out.println(num1 + " " + num2);
		
		//구버전 자바
		int n3 = 10;
		Object obj = n3;
		Integer num3 = (Integer) obj;
		
		//문자열을 해당 타입의 데이터로 변형, 최대값 최소값 정보, 해당 타입 관련 기능
		String n = "1234";
		int n4 = Integer.parseInt(n);//n을 정수로 변경
		
	}

}





