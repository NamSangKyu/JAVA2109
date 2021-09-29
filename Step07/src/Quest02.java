import java.util.Scanner;

public class Quest02 {

	public static void main(String[] args) {
		/*
		 * 	숫자 한개를 입력 받은 후
		 *  해당 숫자의 팩토리얼값을 출력
		 *  Factorial --> 5 입력시 1부터 5까지 곱한 결과 120
		 */
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("숫자 입력 > ");
		n=sc.nextInt();
		
		int fac = 1;
		//첫번째 방법
		/*
		 * for(int i=1;i<=n;i++){ 
		 * 		fac *= i; 
		 * }
		 */
		//두번째 방법
		while(n > 1) {
			fac *= n;
			n--;
		}
		System.out.println(fac);
		
		
	}

}





