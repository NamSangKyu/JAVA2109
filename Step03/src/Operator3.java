
public class Operator3 {
	/*
	 * 	증감연산자		++		--
	 * 		연산자 중 유일하게 값을 계산 후 변경하는 연산자
	 * 		변수가 가지고 값을 1씩 증가, 감소
	 * 		횟수를 세는 용도로 많이 쓰임
	 * 
	 * 	사용법
	 * 		후위형     전위형
	 * 		num++,   ++num,   num--,    --num
	 */
	public static void main(String[] args) {
		int n1 = 10;
		
		System.out.println(n1);//10
		System.out.println(n1++);//10
		System.out.println(n1);//11
		
		int n2 = 10;
		
		System.out.println(n2);//10
		System.out.println(++n2);//11
		System.out.println(n2);//11
	}

}







