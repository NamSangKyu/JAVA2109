import java.util.Scanner;

public class Quest04 {

	public static void main(String[] args) {
		/*
		 * 	출력할 피라미드 줄을 입력 > 7
		 * 				*			줄번호 1
		 * 			   ***			줄번호 2
		 * 			  *****			줄번호 3
		 *           *******		줄번호 4
		 *          *********		줄번호 5
		 * 		   ***********		줄번호 6
		 *        *************		줄번호 7
		 *        
		 *        공백의 개수, 별 개수, 줄 을 이용해서 데이터 패턴을 먼저 확인
		 */
		Scanner sc = new Scanner(System.in);
		int line;
		System.out.print("줄개수 입력 > ");
		line=sc.nextInt();
		
		for(int i=1;i<=line;i++) {
			//공백 출력
			for(int j=0;j<line-i;j++)
				System.out.print(" ");
			//* 출력
			for(int j=0;j<2*i-1;j++)
				System.out.print("*");
			System.out.println();
		}
	}

}










