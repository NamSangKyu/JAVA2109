import java.util.Scanner;

public class Quest01 {

	public static void main(String[] args) {
		/*
		 * 		숫자 두개를 입력 받아서
		 * 		입력 받은 두 숫자의 최대 공약수를 출력
		 */
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.print("숫자 입력 > ");
		n1=sc.nextInt();
		System.out.print("숫자 입력 > ");
		n2=sc.nextInt();
		
		if(n1 > n2) {
			//두 변수의 값을 교환
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		//최대 공약수 저장할 변수
		int gcd = 1;
		for(int i=1;i<=n1;i++) {
			if(n1 % i == 0 && n2 % i ==0)//둘다 나누어서 나머지가 없으면 공약수
				gcd = i;
		}
		System.out.println("두수의 최대 공약수 : "+gcd);
	}

}



