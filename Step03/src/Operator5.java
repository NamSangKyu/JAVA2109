
public class Operator5 {
	/*
	 * 	논리연산자
	 * 		조건식을 두개이상 조합을 해야될때
	 * 		조건식의 결과를 뒤집을 때 
	 *  AND  &&  --> 양쪽의 조건식이 둘다 true 일때만 true
	 *  OR	 ||  --> 양쪽의 조건식 중 하나라도 true면 true
	 *  NOT  !   --> 조건식의 결과를 true면 false로 false면 true로 변경
	 */
	public static void main(String[] args) {
		int n1 = 20, n2 = 30;
		
		//System.out.println( 10 < n1 < 30 );
		//AND 연산
		System.out.println(n1 > 10 && n1 < 30);
		//OR 연산
		System.out.println(n1 > 10 || n1 == n2 );
	}

}



