
public class VariableNaming {

	public static void main(String[] args) {
		/*
		 * 변수명 짓는 방법  -  문법
		 * 
		 * 1. 알파벳(대소문자 구분), 숫자, _, $ 조합
		 * 2. 특수문자는 _, $ 만 허용
		 * 3. 변수명이 중복 X
		 * 4. 키워드와 동일하게 사용할 수 없음 --> int int; (X)
		 * 									 int int1;(O)
		 * 5. 첫글자는 숫자가 올수가 없음
		 */
		int _$num1 = 100;
		System.out.println(_$num1);
		
		//int !n1 = 100;//특수문자 때문에 안됨
		//int _$num1 = 200;//동일한 변수면 안됨
		//int int;//키워드와 동일하면 안됨
		int int1;//키워드와 동일하지 않으면 됨
	}

}










