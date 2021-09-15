
public class WhileTest3 {

	public static void main(String[] args) {
		/*
		 * 1~100까지 숫자의 합을 출력
		 * 1~100까지 합은 5050
		 */
		//정수형 변수 2개
		int n=1, total = 0;
		//반복문 - 1~100까지 숫자가 나오는 반복문
		while(n<=100) {
		//	    - 1~100까지 합
			total += n;
			n++;
		}
		//결과 출력
		System.out.println("1~100까지의 합 : " + total);
	}

}


