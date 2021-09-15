import java.util.Scanner;

public class Quest2 {

	public static void main(String[] args) {
		/*
		 * 	숫자 두개를 입력 받은 후 
		 * 	입력받은 숫자가 저장된 변수가 n1, n2라고 가정했을때
		 * 	해당식의 결과를 출력
		 *  (n1 + 3) * (n2 - n1) / (n2 - 3) 의 결과를 출력
		 */
		Scanner sc = new Scanner(System.in);
		//정수형 변수 3개 선언
		int n1 = 0, n2 = 0, result = 0;
		//숫자 두개 입력
		System.out.print("숫자 입력>");
		n1 = sc.nextInt();
		System.out.print("숫자 입력>");
		n2 = sc.nextInt();
		//계산
		result = (n1+3) * (n2-n1) / (n2 - 3);
		//출력
		System.out.println(result);
	}

}
