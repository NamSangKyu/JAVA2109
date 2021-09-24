import java.util.Scanner;

public class IfQuest {

	public static void main(String[] args) {
		/*
		 * 숫자 하나를 입력 받아서
		 * 입력한 숫자가 짝수 인지 홀수 인지 출력
		 * 입력한 숫자 0이면 이것도 짝수로 처리
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나 입력 > ");
		int n = sc.nextInt();
		
		if(n % 2 == 1) {
			System.out.println("홀수");
		}
		if(n % 2 == 0) {
			System.out.println("짝수");
		}
	}

}
