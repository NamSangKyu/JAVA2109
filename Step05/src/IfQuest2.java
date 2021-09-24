import java.util.Scanner;

public class IfQuest2 {

	public static void main(String[] args) {
		/*
		 * 숫자 두개를 입력받아서
		 * 입력받는 숫자 두개의 뺄셈 결과가 무조건 양수가 나오게끔 연산
		 * 3 5 입력 --> 2
		 * 5 3 입력 --> 2
		 */
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.print("숫자 입력 > ");
		n1 = sc.nextInt();
		System.out.print("숫자 입력 > ");
		n2 = sc.nextInt();
		
		int result = n1 - n2;
		if(result < 0) {
			result = -result;
		}

		System.out.println(result);
	}

}


