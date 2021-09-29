import java.util.Scanner;

public class Quest03 {

	public static void main(String[] args) {
		/*
		 * 화폐 개수 프로그램
		 * 금액을 입력 받음 --> 10 이상 입력 --> 1의 자리 X
		 * 
		 *  금액 입력 : 97670
		 *  50000원 1개
		 *  10000원 4개
		 *   5000원 1개
		 *   1000원 2개
		 *    500원 1개
		 *    100원 1개
		 *     50원 1개
		 *     10원 2개
		 */
		Scanner sc = new Scanner(System.in);
		int money;
		System.out.print("금액 입력 > ");
		money=sc.nextInt();
		
		int m = 50000;
		boolean flag = true;//스위치 변수
		
		while(m>5) {
			System.out.println(m + "원 "+ money / m + "개");
			money %= m;
			if(flag)
				m /= 5;
			else
				m /= 2;
			flag = !flag;
		}
	}

}






