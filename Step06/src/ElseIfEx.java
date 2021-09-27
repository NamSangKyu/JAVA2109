import java.util.Scanner;

public class ElseIfEx {

	public static void main(String[] args) {
		/*
		 * 조건문의 시작
		 * if(	 ){
		 * 
		 * }else if(	){ //두번째 조건문~n번째 조건문
		 * 	...
		 * }else{ //위에 조건문이 모두 거짓일떄 실행되는 실행문
		 * 
		 * }
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나 입력 : ");
		int n = sc.nextInt();
		if(n > 0) {
			System.out.println("입력하신 숫자는 양수입니다.");
		}
		else if(n == 0) {
			System.out.println("입력하신 숫자는 0 입니다.");
		}
		else {
			System.out.println("입력하신 숫자는 음수입니다.");
		}
	}

}






