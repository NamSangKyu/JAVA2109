package exception;

import java.util.Scanner;

public class ExceptionMain02 {
	//메서드
	//숫자 두개를 매개변수로 받아서 나눈 결과를 리턴하는 메서드
//	public static int division(int n1, int n2) {
//		int result = 0;
//		try {
//			result = n1 / n2;
//		}catch (ArithmeticException e) {
//			System.out.println("0으로 나눌수 없습니다.");
//		}
//		return result;
//	}
	public static int division(int n1, int n2) throws ArithmeticException {
		int result = 0;
		result = n1 / n2;
		return result;
	}
	public static void main(String[] args) {
		//숫자 두개 입력 받아서
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.print("숫자 입력 : ");
		n1 = sc.nextInt();
		System.out.print("숫자 입력 : ");
		n2 = sc.nextInt();
		
		//위에 만든 메서드를 호출해서 나눈 결과를 받고 출력
		try {
			int result = division(n1, n2);
			System.out.println(result);
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		}
	}

}





