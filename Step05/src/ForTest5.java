import java.util.Scanner;

public class ForTest5 {

	public static void main(String[] args) {
		/*
		 * 	숫자 0을 입력할때까지 숫자를 입력 받고
		 * 	0을 입력하는 순간 입력을 멈추고
		 *  그동안 입력했던 숫자들의 총합을 출력
		 */
		Scanner sc = new Scanner(System.in);
		int num, total;
		//num = total = 0;//동시에 같은 값으로 초기화
		total = 0;
		num = -1;
		for(	;num != 0;	) {
			System.out.print("숫자 입력, 0 입력시 종료> ");
			num = sc.nextInt();
			total += num;
		}
		System.out.println("입력하신 숫자들의 총합 : "+total);
	}
}
