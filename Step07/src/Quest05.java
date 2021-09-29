import java.util.Scanner;

public class Quest05 {

	public static void main(String[] args) {
		/*
		 * 숫자 하나를 입력 받아서 - 양수만 입력
		 * 입력 받은 숫자가 소수인지 아닌지 출력
		 * 
		 * 소수 : 약수 1과 자기자신인 숫자
		 */
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("숫자 입력 > ");
		n=sc.nextInt();
		
		int i;
		for(i=2;i<n;i++) {
			if(n % i == 0)
				break;
		}
		if(i == n)
			System.out.println("입력하신 숫자는 소수 입니다.");
		else
			System.out.println("입력하신 숫자는 소수가 아닙니다.");
		

	}	
}





