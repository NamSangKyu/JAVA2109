
public class Operator1 {
	/*
	 * 	사칙 연산자 
	 * 			+ 덧셈 
	 * 			- 뺄셈
	 * 			* 곱셈
	 * 			/ 나눗셈 - 몫
	 * 			% 나눗셈 - 나머지
	 * 			연산자 우선 순위 * / % + -
	 */
	public static void main(String[] args) {
		// 정수 저장할 변수 n1, n2 선언
		int n1, n2;// n1과 n2를 둘다 정수형 변수로 선언
		// n1에는 숫자 10을 저장
		n1 = 10;
		// n2에는 숫자 7을 저장
		n2 = 7;
		
		int result;
		result = n1 + n2;//n1+n2의 결과를 result에 저장
		System.out.println(result);
		
		result = n1 - n2;
		System.out.println(result);

		result = n1 * n2; //곱셈
		System.out.println(result);
		
		result = n1 / n2; //나눗셈 - 몫
		System.out.println(result);
		
		result = n1 % n2; //나눗셈 - 나머지
		System.out.println(result);

		// n1 + n2 * 3 출력 - result 사용 X
		System.out.println(n1 + n2 * 3);
		// (n1 + n2) * 3 출력 - result 사용 X
		System.out.println((n1 + n2) * 3);
		
	}

}






