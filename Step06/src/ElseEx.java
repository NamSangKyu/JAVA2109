import java.util.Scanner;

public class ElseEx {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나 입력 > ");
		int n = sc.nextInt();
		
		if(n % 2 == 1) {
			System.out.println("홀수");
		}else{//위에 있는 모든 조건문이 거짓일때 실행되는 영역
			System.out.println("짝수");
		}
	}

}
