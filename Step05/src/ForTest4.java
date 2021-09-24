
public class ForTest4 {

	public static void main(String[] args) {
		/*
		 * 1~100까지 숫자의 합을 출력
		 * 1~100까지 합은 5050
		 */
		//정수형 변수 2개
		int n,total;
		//반복문 - 1~100까지 숫자가 나오는 반복문
		for(n=1,total=0;n<=100;n+=1) {
		//	    - 1~100까지 합
			total += n;
		}
		//결과 출력
		System.out.println("1~100까지의 합 : " + total);
	}

}
